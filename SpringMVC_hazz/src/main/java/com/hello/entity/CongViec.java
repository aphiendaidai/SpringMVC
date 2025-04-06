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


@Entity
@Table(name = "CONG_VIEC")
@IdClass(CongViec.CongViecId.class)
public class CongViec {
    @Id
    @Column(name = "SoCMND")
    private Long soCMND;

    @Id
    @Column(name = "NgayVaoCongTy")
    private LocalDate ngayVaoCongTy;

    @Column(name = "MaNganh")
    private String maNganh;

    private String tenCongViec;
    private String tenCongTy;
    private String diaChiCongTy;
    private String thoiGianLamViec;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SoCMND", referencedColumnName = "SoCMND", insertable = false, updatable = false)
    private SinhVien sinhVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaNganh", referencedColumnName = "MaNganh", insertable = false, updatable = false)
    private Nganh nganh;

    
    public CongViec() {
		super();
	}
    


	public CongViec(Long soCMND, LocalDate ngayVaoCongTy, String maNganh, String tenCongViec, String tenCongTy,
			String diaChiCongTy, String thoiGianLamViec, SinhVien sinhVien, Nganh nganh) {
		super();
		this.soCMND = soCMND;
		this.ngayVaoCongTy = ngayVaoCongTy;
		this.maNganh = maNganh;
		this.tenCongViec = tenCongViec;
		this.tenCongTy = tenCongTy;
		this.diaChiCongTy = diaChiCongTy;
		this.thoiGianLamViec = thoiGianLamViec;
		this.sinhVien = sinhVien;
		this.nganh = nganh;
	}



	public Long getSoCMND() {
		return soCMND;
	}



	public void setSoCMND(Long soCMND) {
		this.soCMND = soCMND;
	}



	public LocalDate getNgayVaoCongTy() {
		return ngayVaoCongTy;
	}



	public void setNgayVaoCongTy(LocalDate ngayVaoCongTy) {
		this.ngayVaoCongTy = ngayVaoCongTy;
	}



	public String getMaNganh() {
		return maNganh;
	}



	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}



	public String getTenCongViec() {
		return tenCongViec;
	}



	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}



	public String getTenCongTy() {
		return tenCongTy;
	}



	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}



	public String getDiaChiCongTy() {
		return diaChiCongTy;
	}



	public void setDiaChiCongTy(String diaChiCongTy) {
		this.diaChiCongTy = diaChiCongTy;
	}



	public String getThoiGianLamViec() {
		return thoiGianLamViec;
	}



	public void setThoiGianLamViec(String thoiGianLamViec) {
		this.thoiGianLamViec = thoiGianLamViec;
	}



	public SinhVien getSinhVien() {
		return sinhVien;
	}



	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}



	public Nganh getNganh() {
		return nganh;
	}



	public void setNganh(Nganh nganh) {
		this.nganh = nganh;
	}

	public static class CongViecId implements Serializable {
        private Long soCMND;
        private LocalDate  ngayVaoCongTy;
        
        
		public CongViecId() {}
		public CongViecId(Long soCMND, LocalDate ngayVaoCongTy) {
			super();
			this.soCMND = soCMND;
			this.ngayVaoCongTy = ngayVaoCongTy;
		}
		@Override
		public int hashCode() {
			return Objects.hash(ngayVaoCongTy, soCMND);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CongViecId other = (CongViecId) obj;
			return Objects.equals(ngayVaoCongTy, other.ngayVaoCongTy) && Objects.equals(soCMND, other.soCMND);
		}
        
    }

}
