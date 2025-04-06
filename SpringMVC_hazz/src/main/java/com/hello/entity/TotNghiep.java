package com.hello.entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

@Entity
@Table(name = "TOT_NGHIEP")
@IdClass(TotNghiep.TotNghiepId.class)
public class TotNghiep {
	  @Id
	    @Column(name = "SoCMND")
	    @NotNull(message = "Số CMND không được để trống")
	    private Long soCMND;

	    @Id
	    @Column(name = "MaTruong")
	    @NotNull(message = "Mã trường không được để trống")
	    private String maTruong;

	    @Id
	    @Column(name = "MaNganh")
	    @NotNull(message = "Mã ngành không được để trống")
	    private String maNganh;

	    // Các trường khác giữ nguyên
	    private String heTN;
	    @PastOrPresent(message = "Ngày tốt nghiệp không thể ở tương lai")
	    private LocalDate ngayTN;
	    private String loaiTN;
	    
	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "SoCMND", referencedColumnName = "SoCMND", insertable = false, updatable = false)
    private SinhVien sinhVien;

	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "MaTruong", referencedColumnName = "MaTruong", insertable = false, updatable = false)
    private Truong truong;

	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "MaNganh", referencedColumnName = "MaNganh", insertable = false, updatable = false)
    private Nganh nganh;

    
    public TotNghiep() {
	}



	public TotNghiep(@NotNull(message = "Số CMND không được để trống") Long soCMND, String maTruong, String maNganh, String heTN, LocalDate ngayTN, String loaiTN,
			SinhVien sinhVien, Truong truong, Nganh nganh) {
		super();
		this.soCMND = soCMND;
		this.maTruong = maTruong;
		this.maNganh = maNganh;
		this.heTN = heTN;
		this.ngayTN = ngayTN;
		this.loaiTN = loaiTN;
		this.sinhVien = sinhVien;
		this.truong = truong;
		this.nganh = nganh;
	}



	public @NotNull(message = "Số CMND không được để trống") Long getSoCMND() {
		return soCMND;
	}



	public void setSoCMND(@NotNull(message = "Số CMND không được để trống") Long soCMND) {
		this.soCMND = soCMND;
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



	public SinhVien getSinhVien() {
		return sinhVien;
	}



	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}



	public Truong getTruong() {
		return truong;
	}



	public void setTruong(Truong truong) {
		this.truong = truong;
	}



	public Nganh getNganh() {
		return nganh;
	}



	public void setNganh(Nganh nganh) {
		this.nganh = nganh;
	}

	
	
	public static class TotNghiepId implements Serializable {
        private Long soCMND;
        private String maTruong;
        private String maNganh;
        
        
		public TotNghiepId() {
		}
		public TotNghiepId(Long soCMND, String maTruong, String maNganh) {
			super();
			this.soCMND = soCMND;
			this.maTruong = maTruong;
			this.maNganh = maNganh;
		}
		@Override
		public int hashCode() {
			return Objects.hash(maNganh, maTruong, soCMND);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TotNghiepId other = (TotNghiepId) obj;
			return Objects.equals(maNganh, other.maNganh) && Objects.equals(maTruong, other.maTruong)
					&& Objects.equals(soCMND, other.soCMND);
		}
        
        
    }
}
