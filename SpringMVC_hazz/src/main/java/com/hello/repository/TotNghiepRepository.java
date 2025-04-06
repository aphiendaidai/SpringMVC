package com.hello.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.entity.TotNghiep;


@Repository
public interface TotNghiepRepository extends JpaRepository<TotNghiep, TotNghiep.TotNghiepId> {
	List<TotNghiep> findByHeTNContainingOrLoaiTNContaining(String keyword, String loaiTN);
    void deleteBySoCMND(Long soCMND);  // Chú ý tên field nên là soCMND thay vì soCMDN

}
