package utils;

import java.util.HashMap;
import java.util.Map;

import dao.ChucVuDao;
import dao.SanPhamVaDichVuDao;
import dao.IChucVuDao;
import dao.ISanPhamVaDichVuDao;
import dao.INhanVienDao;
import dao.NhanVienDao;
import entities.ChucVu;
import entities.SanPhamVaDichVu;
import models.SanPhamVaDichVuModel;
import services.ChucVuService;
import services.SanPhamVaDichVuService;
import services.IChucVuService;
import services.ISanPhamVaDichVuService;
import services.INhanVienService;
import services.NhanVienService;


public class IoCContainer {
	private static Map<String, Object> container;
	static {
		container = new HashMap<String, Object>();
	}

	public static Object getBean(String classNameSpace) {
		switch (classNameSpace) {
		case "class utils.Utilities":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			Utilities utilities = new Utilities();
			container.put(classNameSpace, utilities);
			return utilities;
		case "class utils.DB_Connection":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			DB_Connection db_Connection = new DB_Connection();
			container.put(classNameSpace, db_Connection);
			return db_Connection;
		case "class entities.DichVu":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			SanPhamVaDichVu dichVu = new SanPhamVaDichVu();
			container.put(classNameSpace, dichVu);
			return dichVu;
		case "class models.DichVuModel":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			SanPhamVaDichVuModel dichVuModel = new SanPhamVaDichVuModel();
			container.put(classNameSpace, dichVuModel);
			return dichVuModel;
		case "class dao.DichVuDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			ISanPhamVaDichVuDao dichVuDao = new SanPhamVaDichVuDao();
			container.put(classNameSpace, dichVuDao);
			return dichVuDao;
		case "class services.DichVuService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			ISanPhamVaDichVuService dichVuService = new SanPhamVaDichVuService();
			container.put(classNameSpace, dichVuService);
			return dichVuService;
		case "class services.NhanVienService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			INhanVienService nhanVienService = new NhanVienService();
			container.put(classNameSpace, nhanVienService);
			return nhanVienService;
		case "class dao.NhanVienDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			INhanVienDao nhanVienDao = new NhanVienDao();
			container.put(classNameSpace, nhanVienDao);
			return nhanVienDao;
		case "class dao.ChucVuDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IChucVuDao chucVuDao = new ChucVuDao();
			container.put(classNameSpace, chucVuDao);
			return chucVuDao;
		case "class services.ChucVuService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IChucVuService chucVuService = new ChucVuService();
			container.put(classNameSpace, chucVuService);
			return chucVuService;
			
		
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(ChucVu.class);
	}
}
