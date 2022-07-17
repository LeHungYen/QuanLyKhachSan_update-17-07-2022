package dao;

import java.util.ArrayList;

import entities.ChiTietNhap;
import entities.DichVuPhong;

public interface IDichVuPhongDao {
	public void them(DichVuPhong dichVuPhong);
	public void sua(DichVuPhong dichVuPhong);
	public void updateListDichVuPhong();
	public ArrayList<DichVuPhong> getListDichVuPhong();
}
