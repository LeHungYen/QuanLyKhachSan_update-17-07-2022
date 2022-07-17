package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.ChiTietNhap;
import utils.DB_Connection;

public class ChiTietNhapDao implements IChiTietNhapDao{
	private static ArrayList<ChiTietNhap> _listChiTietNhaps = new ArrayList<ChiTietNhap>();
	public void them(ChiTietNhap chiTietNhap) {
		Session session = new DB_Connection().getSession(ChiTietNhap.class);
		session.beginTransaction();
		session.save(chiTietNhap);
		session.getTransaction().commit();
		session.close();
	}

	public void sua(ChiTietNhap chiTietNhap) {
		Session session = new DB_Connection().getSession(ChiTietNhap.class);
		session.beginTransaction();
		session.update(chiTietNhap);
		session.getTransaction().commit();
		session.close();
	}
	
	public void updateListChiTietNhap() {
		Session session = new DB_Connection().getSession(ChiTietNhap.class);
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from ChiTietNhap");
		query.addEntity(ChiTietNhap.class);
		ArrayList<ChiTietNhap> listChiTietNhap = (ArrayList<ChiTietNhap>) query.list();
		session.getTransaction().commit();
		session.close();
	}
	

	public ArrayList<ChiTietNhap> getListChiTietNhap() {
		return _listChiTietNhaps;
	}


}