package dao;

import java.util.ArrayList;

import entities.Nhap;
import entities.NhomSPVaDichVu;

public interface INhomSPVaDichVu {
	public void them(NhomSPVaDichVu nhomSPVaDichVu);
	public void sua(NhomSPVaDichVu nhomSPVaDichVu);
	public void updateListNhomSPVaDichVu();
	public ArrayList<NhomSPVaDichVu> getListNhomSPVaDichVu();
}
