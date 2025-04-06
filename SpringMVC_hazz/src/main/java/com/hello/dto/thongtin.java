package com.hello.dto;


import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

public class thongtin {
	 @NotNull(message = "Số CMND không được để trống")
	    private Long soCMND;

	    @NotNull(message = "Họ tên không được để trống")
	    @Size(min = 2, max = 50, message = "Tên phải từ 2 đến 50 ký tự")
	    private String hoTen;

	    @NotNull(message = "Email không được để trống")
	    @Email(message = "Email không hợp lệ")
	    private String email;

	    @NotNull(message = "Số điện thoại không được để trống")
	    private String soDT;

	    @NotNull(message = "Địa chỉ không được để trống")
	    private String diaChi;

	    @NotNull(message = "Mã trường không được để trống")
	    private String maTruong;

	    @NotNull(message = "Mã ngành không được để trống")
	    private String maNganh;

	    @NotNull(message = "Hệ tốt nghiệp không được để trống")
	    private String heTN;

	    @NotNull(message = "Ngày tốt nghiệp không được để trống")
	    @PastOrPresent(message = "Ngày tốt nghiệp không thể ở tương lai")
	    private LocalDate ngayTN;

	    @NotNull(message = "Loại tốt nghiệp không được để trống")
	    private String loaiTN;

		public thongtin() {
		}

		public thongtin(@NotNull(message = "Số CMND không được để trống") Long soCMND,
				@NotNull(message = "Họ tên không được để trống") @Size(min = 2, max = 50, message = "Tên phải từ 2 đến 50 ký tự") String hoTen,
				@NotNull(message = "Email không được để trống") @Email(message = "Email không hợp lệ") String email,
				@NotNull(message = "Số điện thoại không được để trống") String soDT,
				@NotNull(message = "Địa chỉ không được để trống") String diaChi,
				@NotNull(message = "Mã trường không được để trống") String maTruong,
				@NotNull(message = "Mã ngành không được để trống") String maNganh,
				@NotNull(message = "Hệ tốt nghiệp không được để trống") String heTN,
				@NotNull(message = "Ngày tốt nghiệp không được để trống") @PastOrPresent(message = "Ngày tốt nghiệp không thể ở tương lai") LocalDate ngayTN,
				@NotNull(message = "Loại tốt nghiệp không được để trống") String loaiTN) {
			super();
			this.soCMND = soCMND;
			this.hoTen = hoTen;
			this.email = email;
			this.soDT = soDT;
			this.diaChi = diaChi;
			this.maTruong = maTruong;
			this.maNganh = maNganh;
			this.heTN = heTN;
			this.ngayTN = ngayTN;
			this.loaiTN = loaiTN;
		}



		public Long getSoCMND() {
			return soCMND;
		}

		public void setSoCMND(@NotNull(message = "Số CMND không được để trống") Long soCMND) {
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

		public String getMaTruong() {
			return maTruong;
		}

		public void setMaTruong(String maTruong) {
			this.maTruong = maTruong;
		}

		public String getMaNganh() {
			return maNganh;
		}

		public void setMaNganh(String maNganh) {
			this.maNganh = maNganh;
		}

		public String getHeTN() {
			return heTN;
		}

		public void setHeTN(String heTN) {
			this.heTN = heTN;
		}

		public LocalDate getNgayTN() {
			return ngayTN;
		}

		public void setNgayTN(LocalDate ngayTN) {
			this.ngayTN = ngayTN;
		}

		public String getLoaiTN() {
			return loaiTN;
		}

		public void setLoaiTN(String loaiTN) {
			this.loaiTN = loaiTN;
		}

}
