package com.xworkz.politician.tester;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.PoliticianDAO;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoliticianDAO dao = new PoliticianDAO();
		dao.updateByName("sakleshpura", "ramnagar");
		HibernateUtil.getFactory().close();
		

	}

}
