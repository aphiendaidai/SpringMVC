package com.hello.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.entity.SinhVien;
import com.hello.repository.CongviecRepository;
import com.hello.repository.SinhvienRepository;
import com.hello.repository.TotNghiepRepository;

import jakarta.transaction.Transactional;

@Service
public class SinhvienService {
	private SinhvienRepository sinhvienRepository;
	private CongviecRepository congviecRepository;
	private TotNghiepRepository totNghiepRepository;
	
	public SinhvienService(SinhvienRepository sinhvienRepository, CongviecRepository congviecRepository,
			TotNghiepRepository totNghiepRepository) {
		super();
		this.sinhvienRepository = sinhvienRepository;
		this.congviecRepository = congviecRepository;
		this.totNghiepRepository = totNghiepRepository;
	}

	public List<SinhVien> getAllSinhViens() {
		// TODO Auto-generated method stub
		return sinhvienRepository.findAll();
	}

	public SinhVien saveSinhVien(SinhVien sinhVien) {
		// TODO Auto-generated method stub
		return sinhvienRepository.save(sinhVien);
	}
	
	
	 public boolean existsBySoCMND(Long soCMND) {
	        return sinhvienRepository.existsById(soCMND);
	    }
	 
	 public List<SinhVien> searchSinhVien(String keyword) {
		    return sinhvienRepository.findByEmailContainingOrHoTenContaining(keyword, keyword);
		}
	 public SinhVien getBysoCMND(Long soCMND) {
	        return sinhvienRepository.findBySoCMND(soCMND);
	    }
		public SinhVien updateStudent(SinhVien sinhVien) {
			// TODO Auto-generated method stub
			return sinhvienRepository.save(sinhVien);
		}
		
		
	    @Transactional
		public void deleteStudentById(Long soCMND) {
			totNghiepRepository.deleteBySoCMND(soCMND);
			congviecRepository.deleteBySoCMND(soCMND);
			sinhvienRepository.deleteById(soCMND);
		}

}
