package com.hello.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.entity.Nganh;
import com.hello.repository.NganhRepository;


@Service
public class NganhService {
	private NganhRepository nganhRepository;
	
	public NganhService(NganhRepository nganhRepository) {
		super();
		this.nganhRepository = nganhRepository;
	}



	public List<Nganh> getAllNganhs() {
		// TODO Auto-generated method stub
		return nganhRepository.findAll();
	}



	public Nganh saveNganh(Nganh nganh) {
		// TODO Auto-generated method stub
		return nganhRepository.save(nganh);
	}
	
	public void deleteStudentById(String id) {
		// TODO Auto-generated method stub
		nganhRepository.deleteById(id);
	}
	
	 public Nganh getBymaNganh(String maNganh) {
	        return nganhRepository.findByMaNganh(maNganh);
	    }
	 
	 public Nganh updateNganh(Nganh nganh) {
			// TODO Auto-generated method stub
			return nganhRepository.save(nganh);
		}

}

