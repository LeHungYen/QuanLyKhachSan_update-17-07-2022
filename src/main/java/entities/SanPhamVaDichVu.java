package entities;

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

@Entity (name = "dichVu")
@Table (name = "DichVu")
public class SanPhamVaDichVu {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int maDichVu;
	private String tenHangHoa;
	@ManyToOne
	@JoinColumn(name = "maNhomSp", nullable = false)
	private NhomSPVaDichVu nhomSPVaDichVu;
	@Column(name = "maNhomSp", insertable = false, updatable = false)
	private int maNhomSp;
	private int soLuongTon;
	private long giaVon;
	@ManyToOne
	@JoinColumn(name = "maKho", nullable = false)
	private Kho kho;
	@Column(name = "maKho", insertable = false, updatable = false)
	private int maKho;
	@OneToMany(fetch = FetchType.LAZY, targetEntity=DonViChiTiet.class)
	  private Set<DonViChiTiet> listDonViChiTiet = new HashSet<DonViChiTiet>();
	@OneToMany(fetch = FetchType.LAZY, targetEntity=KiemKhoChiTiet.class)
	  private Set<KiemKhoChiTiet> listKiemKhoChiTiet = new HashSet<KiemKhoChiTiet>();
	@OneToMany(fetch = FetchType.LAZY, targetEntity=DichVuPhong.class)
	  private Set<DichVuPhong> listDichVuPhong = new HashSet<DichVuPhong>();
	@OneToMany(fetch = FetchType.LAZY, targetEntity=ChiTietNhap.class)
	  private Set<ChiTietNhap> listChiTietNhap = new HashSet<ChiTietNhap>();
	
	public SanPhamVaDichVu(int maDichVu, String tenHangHoa, NhomSPVaDichVu nhomSPVaDichVu, int maNhomSp, int soLuongTon,
			long giaVon, Kho kho, int maKho, Set<DonViChiTiet> listDonViChiTiet, Set<KiemKhoChiTiet> listKiemKhoChiTiet,
			Set<DichVuPhong> listDichVuPhong, Set<ChiTietNhap> listChiTietNhap) {
		this.maDichVu = maDichVu;
		this.tenHangHoa = tenHangHoa;
		this.nhomSPVaDichVu = nhomSPVaDichVu;
		this.maNhomSp = maNhomSp;
		this.soLuongTon = soLuongTon;
		this.giaVon = giaVon;
		this.kho = kho;
		this.maKho = maKho;
		this.listDonViChiTiet = listDonViChiTiet;
		this.listKiemKhoChiTiet = listKiemKhoChiTiet;
		this.listDichVuPhong = listDichVuPhong;
		this.listChiTietNhap = listChiTietNhap;
	}
	public SanPhamVaDichVu() {
		
	}

	public int getMaDichVu() {
		return maDichVu;
	}

	public void setMaDichVu(int maDichVu) {
		this.maDichVu = maDichVu;
	}

	public String getTenHangHoa() {
		return tenHangHoa;
	}

	public void setTenHangHoa(String tenHangHoa) {
		this.tenHangHoa = tenHangHoa;
	}

	public NhomSPVaDichVu getNhomSPVaDichVu() {
		return nhomSPVaDichVu;
	}

	public void setNhomSPVaDichVu(NhomSPVaDichVu nhomSPVaDichVu) {
		this.nhomSPVaDichVu = nhomSPVaDichVu;
	}

	public int getMaNhomSp() {
		return maNhomSp;
	}

	public void setMaNhomSp(int maNhomSp) {
		this.maNhomSp = maNhomSp;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	public long getGiaVon() {
		return giaVon;
	}

	public void setGiaVon(long giaVon) {
		this.giaVon = giaVon;
	}

	public Kho getKho() {
		return kho;
	}

	public void setKho(Kho kho) {
		this.kho = kho;
	}

	public int getMaKho() {
		return maKho;
	}

	public void setMaKho(int maKho) {
		this.maKho = maKho;
	}

	public Set<DonViChiTiet> getListDonViChiTiet() {
		return listDonViChiTiet;
	}

	public void setListDonViChiTiet(Set<DonViChiTiet> listDonViChiTiet) {
		this.listDonViChiTiet = listDonViChiTiet;
	}

	public Set<KiemKhoChiTiet> getListKiemKhoChiTiet() {
		return listKiemKhoChiTiet;
	}

	public void setListKiemKhoChiTiet(Set<KiemKhoChiTiet> listKiemKhoChiTiet) {
		this.listKiemKhoChiTiet = listKiemKhoChiTiet;
	}

	public Set<DichVuPhong> getListDichVuPhong() {
		return listDichVuPhong;
	}

	public void setListDichVuPhong(Set<DichVuPhong> listDichVuPhong) {
		this.listDichVuPhong = listDichVuPhong;
	}

	public Set<ChiTietNhap> getListChiTietNhap() {
		return listChiTietNhap;
	}

	public void setListChiTietNhap(Set<ChiTietNhap> listChiTietNhap) {
		this.listChiTietNhap = listChiTietNhap;
	}

	@Override
	public String toString() {
		return "SanPhamVaDichVu [maDichVu=" + maDichVu + ", tenHangHoa=" + tenHangHoa + ", nhomSPVaDichVu="
				+ nhomSPVaDichVu + ", maNhomSp=" + maNhomSp + ", soLuongTon=" + soLuongTon + ", giaVon=" + giaVon
				+ ", kho=" + kho + ", maKho=" + maKho + ", listDonViChiTiet=" + listDonViChiTiet
				+ ", listKiemKhoChiTiet=" + listKiemKhoChiTiet + ", listDichVuPhong=" + listDichVuPhong
				+ ", listChiTietNhap=" + listChiTietNhap + "]";
	}
	
	
	
	
}
