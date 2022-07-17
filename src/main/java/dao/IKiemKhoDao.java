package dao;

import java.util.ArrayList;

import entities.KiemKho;
import entities.KiemKhoChiTiet;

public interface IKiemKhoDao {
	public void them(KiemKho kiemKho);
	public void sua(KiemKho kiemKho);
	public void updateListKiemKho();
	public ArrayList<KiemKho> getListKiemKho();
}
