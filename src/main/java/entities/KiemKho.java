package entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "kiemKho")
@Table(name = "KiemKho")
public class KiemKho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maKiemKho;
	private Date ngayKiemKho;
	@ManyToOne
	@JoinColumn(name = "maNV", nullable = false)
	private NhanVien nhanVien;
	@Column(name = "maNV", insertable = false, updatable = false)
	private String maNV;
	@OneToMany(fetch = FetchType.LAZY, targetEntity = KiemKhoChiTiet.class)
	private Set<KiemKhoChiTiet> listKiemKhoChiTiet = new HashSet<KiemKhoChiTiet>();

	public KiemKho(int maKiemKho, Date ngayKiemKho, NhanVien nhanVien, String maNV,
			Set<KiemKhoChiTiet> listKiemKhoChiTiet) {
		this.maKiemKho = maKiemKho;
		this.ngayKiemKho = ngayKiemKho;
		this.nhanVien = nhanVien;
		this.maNV = maNV;
		this.listKiemKhoChiTiet = listKiemKhoChiTiet;
	}
	
	public KiemKho() {

	}

	public int getMaKiemKho() {
		return maKiemKho;
	}

	public void setMaKiemKho(int maKiemKho) {
		this.maKiemKho = maKiemKho;
	}

	public Date getNgayKiemKho() {
		return ngayKiemKho;
	}

	public void setNgayKiemKho(Date ngayKiemKho) {
		this.ngayKiemKho = ngayKiemKho;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public Set<KiemKhoChiTiet> getListKiemKhoChiTiet() {
		return listKiemKhoChiTiet;
	}

	public void setListKiemKhoChiTiet(Set<KiemKhoChiTiet> listKiemKhoChiTiet) {
		this.listKiemKhoChiTiet = listKiemKhoChiTiet;
	}

	@Override
	public String toString() {
		return "KiemKho [maKiemKho=" + maKiemKho + ", ngayKiemKho=" + ngayKiemKho + ", nhanVien=" + nhanVien + ", maNV="
				+ maNV + ", listKiemKhoChiTiet=" + listKiemKhoChiTiet + "]";
	}

	
}
