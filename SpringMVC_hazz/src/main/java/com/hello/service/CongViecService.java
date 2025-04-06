package com.hello.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.entity.CongViec;
import com.hello.repository.CongviecRepository;
import com.hello.repository.NganhRepository;
import com.hello.repository.TotNghiepRepository;

import jakarta.transaction.Transactional;

@Service
public class CongViecService {
	
	private CongviecRepository congviecRepository;
	private TotNghiepRepository totNghiepRepository;
	private NganhRepository nganhRepository;


	
	public CongViecService(CongviecRepository congviecRepository, TotNghiepRepository totNghiepRepository,
			NganhRepository nganhRepository) {
		super();
		this.congviecRepository = congviecRepository;
		this.totNghiepRepository = totNghiepRepository;
		this.nganhRepository = nganhRepository;
	}
	
	public List<CongViec> getAllCongViecs() {
		// TODO Auto-generated method stub
		return congviecRepository.findAll();
	}

	public CongViec saveCongviec(CongViec congViec) {
		// TODO Auto-generated method stub
		return congviecRepository.save(congViec);
	}
	
	

	 public CongViec getBymaCongViec(Long soCMND) {
	        return congviecRepository.findBySoCMND(soCMND);
	    }
	 
	 public CongViec updateCongViec(CongViec congviec) {
			// TODO Auto-generated method stub
			return congviecRepository.save(congviec);
		}
	
	   @Transactional
			public void deleteCongviecbyId(Long soCMND) {
				totNghiepRepository.deleteBySoCMND(soCMND);
				congviecRepository.deleteBySoCMND(soCMND);
//				nganhRepository.dele(soCMND);
			}
	 
}