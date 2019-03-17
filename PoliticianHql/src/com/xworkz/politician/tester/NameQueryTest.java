package com.xworkz.politician.tester;

import java.util.Collection;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.QueryListPoliticsDAO;
import com.xworkz.politician.dto.PoliticianDTO;

public class NameQueryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueryListPoliticsDAO dao = new QueryListPoliticsDAO();

		Collection<PoliticianDTO> dtos = dao.selectAll();
		dtos.forEach(e -> System.out.println(e));
		HibernateUtil.getFactory().close();
	}

}
