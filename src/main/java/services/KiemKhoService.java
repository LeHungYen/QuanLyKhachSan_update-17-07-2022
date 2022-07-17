package services;

import java.util.ArrayList;

import dao.KiemKhoDao;
import entities.KiemKho;
import models.KiemKhoModel;
import utils.IoCContainer;

public class KiemKhoService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<KiemKhoModel> _listKiemKhoModels = new ArrayList<KiemKhoModel>();
	private KiemKhoDao _KiemKhoDao = (KiemKhoDao) ioCContainer.getBean(KiemKhoDao.class.toString());
	private KiemKho _KiemKho;
	private KiemKhoModel _KiemKhoModel = (KiemKhoModel) IoCContainer.getBean(KiemKhoModel.class.toString());;
	private int _stt = 0;

	public static KiemKho updateDataKiemKhoDependOnKiemKhoModel(KiemKhoModel KiemKhoModel) {
		KiemKho KiemKho = new KiemKho();
		KiemKho.setMaKiemKho(KiemKhoModel.getMaKiemKho());
		KiemKho.setNgayKiemKho(KiemKhoModel.getNgayKiemKho());
		KiemKho.setNhanVien(KiemKhoModel.getNhanVien());
		KiemKho.setMaNV(KiemKhoModel.getMaNV());
		KiemKho.setListKiemKhoChiTiet(KiemKhoModel.getListKiemKhoChiTiet());
		return KiemKho;
	}

	public void them(KiemKhoModel KiemKhoModel) {
		_KiemKho = updateDataKiemKhoDependOnKiemKhoModel(KiemKhoModel);
		_KiemKhoDao.them(_KiemKho);
		KiemKhoModel.setStt(_stt);
		_listKiemKhoModels.add(_stt, KiemKhoModel);
		_stt++;
	}

	public void sua(KiemKhoModel KiemKhoModel) {
		_KiemKho = updateDataKiemKhoDependOnKiemKhoModel(KiemKhoModel);
		_KiemKhoDao.sua(_KiemKho);
		int stt = KiemKhoModel.getStt();
		_listKiemKhoModels.remove(stt);
		_listKiemKhoModels.add(stt, KiemKhoModel);
	}
	
	public void updateListKiemKhoModel() {
		_KiemKhoDao.updateListKiemKho();
		ArrayList<KiemKho> listKiemKho = _KiemKhoDao.getListKiemKho();
		for (KiemKho KiemKho : listKiemKho) {
			_KiemKhoModel = new KiemKhoModel();
			_KiemKhoModel.setStt(_stt);
			_KiemKhoModel.setMaKiemKho(KiemKho.getMaKiemKho());
			_KiemKhoModel.setNgayKiemKho(KiemKho.getNgayKiemKho());
			_KiemKhoModel.setNhanVien(KiemKho.getNhanVien());
			_KiemKhoModel.setMaNV(_KiemKhoModel.getMaNV());
			_KiemKhoModel.setListKiemKhoChiTiet(KiemKho.getListKiemKhoChiTiet());
			_listKiemKhoModels.add(_KiemKhoModel);
			_stt++;
		}

	}

	public ArrayList<KiemKhoModel> getListKiemKhoModel() {
		return _listKiemKhoModels;
	}

}
