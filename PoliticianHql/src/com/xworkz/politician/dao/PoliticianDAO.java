package com.xworkz.politician.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dto.PoliticianDTO;

public class PoliticianDAO {
	public PoliticianDAO() {
		// TODO Auto-generated constructor stub
	}

	public void save(PoliticianDTO dto) {
		Session session = HibernateUtil.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(dto);
			tx.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("exception fetching data");
		} finally {
			session.close();
		}

	}

	public String findPoliticianByName(String name) {
		System.out.println("fetch by name\t" + name);
		Session session = HibernateUtil.getFactory().openSession();
		try {
			String syntax = "select p.name from PoliticianDTO p where p.name = '" + name + "'";
			Query query = session.createQuery(syntax);
			System.out.println("return obj from session.createQuery : \t" + query);
			String str = (String) query.uniqueResult();
			if (str != null) {
				System.out.println("data found for name :|\t" + name);
				return str;
			} else {
				System.out.println("data not found for name :\t" + name);
				return null;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("exception fetching data");

		}
		finally {
			session.close();
		}

		return null;
	}
	
	public String findPoliticianByConstAndExp(String constituency,int exp) {
		System.out.println("fetch by const\t" + constituency);
		Session session = HibernateUtil.getFactory().openSession();
		try {
			String syntax = "select p.name from PoliticianDTO p where p.constituency = '" + constituency + "'" +"and p.exp >"+exp;
			Query query = session.createQuery(syntax);
			System.out.println("return obj from session.createQuery : \t" + query);
			String str = (String) query.uniqueResult();
			if (str != null) {
				System.out.println("data found forconstituency  :\t" + constituency );
				return str;
			} else {
				System.out.println("data not found for constituency :\t" + constituency);
				return null;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("exception fetching data");

		}

		return null;
	}
	
	public String findConstituencyByName(String name) {
		System.out.println("fetch by name\t" + name);
		Session session = HibernateUtil.getFactory().openSession();
		try {
			String syntax = "select p.constituency from PoliticianDTO p where p.name = '" + name + "'";
			Query query = session.createQuery(syntax);
			System.out.println("return obj from session.createQuery : \t" + query);
			String str = (String) query.uniqueResult();
			if (str != null) {
				System.out.println("data found for name :|\t" + name);
				return str;
			} else {
				System.out.println("data not found for name :\t" + name);
				return null;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("exception fetching data");

		}
		finally {
			session.close();
		}

		return null;
	}
	
	public int findExpByName(String name) {
		System.out.println("fetch by name\t" + name);
		Session session = HibernateUtil.getFactory().openSession();
		try {
			String syntax = "select p.exp from PoliticianDTO p where p.name = '" + name + "'";
			Query query = session.createQuery(syntax);
			System.out.println("return obj from session.createQuery : \t" + query);
			int in = (Integer) query.uniqueResult();
			if (in != 0) {
				System.out.println("data found for name :|\t" + name);
				return in;
			} else {
				System.out.println("data not found for name :\t" + name);
				return 0;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("exception fetching data");

		}
		finally {
			session.close();
		}

		return 0;
	}
	
	public Object[] findConstExpByName(String name) {
		System.out.println("fetch by name\t" + name);
		Session session = HibernateUtil.getFactory().openSession();
		try {
			
			//place holder ----name param
			String syntax = "select p.constituency,p.exp from PoliticianDTO p where p.name = '"+name+"'";
			Query query = session.createQuery(syntax);
			System.out.println("return obj from session.createQuery : \t" + query); 
			Object pFromDb = query.uniqueResult();
			Object[] array = (Object[])pFromDb;
			if (array != null) {
				System.out.println("array length is  :|\t" + array.length);
				System.out.println("location \t"+ array[0]);
				System.out.println("exp \t"+ array[1]);
				System.out.println("obj found "+pFromDb +"\t for name\t"+name);
				return array;
			} else {
				System.out.println("data not found for name :\t" + name);
				return null;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			// TODO: handle exception
						e.printStackTrace();
						System.err.println("exception fetching data");

		}
		finally {
			session.close();
		}

		return null;
	}

	public Object[] findCstExpByName(String name) {
		System.out.println("fetch by name\t" + name);
		Session session = HibernateUtil.getFactory().openSession();
		try {
			
			//place holder ----name param
			String syntax = "select p.constituency,p.exp from PoliticianDTO p where p.name = :pname";
			Query query = session.createQuery(syntax);
			System.out.println("return obj from session.createQuery : \t" + query);
			query.setParameter("pname", name);
			Object pFromDb = query.uniqueResult();
			Object[] array = (Object[])pFromDb;
			if (array != null) {
				System.out.println("array length is  :|\t" + array.length);
				System.out.println("location \t"+ array[0]);
				System.out.println("exp \t"+ array[1]);
				System.out.println("obj found "+pFromDb +"\t for name\t"+name);
				return array;
			} else {
				System.out.println("data not found for name :\t" + name);
				return null;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			// TODO: handle exception
						e.printStackTrace();
						System.err.println("exception fetching data");

		}
		finally {
			session.close();
		}

		return null;
	}
	
	public void updateByName(String newLocation, String name) {
		System.out.println("fetch by name\t" + name);
		Session session = HibernateUtil.getFactory().openSession();
		session.beginTransaction();
		
		try {
			String syntax = "update PoliticianDTO p set p.constituency = :ploc where name = :pname";
			Query query = session.createQuery(syntax);
			query.setParameter("ploc",newLocation);
			query.setParameter("pname",name);
			System.out.println("param location\t"+ newLocation);
			System.out.println("name \t"+ name);
			query.executeUpdate();
			session.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {

			session.close();
		}
	}
	
	public void deleteByName(String name) {
		System.out.println("fetch by name\t" + name);
		Session session = HibernateUtil.getFactory().openSession();
		session.beginTransaction();
		try {
			String syntax ="delete from PoliticianDTO p where name=:pname";
			Query query = session.createQuery(syntax);
			System.out.println("query:\t"+ query);
			query.setParameter("pname",name);
			query.executeUpdate();
			System.out.println("pname:\t"+ name);
			session.getTransaction().commit();
		

			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {

			session.close();
		}
	}
}
