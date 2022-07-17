package services;

import java.util.ArrayList;

import dao.NhapDao;
import entities.Nhap;
import models.NhapModel;
import utils.IoCContainer;

public class NhapService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<NhapModel> _listNhapModels = new ArrayList<NhapModel>();
	private NhapDao _NhapDao = (NhapDao) ioCContainer.getBean(NhapDao.class.toString());
	private Nhap _Nhap;
	private NhapModel _NhapModel = (NhapModel) IoCContainer.getBean(NhapModel.class.toString());;
	private int _stt = 0;

	public static Nhap updateDataNhapDependOnNhapModel(NhapModel NhapModel) {
		Nhap Nhap = new Nhap();
		Nhap.setMaNhap(NhapModel.getMaNhap());
		Nhap.setGhiChu(NhapModel.getGhiChu());
		Nhap.setTinhTrang(NhapModel.getTinhTrang());
		Nhap.setNhanVien(NhapModel.getNhanVien());
		Nhap.setMaNV(NhapModel.getMaNV());
		Nhap.setListChiTietNhap(NhapModel.getListChiTietNhap());
		return Nhap;
	}

	public void them(NhapModel NhapModel) {
		_Nhap = updateDataNhapDependOnNhapModel(NhapModel);
		_NhapDao.them(_Nhap);
		NhapModel.setStt(_stt);
		_listNhapModels.add(_stt, NhapModel);
		_stt++;
	}

	public void sua(NhapModel NhapModel) {
		_Nhap = updateDataNhapDependOnNhapModel(NhapModel);
		_NhapDao.sua(_Nhap);
		int stt = NhapModel.getStt();
		_listNhapModels.remove(stt);
		_listNhapModels.add(stt, NhapModel);
	}
	
	public void updateListNhapModel() {
		_NhapDao.updateListNhap();
		ArrayList<Nhap> listNhap = _NhapDao.getListNhap();
		for (Nhap Nhap : listNhap) {
			_NhapModel = new NhapModel();
			_NhapModel.setStt(_stt);
			_NhapModel.setMaNhap(Nhap.getMaNhap());
			_NhapModel.setGhiChu(Nhap.getGhiChu());
			_NhapModel.setNgayNhap(Nhap.getNgayNhap());
			_NhapModel.setTinhTrang(Nhap.getTinhTrang());
			_NhapModel.setNhanVien(Nhap.getNhanVien());
			_NhapModel.setMaNV(Nhap.getMaNV());
			_NhapModel.setListChiTietNhap(Nhap.getListChiTietNhap());
			_listNhapModels.add(_NhapModel);
			_stt++;
		}

	}

	public ArrayList<NhapModel> getListNhapModel() {
		return _listNhapModels;
	}

}
