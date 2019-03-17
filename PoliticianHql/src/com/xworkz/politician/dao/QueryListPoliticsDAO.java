package com.xworkz.politician.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dto.PoliticianDTO;

public class QueryListPoliticsDAO {

	public QueryListPoliticsDAO() {
		// TODO Auto-generated constructor stub
	}

	public Collection<PoliticianDTO> fetchAll() {

		System.out.println("fetching all");
		Session session = HibernateUtil.getFactory().openSession();

		try {

			String syntax = "select p from PoliticianDTO p";
			Query query = session.createQuery(syntax);
			List<PoliticianDTO> list = query.list();
			return list;

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		} finally {

			session.close();
		}
		return null;
	}

	public Collection<PoliticianDTO> selectAll() {

		System.out.println("fetching all");
		Session session = HibernateUtil.getFactory().openSession();

		try {

			//return session.getNamedQuery("selectAll").list();

			Query query = session.getNamedQuery("selectAll");
			List<PoliticianDTO> list = query.list();
			return list;
			

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		} finally {

			session.close();
		}
		return null;
	}
	
	public Collection<String> fetchAllLocation(String name){
		System.out.println("fetching all constituency");
		Session session = HibernateUtil.getFactory().openSession();
		try {
			Query query = session.getNamedQuery("fetchAllLocation");
			query.setParameter("pname", name);
			// return query.list();
			List<String> list = query.list();
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		} finally {

			session.close();
		}
		return null;
	}
	
	public List<Object[]> fetchAllConstAndExpByName(String name){
		System.out.println("fetching all constituency and exp by name");
		Session session = HibernateUtil.getFactory().openSession();
		try {
			Query query = session.getNamedQuery("fetchAllConstAndExpByName");
			query.setParameter("pname", name);
			List<Object[]> list =query.list();
			return list;
			
			

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		} finally {
			

			session.close(); 
		}
		
		return null;
	}
	
	
}
