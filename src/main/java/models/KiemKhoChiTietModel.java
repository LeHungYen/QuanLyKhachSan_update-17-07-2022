package models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import entities.KiemKho;
import entities.SanPhamVaDichVu;

public class KiemKhoChiTietModel {
	private int stt;
	private KiemKho kiemKho;
	private int maKiemKho;
	private SanPhamVaDichVu sanPhamVaDichVu;
	private int maDichVu;
	private int soLuongTruocKhiKiem;
	private int soLuongThucTe;
	private int soLuongChenhLech;
	private String ghiChuLiDoChenhLech;
	
	public KiemKhoChiTietModel(int stt, KiemKho kiemKho, int maKiemKho, SanPhamVaDichVu sanPhamVaDichVu, int maDichVu,
			int soLuongTruocKhiKiem, int soLuongThucTe, int soLuongChenhLech, String ghiChuLiDoChenhLech) {
		this.stt = stt;
		this.kiemKho = kiemKho;
		this.maKiemKho = maKiemKho;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.maDichVu = maDichVu;
		this.soLuongTruocKhiKiem = soLuongTruocKhiKiem;
		this.soLuongThucTe = soLuongThucTe;
		this.soLuongChenhLech = soLuongChenhLech;
		this.ghiChuLiDoChenhLech = ghiChuLiDoChenhLech;
	}
	public KiemKhoChiTietModel() {
		
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public KiemKho getKiemKho() {
		return kiemKho;
	}
	public void setKiemKho(KiemKho kiemKho) {
		this.kiemKho = kiemKho;
	}
	public int getMaKiemKho() {
		return maKiemKho;
	}
	public void setMaKiemKho(int maKiemKho) {
		this.maKiemKho = maKiemKho;
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
	public int getSoLuongTruocKhiKiem() {
		return soLuongTruocKhiKiem;
	}
	public void setSoLuongTruocKhiKiem(int soLuongTruocKhiKiem) {
		this.soLuongTruocKhiKiem = soLuongTruocKhiKiem;
	}
	public int getSoLuongThucTe() {
		return soLuongThucTe;
	}
	public void setSoLuongThucTe(int soLuongThucTe) {
		this.soLuongThucTe = soLuongThucTe;
	}
	public int getSoLuongChenhLech() {
		return soLuongChenhLech;
	}
	public void setSoLuongChenhLech(int soLuongChenhLech) {
		this.soLuongChenhLech = soLuongChenhLech;
	}
	public String getGhiChuLiDoChenhLech() {
		return ghiChuLiDoChenhLech;
	}
	public void setGhiChuLiDoChenhLech(String ghiChuLiDoChenhLech) {
		this.ghiChuLiDoChenhLech = ghiChuLiDoChenhLech;
	}
	@Override
	public String toString() {
		return "KiemKhoChiTietModel [stt=" + stt + ", kiemKho=" + kiemKho + ", maKiemKho=" + maKiemKho
				+ ", sanPhamVaDichVu=" + sanPhamVaDichVu + ", maDichVu=" + maDichVu + ", soLuongTruocKhiKiem="
				+ soLuongTruocKhiKiem + ", soLuongThucTe=" + soLuongThucTe + ", soLuongChenhLech=" + soLuongChenhLech
				+ ", ghiChuLiDoChenhLech=" + ghiChuLiDoChenhLech + "]";
	}
	
	
}
