package services;

import java.util.ArrayList;

import dao.KiemKhoChiTietDao;
import entities.KiemKhoChiTiet;
import models.KiemKhoChiTietModel;
import utils.IoCContainer;

public class KiemKhoChiTietService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<KiemKhoChiTietModel> _listKiemKhoChiTietModels = new ArrayList<KiemKhoChiTietModel>();
	private KiemKhoChiTietDao _KiemKhoChiTietDao = (KiemKhoChiTietDao) ioCContainer.getBean(KiemKhoChiTietDao.class.toString());
	private KiemKhoChiTiet _KiemKhoChiTiet;
	private KiemKhoChiTietModel _KiemKhoChiTietModel = (KiemKhoChiTietModel) IoCContainer.getBean(KiemKhoChiTietModel.class.toString());;
	private int _stt = 0;

	public static KiemKhoChiTiet updateDataKiemKhoChiTietDependOnKiemKhoChiTietModel(KiemKhoChiTietModel KiemKhoChiTietModel) {
		KiemKhoChiTiet KiemKhoChiTiet = new KiemKhoChiTiet();
		KiemKhoChiTiet.setKiemKho(KiemKhoChiTietModel.getKiemKho());
		KiemKhoChiTiet.setMaKiemKho(KiemKhoChiTietModel.getMaKiemKho());
		KiemKhoChiTiet.setSanPhamVaDichVu(KiemKhoChiTietModel.getSanPhamVaDichVu());
		KiemKhoChiTiet.setMaDichVu(KiemKhoChiTietModel.getMaDichVu());
		KiemKhoChiTiet.setSoLuongTruocKhiKiem(KiemKhoChiTietModel.getSoLuongTruocKhiKiem());
		KiemKhoChiTiet.setSoLuongThucTe(KiemKhoChiTietModel.getSoLuongThucTe());
		KiemKhoChiTiet.setSoLuongChenhLech(KiemKhoChiTietModel.getSoLuongChenhLech());
		KiemKhoChiTiet.setGhiChuLiDoChenhLech(KiemKhoChiTietModel.getGhiChuLiDoChenhLech());
		return KiemKhoChiTiet;
	}

	public void them(KiemKhoChiTietModel KiemKhoChiTietModel) {
		_KiemKhoChiTiet = updateDataKiemKhoChiTietDependOnKiemKhoChiTietModel(KiemKhoChiTietModel);
		_KiemKhoChiTietDao.them(_KiemKhoChiTiet);
		KiemKhoChiTietModel.setStt(_stt);
		_listKiemKhoChiTietModels.add(_stt, KiemKhoChiTietModel);
		_stt++;
	}

	public void sua(KiemKhoChiTietModel KiemKhoChiTietModel) {
		_KiemKhoChiTiet = updateDataKiemKhoChiTietDependOnKiemKhoChiTietModel(KiemKhoChiTietModel);
		_KiemKhoChiTietDao.sua(_KiemKhoChiTiet);
		int stt = KiemKhoChiTietModel.getStt();
		_listKiemKhoChiTietModels.remove(stt);
		_listKiemKhoChiTietModels.add(stt, KiemKhoChiTietModel);
	}
	
	public void updateListKiemKhoChiTietModel() {
		_KiemKhoChiTietDao.updateListKiemKhoChiTiet();
		ArrayList<KiemKhoChiTiet> listKiemKhoChiTiet = _KiemKhoChiTietDao.getListKiemKhoChiTiet();
		for (KiemKhoChiTiet KiemKhoChiTiet : listKiemKhoChiTiet) {
			_KiemKhoChiTietModel = new KiemKhoChiTietModel();
			_KiemKhoChiTietModel.setStt(_stt);
			_KiemKhoChiTietModel.setKiemKho(KiemKhoChiTiet.getKiemKho());
			_KiemKhoChiTietModel.setMaKiemKho(KiemKhoChiTiet.getMaKiemKho());
			_KiemKhoChiTietModel.setSanPhamVaDichVu(KiemKhoChiTiet.getSanPhamVaDichVu());
			_KiemKhoChiTietModel.setMaDichVu(KiemKhoChiTiet.getMaDichVu());
			_KiemKhoChiTietModel.setSoLuongTruocKhiKiem(KiemKhoChiTiet.getSoLuongTruocKhiKiem());
			_KiemKhoChiTietModel.setSoLuongThucTe(KiemKhoChiTiet.getSoLuongThucTe());
			_KiemKhoChiTietModel.setSoLuongChenhLech(KiemKhoChiTiet.getSoLuongChenhLech());
			_KiemKhoChiTietModel.setGhiChuLiDoChenhLech(KiemKhoChiTiet.getGhiChuLiDoChenhLech());
			_listKiemKhoChiTietModels.add(_KiemKhoChiTietModel);
			_stt++;
		}

	}

	public ArrayList<KiemKhoChiTietModel> getListKiemKhoChiTietModel() {
		return _listKiemKhoChiTietModels;
	}

}
