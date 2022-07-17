package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import entities.DonViChiTiet;

public class DonViTinhModel {
	private int stt;
	private int maDonVi;
	private String tenDonVi;
	private String trangThai;
	private Set<DonViChiTiet> listDonViChiTiet = new HashSet<DonViChiTiet>();
	
	public DonViTinhModel(int stt, int maDonVi, String tenDonVi, String trangThai, Set<DonViChiTiet> listDonViChiTiet) {
		this.stt = stt;
		this.maDonVi = maDonVi;
		this.tenDonVi = tenDonVi;
		this.trangThai = trangThai;
		this.listDonViChiTiet = listDonViChiTiet;
	}
	public DonViTinhModel() {
		
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public int getMaDonVi() {
		return maDonVi;
	}
	public void setMaDonVi(int maDonVi) {
		this.maDonVi = maDonVi;
	}
	public String getTenDonVi() {
		return tenDonVi;
	}
	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public Set<DonViChiTiet> getListDonViChiTiet() {
		return listDonViChiTiet;
	}
	public void setListDonViChiTiet(Set<DonViChiTiet> listDonViChiTiet) {
		this.listDonViChiTiet = listDonViChiTiet;
	}
	@Override
	public String toString() {
		return "DonViTinhModel [stt=" + stt + ", maDonVi=" + maDonVi + ", tenDonVi=" + tenDonVi + ", trangThai="
				+ trangThai + ", listDonViChiTiet=" + listDonViChiTiet + "]";
	}
	
	
}
