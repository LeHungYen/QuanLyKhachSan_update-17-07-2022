package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.Kho;
import utils.DB_Connection;

public class KhoDao {
	private static ArrayList<Kho> _listKhos = new ArrayList<Kho>();
	public void them(Kho kho) {
		Session session = new DB_Connection().getSession(Kho.class);
		session.beginTransaction();
		session.save(kho);
		session.getTransaction().commit();
		session.close();
	}

	public void sua(Kho kho) {
		Session session = new DB_Connection().getSession(Kho.class);
		session.beginTransaction();
		session.update(kho);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListKho() {
		Session session = new DB_Connection().getSession(Kho.class);
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from Kho");
		query.addEntity(Kho.class);
		_listKhos = (ArrayList<Kho>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<Kho> getListKho() {
		return _listKhos;
	}
	
}