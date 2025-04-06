package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hello.service.SinhvienService;
import com.hello.service.TotNghiepService;


@Controller
@RequestMapping("/")
public class Home {
	

	private SinhvienService sinhvienService;
	private TotNghiepService totNghiepService;
	
	public Home(SinhvienService sinhvienService, TotNghiepService totNghiepService) {
		super();
		this.sinhvienService = sinhvienService;
		this.totNghiepService = totNghiepService;
	}
	
	
	@GetMapping
    public String home() {
		
        return "redirect:/sv"; 
        
    }
	
	
	
	@GetMapping("/sv/search_sv")
	public String searchSinhVien(
		    @RequestParam(name = "keyword", required = false) String keyword,
		    Model model) {
	    if (keyword != null && !keyword.isEmpty()) {
	        model.addAttribute("sinhviens", sinhvienService.searchSinhVien(keyword));
	        
	    } else {
	        model.addAttribute("sinhviens", sinhvienService.getAllSinhViens());
	        
	    }
	    
		model.addAttribute("contentPage", "/WEB-INF/views/search.jsp");

//	    return "/search";
	    return "/layout/layout"; 

	}



}
