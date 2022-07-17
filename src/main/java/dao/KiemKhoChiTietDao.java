package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.KiemKhoChiTiet;
import utils.DB_Connection;

public class KiemKhoChiTietDao {
private static ArrayList<KiemKhoChiTiet> _listKiemKhoChiTiets = new ArrayList<KiemKhoChiTiet>();
	
	public void them(KiemKhoChiTiet kiemKhoChiTiet) {
		Session session = new DB_Connection().getSession(KiemKhoChiTiet.class);
		session.beginTransaction();
		session.save(kiemKhoChiTiet);
		session.getTransaction().commit();
		session.close();
	}

	public void sua(KiemKhoChiTiet kiemKhoChiTiet) {
		Session session = new DB_Connection().getSession(KiemKhoChiTiet.class);
		session.beginTransaction();
		session.update(kiemKhoChiTiet);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListKiemKhoChiTiet() {
		Session session = new DB_Connection().getSession(KiemKhoChiTiet.class);
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from KiemKhoChiTiet");
		query.addEntity(KiemKhoChiTiet.class);
		_listKiemKhoChiTiets = (ArrayList<KiemKhoChiTiet>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<KiemKhoChiTiet> getListKiemKhoChiTiet() {
		return _listKiemKhoChiTiets;
	}
	


}