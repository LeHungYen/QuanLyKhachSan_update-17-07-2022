package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.KiemKho;
import utils.DB_Connection;

public class KiemKhoDao {
private static ArrayList<KiemKho> _listKiemKhos = new ArrayList<KiemKho>();
	
	public void them(KiemKho kiemKho) {
		Session session = new DB_Connection().getSession(KiemKho.class);
		session.beginTransaction();
		session.save(kiemKho);
		session.getTransaction().commit();
		session.close();
	}

	public void sua(KiemKho kiemKho) {
		Session session = new DB_Connection().getSession(KiemKho.class);
		session.beginTransaction();
		session.update(kiemKho);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListKiemKho() {
		Session session = new DB_Connection().getSession(KiemKho.class);
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from KiemKho");
		query.addEntity(KiemKho.class);
		_listKiemKhos = (ArrayList<KiemKho>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<KiemKho> getListKiemKho() {
		return _listKiemKhos;
	}
}