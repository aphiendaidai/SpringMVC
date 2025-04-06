package com.hello.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.entity.SinhVien;


@Repository
public interface SinhvienRepository  extends JpaRepository<SinhVien, Long> {
    SinhVien findBySoCMND(Long soCMND);
   List<SinhVien> findByEmailContainingOrHoTenContaining(String soCMND, String hoTen);

} 
