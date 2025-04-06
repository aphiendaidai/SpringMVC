package com.hello.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.entity.Truong;
import com.hello.repository.TruongRepository;


@Service
public class TruongService {
 private final TruongRepository truongRepository;
 
	public TruongService(TruongRepository truongRepository) {
	super();
	this.truongRepository = truongRepository;
}

	public List<Truong> getAllTruongs() {
		// TODO Auto-generated method stub
		return truongRepository.findAll();
	}

	public Truong saveSinhVien(Truong truong) {
		// TODO Auto-generated method stub
		return truongRepository.save(truong);
	}
	
	public void deleteStudentById(String id) {
		// TODO Auto-generated method stub
		truongRepository.deleteById(id);
	}
	
	 public Truong getBymatruong(String maTruong) {
	        return truongRepository.findByMaTruong(maTruong);
	    }
	 
	 public Truong update(Truong truong) {
			// TODO Auto-generated method stub
			return truongRepository.save(truong);
		}
	
}
