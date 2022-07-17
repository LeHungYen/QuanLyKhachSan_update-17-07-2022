package dao;

import java.util.ArrayList;

import entities.NhanVien;
import entities.Nhap;

public interface INhapDao {
	public void them(Nhap nhap);
	public void sua(Nhap nhap);
	public void updateListNhap();
	public ArrayList<Nhap> getListNhap();
}
