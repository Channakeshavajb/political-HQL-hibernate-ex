package com.xworkz.politician.tester;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dto.PoliticianDTO;

public class NameTestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PoliticianDAO dao = new PoliticianDAO();
		dao.findPoliticianByName("bsy");
		System.out.println("names of politician: \t" + dao);
		HibernateUtil.getFactory().close();
	}

}
