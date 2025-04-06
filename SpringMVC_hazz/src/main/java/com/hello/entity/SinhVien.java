package com.hello.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SINHVIEN")
public class SinhVien {
    @Id
    @Column(name = "SoCMND")
    private Long soCMND;

    private String hoTen;
    private String email;
    private String soDT;
    private String diaChi;
	public SinhVien() {
		super();
	}
	public SinhVien(Long soCMND, String hoTen, String email, String soDT, String diaChi) {
		super();
		this.soCMND = soCMND;
		this.hoTen = hoTen;
		this.email = email;
		this.soDT = soDT;
		this.diaChi = diaChi;
	}
	public Long getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(Long soCMND) {
		this.soCMND = soCMND;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
    
    

    // Getters and Setters
}

