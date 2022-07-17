package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.Nhap;
import utils.DB_Connection;

public class NhapDao {
private static ArrayList<Nhap> _listNhaps = new ArrayList<Nhap>();
	
	public void them(Nhap nhap) {
		Session session = new DB_Connection().getSession(Nhap.class);
		session.beginTransaction();
		session.save(nhap);
		session.getTransaction().commit();
		session.close();
	}

	public void sua(Nhap nhap) {
		Session session = new DB_Connection().getSession(Nhap.class);
		session.beginTransaction();
		session.update(nhap);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListNhap() {
		Session session = new DB_Connection().getSession(Nhap.class);
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from Nhap");
		query.addEntity(Nhap.class);
		_listNhaps = (ArrayList<Nhap>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<Nhap> getListNhap() {
		return _listNhaps;
	}
}