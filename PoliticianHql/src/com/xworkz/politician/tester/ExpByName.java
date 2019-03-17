package com.xworkz.politician.tester;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.PoliticianDAO;

public class ExpByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PoliticianDAO dao = new PoliticianDAO();
		int in = dao.findExpByName("hdk");
		System.out.println("experience by name : "+ in);
		HibernateUtil.getFactory().close();
		
	}

}
