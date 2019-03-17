package com.xworkz.politician.tester;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.PoliticianDAO;

public class PolByCostExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PoliticianDAO dao = new PoliticianDAO();
		String str = dao.findPoliticianByConstAndExp("hassan", 0);
		System.out.println("names of politician: \t" + str);
		HibernateUtil.getFactory().close();
	}

}
