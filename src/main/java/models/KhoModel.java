package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import entities.SanPhamVaDichVu;

public class KhoModel {
	private int stt;
	private int maKho;
	private String tenKho;
	private String trangThai;
	private Set<SanPhamVaDichVu> listSanPhamVaDichVu = new HashSet<SanPhamVaDichVu>();
	
	public KhoModel(int stt, int maKho, String tenKho, String trangThai, Set<SanPhamVaDichVu> listSanPhamVaDichVu) {
		this.stt = stt;
		this.maKho = maKho;
		this.tenKho = tenKho;
		this.trangThai = trangThai;
		this.listSanPhamVaDichVu = listSanPhamVaDichVu;
	}
	public KhoModel() {
		
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public int getMaKho() {
		return maKho;
	}
	public void setMaKho(int maKho) {
		this.maKho = maKho;
	}
	public String getTenKho() {
		return tenKho;
	}
	public void setTenKho(String tenKho) {
		this.tenKho = tenKho;
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
		return "KhoModel [stt=" + stt + ", maKho=" + maKho + ", tenKho=" + tenKho + ", trangThai=" + trangThai
				+ ", listSanPhamVaDichVu=" + listSanPhamVaDichVu + "]";
	}
	
	
}
