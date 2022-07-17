package dao;

import java.util.ArrayList;

import entities.ChiTietNhap;
import entities.ChucVu;

public interface IChiTietNhapDao {
	public void them(ChiTietNhap chiTietNhap);
	public void sua(ChiTietNhap chiTietNhap);
	public void updateListChiTietNhap();
	public ArrayList<ChiTietNhap> getListChiTietNhap();
}
