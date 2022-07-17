package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ChiTietNhap {
	@Id
	@ManyToOne
	@JoinColumn (name = "maNhap" ,nullable = false)
	private Nhap nhap;
	@Column(name = "maNhap" , nullable = false , updatable = false)
	private int maNhap;
	@Id
	@ManyToOne
	@JoinColumn (name = "maDichVu" ,nullable = false)
	private SanPhamVaDichVu sanPhamVaDichVu;
	@Column(name = "maDichVu" , nullable = false , updatable = false)
	private int maDichVu;
	private int soLuong;
	private long giaNhap;
	public ChiTietNhap(Nhap nhap, int maNhap, SanPhamVaDichVu sanPhamVaDichVu, int maDichVu, int soLuong,
			long giaNhap) {
		this.nhap = nhap;
		this.maNhap = maNhap;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.maDichVu = maDichVu;
		this.soLuong = soLuong;
		this.giaNhap = giaNhap;
	}
	public ChiTietNhap() {
		
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
		return "ChiTietNhap [nhap=" + nhap + ", maNhap=" + maNhap + ", sanPhamVaDichVu=" + sanPhamVaDichVu
				+ ", maDichVu=" + maDichVu + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + "]";
	}
	
	
}
