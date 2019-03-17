package com.xworkz.politician.tester;

import java.util.Collection;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.QueryListPoliticsDAO;
import com.xworkz.politician.dto.PoliticianDTO;

public class FetchAllLocTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueryListPoliticsDAO dao = new QueryListPoliticsDAO();
		Collection<PoliticianDTO> dtos = dao.selectAll();
		dtos.forEach(e -> System.out.println(e));

		System.out.println("**************************************************");
		Collection<String> dtos1 = dao.fetchAllLocation("hdk");
		dtos1.forEach(e -> System.out.println(e));
		HibernateUtil.getFactory().close();

	}

}
