package com.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.entity.CongViec;


@Repository
public interface CongviecRepository extends JpaRepository<CongViec, CongViec.CongViecId> {
	
    void deleteBySoCMND(Long soCMND);  // Chú ý tên field nên là soCMND thay vì soCMDN
    
    CongViec findBySoCMND(Long soCMND);
}
