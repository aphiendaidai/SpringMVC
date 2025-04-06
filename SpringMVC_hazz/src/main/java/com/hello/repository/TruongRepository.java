package com.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.entity.Truong;


@Repository
public interface TruongRepository extends JpaRepository<Truong, String>{
	Truong findByMaTruong(String maTruong);
}
