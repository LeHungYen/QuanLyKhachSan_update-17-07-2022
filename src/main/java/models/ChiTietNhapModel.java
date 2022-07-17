package models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import entities.Nhap;
import entities.SanPhamVaDichVu;

public class ChiTietNhapModel {
	private int stt;
	private Nhap nhap;
	private int maNhap;
	private SanPhamVaDichVu sanPhamVaDichVu;
	private int maDichVu;
	private int soLuong;
	private long giaNhap;
	
	public ChiTietNhapModel(int stt, Nhap nhap, int maNhap, SanPhamVaDichVu sanPhamVaDichVu, int maDichVu, int soLuong,
			long giaNhap) {
		this.stt = stt;
		this.nhap = nhap;
		this.maNhap = maNhap;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.maDichVu = maDichVu;
		this.soLuong = soLuong;
		this.giaNhap = giaNhap;
	}
	public ChiTietNhapModel() {
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public Nhap getNhap() {
		return nhap;
	}
	public void setNhap(Nhap nhap) {
		this.nhap = nhap;
	}
	public int getMaNhap() {
		return maNhap;
	}
	public void setMaNhap(int maNhap) {
		this.maNhap = maNhap;
	}
	public SanPhamVaDichVu getSanPhamVaDichVu() {
		return sanPhamVaDichVu;
	}
	public void setSanPhamVaDichVu(SanPhamVaDichVu sanPhamVaDichVu) {
		this.sanPhamVaDichVu = sanPhamVaDichVu;
	}
	public int getMaDichVu() {
		return maDichVu;
	}
	public void setMaDichVu(int maDichVu) {
		this.maDichVu = maDichVu;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public long getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(long giaNhap) {
		this.giaNhap = giaNhap;
	}
	@Override
	public String toString() {
		return "ChiTietNhapModel [stt=" + stt + ", nhap=" + nhap + ", maNhap=" + maNhap + ", sanPhamVaDichVu="
				+ sanPhamVaDichVu + ", maDichVu=" + maDichVu + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + "]";
	}

	
	
}
