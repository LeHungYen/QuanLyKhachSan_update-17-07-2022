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
@Entity (name = "kho")
@Table (name = "Kho")
public class Kho {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int maKho;
	private String tenKho;
	private String trangThai;
	@OneToMany (fetch = FetchType.LAZY , targetEntity = SanPhamVaDichVu.class)
	 private Set<SanPhamVaDichVu> listSanPhamVaDichVu = new HashSet<SanPhamVaDichVu>();
	
	public Kho(int maKho, String tenKho, String trangThai, Set<SanPhamVaDichVu> listSanPhamVaDichVu) {
		this.maKho = maKho;
		this.tenKho = tenKho;
		this.trangThai = trangThai;
		this.listSanPhamVaDichVu = listSanPhamVaDichVu;
	}
	
	public Kho() {
		
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
		return "Kho [maKho=" + maKho + ", tenKho=" + tenKho + ", trangThai=" + trangThai + ", listSanPhamVaDichVu="
				+ listSanPhamVaDichVu + "]";
	}
	
	
}
