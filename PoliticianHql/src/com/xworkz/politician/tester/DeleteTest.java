package com.xworkz.politician.tester;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.PoliticianDAO;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoliticianDAO dao = new PoliticianDAO();
		dao.deleteByName("atr");
		HibernateUtil.getFactory().close();
	}

}
