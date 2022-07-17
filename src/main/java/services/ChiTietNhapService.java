package services;

import java.util.ArrayList;

import dao.ChiTietNhapDao;
import entities.ChiTietNhap;
import models.ChiTietNhapModel;
import utils.IoCContainer;

public class ChiTietNhapService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<ChiTietNhapModel> _listChiTietNhapModels = new ArrayList<ChiTietNhapModel>();
	private ChiTietNhapDao _ChiTietNhapDao = (ChiTietNhapDao) ioCContainer.getBean(ChiTietNhapDao.class.toString());
	private ChiTietNhap _ChiTietNhap;
	private ChiTietNhapModel _ChiTietNhapModel = (ChiTietNhapModel) IoCContainer.getBean(ChiTietNhapModel.class.toString());;
	private int _stt = 0;

	public static ChiTietNhap updateDataChiTietNhapDependOnChiTietNhapModel(ChiTietNhapModel ChiTietNhapModel) {
		ChiTietNhap ChiTietNhap = new ChiTietNhap();
		ChiTietNhap.setNhap(ChiTietNhapModel.getNhap());
		ChiTietNhap.setMaNhap(ChiTietNhapModel.getMaNhap());
		ChiTietNhap.setSanPhamVaDichVu(ChiTietNhapModel.getSanPhamVaDichVu());
		ChiTietNhap.setMaDichVu(ChiTietNhapModel.getMaDichVu());
		ChiTietNhap.setSoLuong(ChiTietNhapModel.getSoLuong());
		ChiTietNhap.setGiaNhap(ChiTietNhapModel.getGiaNhap());
		return ChiTietNhap;
	}

	public void them(ChiTietNhapModel ChiTietNhapModel) {
		_ChiTietNhap = updateDataChiTietNhapDependOnChiTietNhapModel(ChiTietNhapModel);
		_ChiTietNhapDao.them(_ChiTietNhap);
		ChiTietNhapModel.setStt(_stt);
		_listChiTietNhapModels.add(_stt, ChiTietNhapModel);
		_stt++;
	}

	public void sua(ChiTietNhapModel ChiTietNhapModel) {
		_ChiTietNhap = updateDataChiTietNhapDependOnChiTietNhapModel(ChiTietNhapModel);
		_ChiTietNhapDao.sua(_ChiTietNhap);
		int stt = ChiTietNhapModel.getStt();
		_listChiTietNhapModels.remove(stt);
		_listChiTietNhapModels.add(stt, ChiTietNhapModel);
	}
	
	public void updateListChiTietNhapModel() {
		_ChiTietNhapDao.updateListChiTietNhap();
		ArrayList<ChiTietNhap> listChiTietNhap = _ChiTietNhapDao.getListChiTietNhap();
		for (ChiTietNhap ChiTietNhap : listChiTietNhap) {
			_ChiTietNhapModel = new ChiTietNhapModel();
			_ChiTietNhapModel.setStt(_stt);
			_ChiTietNhapModel.setNhap(ChiTietNhap.getNhap());
			_ChiTietNhapModel.setMaNhap(ChiTietNhap.getMaNhap());
			_ChiTietNhapModel.setMaDichVu(ChiTietNhap.getMaDichVu());
			_ChiTietNhapModel.setSoLuong(ChiTietNhap.getSoLuong());
			_ChiTietNhapModel.setGiaNhap(ChiTietNhap.getGiaNhap());
			_listChiTietNhapModels.add(_ChiTietNhapModel);
			_stt++;
		}

	}

	public ArrayList<ChiTietNhapModel> getListChiTietNhapModel() {
		return _listChiTietNhapModels;
	}

}
