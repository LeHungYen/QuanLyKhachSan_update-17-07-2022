package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class DonViChiTiet {
	@Id
	@ManyToOne
	@JoinColumn (name = "maDonVi" ,nullable = false)
	private DonViTinh donViTinh;
	@Column(name = "maDonVi" , nullable = false , updatable = false)
	private int maDonVi;
	@Id
	@ManyToOne
	@JoinColumn (name = "maDichVu" ,nullable = false)
	private SanPhamVaDichVu sanPhamVaDichVu;
	@Column(name = "maDichVu" , nullable = false , updatable = false)
	private int maDichVu;
	private int giaTriQuyDoi;
	private long giaBan;
	
	public DonViChiTiet(DonViTinh donViTinh, int maDonVi, SanPhamVaDichVu sanPhamVaDichVu, int maDichVu,
			int giaTriQuyDoi, long giaBan) {
		this.donViTinh = donViTinh;
		this.maDonVi = maDonVi;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.maDichVu = maDichVu;
		this.giaTriQuyDoi = giaTriQuyDoi;
		this.giaBan = giaBan;
	}
	public DonViChiTiet() {
		
	}
	public DonViTinh getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(DonViTinh donViTinh) {
		this.donViTinh = donViTinh;
	}
	public int getMaDonVi() {
		return maDonVi;
	}
	public void setMaDonVi(int maDonVi) {
		this.maDonVi = maDonVi;
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
	public int getGiaTriQuyDoi() {
		return giaTriQuyDoi;
	}
	public void setGiaTriQuyDoi(int giaTriQuyDoi) {
		this.giaTriQuyDoi = giaTriQuyDoi;
	}
	public long getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}
	@Override
	public String toString() {
		return "DonViChiTiet [donViTinh=" + donViTinh + ", maDonVi=" + maDonVi + ", sanPhamVaDichVu=" + sanPhamVaDichVu
				+ ", maDichVu=" + maDichVu + ", giaTriQuyDoi=" + giaTriQuyDoi + ", giaBan=" + giaBan + "]";
	}
	
	
}
