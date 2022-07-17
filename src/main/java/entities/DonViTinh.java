package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity (name = "donViTinh")
@Table (name = "DonViTinh")
public class DonViTinh {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int maDonVi;
	private String tenDonVi;
	private String trangThai;
	@OneToMany (fetch = FetchType.LAZY , targetEntity = DonViChiTiet.class)
	 private Set<DonViChiTiet> listDonViChiTiet = new HashSet<DonViChiTiet>();
	
	public DonViTinh(int maDonVi, String tenDonVi, String trangThai, Set<DonViChiTiet> listDonViChiTiet) {
		this.maDonVi = maDonVi;
		this.tenDonVi = tenDonVi;
		this.trangThai = trangThai;
		this.listDonViChiTiet = listDonViChiTiet;
	}
	public DonViTinh() {
		
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
		return "DonViTinh [maDonVi=" + maDonVi + ", tenDonVi=" + tenDonVi + ", trangThai=" + trangThai
				+ ", listDonViChiTiet=" + listDonViChiTiet + "]";
	}
	
	
}
