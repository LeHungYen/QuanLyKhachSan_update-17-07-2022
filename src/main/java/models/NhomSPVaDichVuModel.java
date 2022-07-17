package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import entities.SanPhamVaDichVu;

public class NhomSPVaDichVuModel {
	private int stt;
	private int maNhomSP;
	private String tenNhomSP;
	private String trangThai;
	private Set<SanPhamVaDichVu> listSanPhamVaDichVu = new HashSet<SanPhamVaDichVu>();
	
	public NhomSPVaDichVuModel(int stt, int maNhomSP, String tenNhomSP, String trangThai,
			Set<SanPhamVaDichVu> listSanPhamVaDichVu) {
		this.stt = stt;
		this.maNhomSP = maNhomSP;
		this.tenNhomSP = tenNhomSP;
		this.trangThai = trangThai;
		this.listSanPhamVaDichVu = listSanPhamVaDichVu;
	}
	public NhomSPVaDichVuModel() {
		
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public int getMaNhomSP() {
		return maNhomSP;
	}
	public void setMaNhomSP(int maNhomSP) {
		this.maNhomSP = maNhomSP;
	}
	public String getTenNhomSP() {
		return tenNhomSP;
	}
	public void setTenNhomSP(String tenNhomSP) {
		this.tenNhomSP = tenNhomSP;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public Set<SanPhamVaDichVu> getListSanPhamVaDichVu() {
		return listSanPhamVaDichVu;
	}
	public void setListSanPhamVaDichVu(Set<SanPhamVaDichVu> listSanPhamVaDichVu) {
		this.listSanPhamVaDichVu = listSanPhamVaDichVu;
	}
	@Override
	public String toString() {
		return "NhomSPvaDichVuModel [stt=" + stt + ", maNhomSP=" + maNhomSP + ", tenNhomSP=" + tenNhomSP
				+ ", trangThai=" + trangThai + ", listSanPhamVaDichVu=" + listSanPhamVaDichVu + "]";
	}
	
	
	
}
