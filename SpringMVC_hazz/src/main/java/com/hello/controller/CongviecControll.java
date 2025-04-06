	package com.hello.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.entity.CongViec;
import com.hello.service.CongViecService;
import com.hello.service.NganhService;
import com.hello.service.SinhvienService;


@Controller
@RequestMapping("/congviec")
public class CongviecControll {
	private CongViecService congViecService;
    private SinhvienService sinhvienService;
    private NganhService nganhService;
	public CongviecControll(CongViecService congViecService, SinhvienService sinhvienService,
			NganhService nganhService) {
		super();
		this.congViecService = congViecService;
		this.sinhvienService = sinhvienService;
		this.nganhService = nganhService;
	}
    
	@GetMapping
public String listStuden(Model model) {
	model.addAttribute("congviec", congViecService.getAllCongViecs());
	model.addAttribute("contentPage", "/WEB-INF/views/congviec/congviec.jsp");

//	return "/congviec/congviec";
    return "/layout/layout"; 

}


@GetMapping("/news")
public String creatStudent(Model model) {
	CongViec congviec= new CongViec();
	model.addAttribute("congviecs", congviec);
	model.addAttribute("sinhVien", sinhvienService.getAllSinhViens());
    model.addAttribute("nganh", nganhService.getAllNganhs());
	model.addAttribute("contentPage", "/WEB-INF/views/congviec/create.jsp");

//	return "/congviec/create";
    return "/layout/layout"; 

}

@PostMapping
public String saveStudent(@ModelAttribute("congviecs") CongViec congviec ) {
	//TODO: process POST request
	congViecService.saveCongviec(congviec);
	System.out.println("da luu: "+ congviec);
	return "redirect:/congviec";	
	}

	
@GetMapping("/edit/{soCMND}")
public String editStudentForm(@PathVariable("soCMND") Long soCMND, Model model) {
    CongViec congViec= congViecService.getBymaCongViec(soCMND);
	model.addAttribute("sinhVien", sinhvienService.getAllSinhViens());
    model.addAttribute("nganh", nganhService.getAllNganhs());
    if (soCMND == null) {
        return "redirect:/congviec"; // Hoặc chuyển hướng về trang danh sách sinh viên
    }
    model.addAttribute("congviec", congViec);
	model.addAttribute("contentPage", "/WEB-INF/views/congviec/edit_congviec.jsp");

//    return "/congviec/edit_congviec";
    return "/layout/layout"; 

}

@PostMapping("/edit/{soCMND}")
public String updateCongviec(@PathVariable("soCMND")  Long soCMND,
		@ModelAttribute("soCMND") CongViec congViec,
		Model model) {
	CongViec excongCongViec = congViecService.getBymaCongViec(soCMND);
	
	excongCongViec.setSoCMND(soCMND);
	excongCongViec.setNgayVaoCongTy(congViec.getNgayVaoCongTy());
	excongCongViec.setMaNganh(congViec.getMaNganh());
	excongCongViec.setTenCongViec(congViec.getTenCongViec());
	excongCongViec.setTenCongTy(congViec.getDiaChiCongTy());
	excongCongViec.setDiaChiCongTy(congViec.getDiaChiCongTy());
	excongCongViec.setThoiGianLamViec(congViec.getThoiGianLamViec());

	// save updated student object
	congViecService.updateCongViec(excongCongViec);
	return "redirect:/congviec";		
}


@GetMapping("/{soCMND}")
public String deleteStudent(@PathVariable Long soCMND) {
	congViecService.deleteCongviecbyId(soCMND);
	return "redirect:/congviec";
}	



}
