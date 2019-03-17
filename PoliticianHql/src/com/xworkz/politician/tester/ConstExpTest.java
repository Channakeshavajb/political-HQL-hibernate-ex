package com.xworkz.politician.tester;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.PoliticianDAO;

public class ConstExpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoliticianDAO dao = new PoliticianDAO();
		dao.findConstExpByName("bsy");
		HibernateUtil.getFactory().close();

	}

}
