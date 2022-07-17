package models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import entities.ChiTietNhap;
import entities.HoaDon;
import entities.NhanVien;

public class NhapModel {
	private int stt;
	private int maNhap;
	private String ghiChu;
	private Date ngayNhap;
	private String tinhTrang;
	private NhanVien nhanVien;
	private String maNV;
	private Set<ChiTietNhap> listChiTietNhap = new HashSet<ChiTietNhap>();
	public NhapModel(int stt, int maNhap, String ghiChu, Date ngayNhap, String tinhTrang, NhanVien nhanVien,
			String maNV, Set<ChiTietNhap> listChiTietNhap) {
		this.stt = stt;
		this.maNhap = maNhap;
		this.ghiChu = ghiChu;
		this.ngayNhap = ngayNhap;
		this.tinhTrang = tinhTrang;
		this.nhanVien = nhanVien;
		this.maNV = maNV;
		this.listChiTietNhap = listChiTietNhap;
	}
	public NhapModel() {
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public int getMaNhap() {
		return maNhap;
	}
	public void setMaNhap(int maNhap) {
		this.maNhap = maNhap;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public Set<ChiTietNhap> getListChiTietNhap() {
		return listChiTietNhap;
	}
	public void setListChiTietNhap(Set<ChiTietNhap> listChiTietNhap) {
		this.listChiTietNhap = listChiTietNhap;
	}
	
	@Override
	public String toString() {
		return "NhapModel [stt=" + stt + ", maNhap=" + maNhap + ", ghiChu=" + ghiChu + ", ngayNhap=" + ngayNhap
				+ ", tinhTrang=" + tinhTrang + ", nhanVien=" + nhanVien + ", maNV=" + maNV + ", listChiTietNhap="
				+ listChiTietNhap + "]";
	}

	
	
	
}
