package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "nhomSPVaDichVu")
@Table(name = "NhomSPVaDichVu")
public class NhomSPVaDichVu {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int maNhomSP;
	private String tenNhomSP;
	private String trangThai;
	@OneToMany (fetch = FetchType.LAZY , targetEntity = SanPhamVaDichVu.class)
	 private Set<SanPhamVaDichVu> listSanPhamVaDichVu = new HashSet<SanPhamVaDichVu>();
	
	public NhomSPVaDichVu(int maNhomSP, String tenNhomSP, String trangThai, Set<SanPhamVaDichVu> listSanPhamVaDichVu) {
		this.maNhomSP = maNhomSP;
		this.tenNhomSP = tenNhomSP;
		this.trangThai = trangThai;
		this.listSanPhamVaDichVu = listSanPhamVaDichVu;
	}
	public NhomSPVaDichVu() {
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
		return "NhomSPVaDichVu [maNhomSP=" + maNhomSP + ", tenNhomSP=" + tenNhomSP + ", trangThai=" + trangThai
				+ ", listSanPhamVaDichVu=" + listSanPhamVaDichVu + "]";
	}
	
	
}
