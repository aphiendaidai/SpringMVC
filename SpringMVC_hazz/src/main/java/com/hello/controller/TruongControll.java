package com.hello.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.entity.Truong;
import com.hello.service.TruongService;


@Controller
@RequestMapping("/truong")
public class TruongControll {
	
	private TruongService truongService;

	public TruongControll(TruongService truongService) {
		super();
		this.truongService = truongService;
	}
	
	@GetMapping
	public String listTruong(Model model) {
		model.addAttribute("truong", truongService.getAllTruongs() );
		model.addAttribute("contentPage", "/WEB-INF/views/truong/truong.jsp");

//		return "/truong/truong";
	    return "/layout/layout"; 

	}
	
	@GetMapping("/news")
	public String creatStudent(Model model) {
		Truong truong= new Truong();
		model.addAttribute("truongs", truong);
		model.addAttribute("contentPage", "/WEB-INF/views/truong/create.jsp");

//		return "/truong/create";
	    return "/layout/layout"; 

	}
	
	@PostMapping
	public String saveTruong(@ModelAttribute("truongs") Truong truong ) {
		//TODO: process POST request
		truongService.saveSinhVien(truong);
		System.out.println("da luu: "+ truong);
		return "redirect:/truong";	
		}
	
	
	@GetMapping("/{maTruong}")
	public String deleteStudent(@PathVariable("maTruong") String maTruong) {
		truongService.deleteStudentById(maTruong);
		return "redirect:/truong";
	}	
	
	@GetMapping("/edit/{maTruong}")
	public String editform(@PathVariable("maTruong") String maTruong, Model model) {
		Truong truong = truongService.getBymatruong(maTruong);
		
		 if (truong == null) {
		        return "redirect:/truong"; // Hoặc chuyển hướng về trang danh sách sinh viên
		    }
		   model.addAttribute("truong", truong);		 
			model.addAttribute("contentPage", "/WEB-INF/views/truong/edit_truong.jsp");

//			return "/truong/edit_truong";
		    return "/layout/layout"; 

	}	
	
	@PostMapping("/edit/{maTruong}")
	public String updateTruong(@PathVariable("maTruong") String maTruong,
			@ModelAttribute("truong") Truong truong,
			Model model) {
		Truong extruong = truongService.getBymatruong(maTruong);
		extruong.setMaTruong(truong.getMaTruong());
		extruong.setTenTruong(truong.getTenTruong());
		extruong.setDiaChi(truong.getDiaChi());
		extruong.setSoDT(truong.getSoDT());


		// save updated student object
		truongService.update(extruong);
		return "redirect:/truong";		
	}
	
}
