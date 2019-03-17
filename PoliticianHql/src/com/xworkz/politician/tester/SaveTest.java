package com.xworkz.politician.tester;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dto.PoliticianDTO;

public class SaveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoliticianDTO dto = new PoliticianDTO();
		dto.setName("arun");
		dto.setExp(19);
		dto.setConstituency("madikeri");
		
		PoliticianDAO dao = new PoliticianDAO();
		dao.save(dto);
		HibernateUtil.getFactory().close();

	}

}
