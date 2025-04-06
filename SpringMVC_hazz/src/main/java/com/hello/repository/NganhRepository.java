package com.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.entity.Nganh;


@Repository
public interface NganhRepository extends JpaRepository<Nganh,String>{
	    Nganh findByMaNganh(String maNganh); 
//	    void deleteByMaNganh(Long maNganh);
}
