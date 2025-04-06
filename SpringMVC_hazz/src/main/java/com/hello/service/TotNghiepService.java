package com.hello.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.entity.TotNghiep;
import com.hello.repository.TotNghiepRepository;


@Service
public class TotNghiepService {
 private TotNghiepRepository totNghiepRepository;
 
	public TotNghiepService(TotNghiepRepository totNghiepRepository) {
	super();
	this.totNghiepRepository = totNghiepRepository;
}

	public List<TotNghiep> getAllTotNghieps() {
		// TODO Auto-generated method stub
		return totNghiepRepository.findAll();
	}

	public TotNghiep saveTotNghiep(TotNghiep totnghiep) {
		// TODO Auto-generated method stub
		return totNghiepRepository.save(totnghiep);
	}
	
    public List<TotNghiep> searchTotNghiep(String keyword) {
        return totNghiepRepository.findByHeTNContainingOrLoaiTNContaining(keyword, keyword);
    }
    

	
}
