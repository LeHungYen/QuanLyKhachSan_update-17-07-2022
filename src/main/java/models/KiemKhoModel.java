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

import entities.KiemKhoChiTiet;
import entities.NhanVien;

public class KiemKhoModel {
	private int stt;
	private int maKiemKho;
	private Date ngayKiemKho;
	private NhanVien nhanVien;
	private String maNV;
	private Set<KiemKhoChiTiet> listKiemKhoChiTiet = new HashSet<KiemKhoChiTiet>();
	
	public KiemKhoModel(int stt, int maKiemKho, Date ngayKiemKho, NhanVien nhanVien, String maNV,
			Set<KiemKhoChiTiet> listKiemKhoChiTiet) {
		this.stt = stt;
		this.maKiemKho = maKiemKho;
		this.ngayKiemKho = ngayKiemKho;
		this.nhanVien = nhanVien;
		this.maNV = maNV;
		this.listKiemKhoChiTiet = listKiemKhoChiTiet;
	}
	public KiemKhoModel() {
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public int getMaKiemKho() {
		return maKiemKho;
	}
	public void setMaKiemKho(int maKiemKho) {
		this.maKiemKho = maKiemKho;
	}
	public Date getNgayKiemKho() {
		return ngayKiemKho;
	}
	public void setNgayKiemKho(Date ngayKiemKho) {
		this.ngayKiemKho = ngayKiemKho;
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
	public Set<KiemKhoChiTiet> getListKiemKhoChiTiet() {
		return listKiemKhoChiTiet;
	}
	public void setListKiemKhoChiTiet(Set<KiemKhoChiTiet> listKiemKhoChiTiet) {
		this.listKiemKhoChiTiet = listKiemKhoChiTiet;
	}
	@Override
	public String toString() {
		return "KiemKhoModel [stt=" + stt + ", maKiemKho=" + maKiemKho + ", ngayKiemKho=" + ngayKiemKho + ", nhanVien="
				+ nhanVien + ", maNV=" + maNV + ", listKiemKhoChiTiet=" + listKiemKhoChiTiet + "]";
	}
	
	
	
	
}
