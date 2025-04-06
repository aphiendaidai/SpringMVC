package com.hello.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.entity.Nganh;
import com.hello.service.NganhService;


@Controller
@RequestMapping("/nganh")
public class NganhControll {
	private NganhService nganhService;

	public NganhControll(NganhService nganhService) {
		super();
		this.nganhService = nganhService;
	}

	@GetMapping
	public String listNganh(Model model) {
		model.addAttribute("nganh", nganhService.getAllNganhs());
		model.addAttribute("contentPage", "/WEB-INF/views/nganh/nganh.jsp");

//		return "/nganh/nganh";
	    return "/layout/layout"; 

	}

	@GetMapping("/news")
	public String creatNganh(Model model) {
		Nganh nganh = new Nganh();
		model.addAttribute("nganhs", nganh);
		model.addAttribute("contentPage", "/WEB-INF/views/nganh/create.jsp");

//		return "/nganh/create";
	    return "/layout/layout"; 

	}

	@PostMapping
	public String saveNganh(@ModelAttribute("nganhs") Nganh nganh) {
		// TODO: process POST request
		nganhService.saveNganh(nganh);
		System.out.println("da luu: " + nganh);
		return "redirect:/nganh";
	}
	
	
	@GetMapping("/{maNganh}")
	public String deleteStudent(@PathVariable("maNganh") String maNganh) {
		nganhService.deleteStudentById(maNganh);
		return "redirect:/nganh";
	}	
	
	@GetMapping("/edit/{maNganh}")
	public String editStudentForm(@PathVariable("maNganh") String maNganh, Model model) {
	    Nganh nganh = nganhService.getBymaNganh(maNganh);
	    if (nganh == null) {
	        return "redirect:/nganh"; // Hoặc chuyển hướng về trang danh sách sinh viên
	    }
	    model.addAttribute("nganh", nganh);
		model.addAttribute("contentPage", "/WEB-INF/views/nganh/edit_nganh.jsp");

//	    return "/nganh/edit_nganh";
	    return "/layout/layout"; 

	}
	
	@PostMapping("/edit/{maNganh}")
	public String updateStudent(@PathVariable("maNganh") String maNganh,
			@ModelAttribute("nganh") Nganh nganh,
			Model model) {
		Nganh exnganh = nganhService.getBymaNganh(maNganh);
		exnganh.setMaNganh(maNganh);
		exnganh.setTenNganh(nganh.getTenNganh());
		exnganh.setLoaiNganh(nganh.getLoaiNganh());
	
		// save updated student object
		nganhService.updateNganh(exnganh);
		return "redirect:/nganh";		
	}
	


}
