package com.hello.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.dto.thongtin;
import com.hello.entity.SinhVien;
import com.hello.entity.TotNghiep;
import com.hello.service.CongViecService;
import com.hello.service.NganhService;
import com.hello.service.SinhvienService;
import com.hello.service.TotNghiepService;
import com.hello.service.TruongService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/sv")
public class SinhvienControll {
	@Autowired
	private SinhvienService sinhvienService;
	@Autowired
	private NganhService nganhService;
	@Autowired
	private TruongService truongService;
	@Autowired
	private TotNghiepService totNghiepService;
	@Autowired
    private CongViecService congViecService;
	
	
	public SinhvienControll() {
		super();
	}


	public SinhvienControll(SinhvienService sinhvienService, NganhService nganhService, TruongService truongService,
			TotNghiepService totNghiepService, CongViecService congViecService) {
		super();
		this.sinhvienService = sinhvienService;
		this.nganhService = nganhService;
		this.truongService = truongService;
		this.totNghiepService = totNghiepService;
		this.congViecService = congViecService;
	}


	@GetMapping
	public String listStuden(Model model) {
		model.addAttribute("totnghiep", totNghiepService.getAllTotNghieps() );
	    model.addAttribute("contentPage", "/WEB-INF/views/sinhvien/sinhvien.jsp");

//		return "/sinhvien/sinhvien";
	    return "/layout/layout"; 
	}
	
	@GetMapping("/news")
	public String showThongtinForm(Model model) {
	    model.addAttribute("thongtinForm", new thongtin());
	    model.addAttribute("truong", truongService.getAllTruongs());
	    model.addAttribute("nganh", nganhService.getAllNganhs());
	    model.addAttribute("contentPage", "/WEB-INF/views/sinhvien/create.jsp");

//	    return "/sinhvien/create";
	    return "/layout/layout"; 

	}
	
	@PostMapping
	public String saveGraduation(@Valid @ModelAttribute("thongtinForm") thongtin form, 
            BindingResult result, Model model) {
		  if (result.hasErrors()) {
		        model.addAttribute("truong", truongService.getAllTruongs());
		        model.addAttribute("nganh", nganhService.getAllNganhs());
		        return "/sinhvien/create";
		    }
		  
		// Kiểm tra xem sinh viên đã tồn tại chưa
		    if (!sinhvienService.existsBySoCMND(form.getSoCMND())) {
		        // Lưu sinh viên mới
		        SinhVien sinhVien = new SinhVien();
		        sinhVien.setSoCMND(form.getSoCMND());
		        sinhVien.setHoTen(form.getHoTen());
		        sinhVien.setEmail(form.getEmail());
		        sinhVien.setSoDT(form.getSoDT());
		        sinhVien.setDiaChi(form.getDiaChi());
		        sinhvienService.saveSinhVien(sinhVien);
		    }

		    // Lưu thông tin tốt nghiệp
		    TotNghiep totNghiep = new TotNghiep();
		    totNghiep.setSoCMND(form.getSoCMND());
		    totNghiep.setMaTruong(form.getMaTruong());
		    totNghiep.setMaNganh(form.getMaNganh());
		    totNghiep.setHeTN(form.getHeTN());
		    totNghiep.setNgayTN(form.getNgayTN());
		    totNghiep.setLoaiTN(form.getLoaiTN());
		    totNghiepService.saveTotNghiep(totNghiep);

		    return "redirect:/sv";
	}
	
	
	@GetMapping("/edit/{soCMND}")
	public String editStudentForm(@PathVariable("soCMND")  Long soCMND, Model model) {
	    SinhVien sinhvien = sinhvienService.getBysoCMND(soCMND);
	    if (sinhvien == null) {
	        return "redirect:/sv"; // Hoặc chuyển hướng về trang danh sách sinh viên
	    }
	    model.addAttribute("sinhvien", sinhvien);
	    model.addAttribute("contentPage", "/WEB-INF/views/sinhvien/edit_sv.jsp");

//	    return "/sinhvien/edit_sv";
	    return "/layout/layout"; 

	}
	
	@PostMapping("/edit/{soCMND}")
	public String updateStudent(@PathVariable("soCMND")  Long soCMND,
			@ModelAttribute("sinhvien") SinhVien sinhVien,
			Model model) {
		SinhVien existingStudent = sinhvienService.getBysoCMND(soCMND);
		existingStudent.setSoCMND(soCMND);
		existingStudent.setHoTen(sinhVien.getHoTen());
		existingStudent.setEmail(sinhVien.getEmail());
		existingStudent.setDiaChi(sinhVien.getDiaChi());
		existingStudent.setSoDT(sinhVien.getSoDT());

		// save updated student object
		sinhvienService.updateStudent(existingStudent);
		return "redirect:/sv";		
	}

	@GetMapping("/{soCMND}")
	public String deleteStudent(@PathVariable("soCMND")  Long soCMND) {
		sinhvienService.deleteStudentById(soCMND);
		return "redirect:/sv";
	}	
	

}
