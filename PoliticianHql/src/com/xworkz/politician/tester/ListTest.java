package com.xworkz.politician.tester;

import java.util.Collection;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.QueryListPoliticsDAO;
import com.xworkz.politician.dto.PoliticianDTO;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueryListPoliticsDAO dao = new QueryListPoliticsDAO();
		
		Collection<PoliticianDTO> dtos = dao.fetchAll();
		dtos.forEach(e->System.out.println(e));
		HibernateUtil.getFactory().close();
		

	}

}
