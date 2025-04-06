package com.hello.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TRUONG")
public class Truong {
    @Id
    @Column(name = "MaTruong")
    private String maTruong;

    private String tenTruong;
    private String diaChi;
    private String soDT;
	public Truong() {
		super();
	}
	public Truong(String maTruong, String tenTruong, String diaChi, String soDT) {
		super();
		this.maTruong = maTruong;
		this.tenTruong = tenTruong;
		this.diaChi = diaChi;
		this.soDT = soDT;
	}
	public String getMaTruong() {
		return maTruong;
	}
	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}
	public String getTenTruong() {
		return tenTruong;
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

    // Getters and Setters
}
