package com.xworkz.politician.tester;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.PoliticianDAO;

public class ByNameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PoliticianDAO dao = new PoliticianDAO();
		String str = dao.findConstituencyByName("hdk");
		System.out.println("name of the constituency is : \t" + str);
		HibernateUtil.getFactory().close();
	}

}
