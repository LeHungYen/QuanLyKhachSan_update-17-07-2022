package dao;

import java.util.ArrayList;

import entities.Kho;
import entities.KiemKhoChiTiet;

public interface IKiemKhoChiTiet {
	public void them(KiemKhoChiTiet kiemKhoChiTiet);
	public void sua(KiemKhoChiTiet kiemKhoChiTiet);
	public void updateListKiemKhoChiTiet();
	public ArrayList<KiemKhoChiTiet> getListKiemKhoChiTiet();
}
