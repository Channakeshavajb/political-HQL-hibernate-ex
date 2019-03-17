package com.xworkz.politician.tester;




import java.util.List;

import com.xworkz.hibernate.util.HibernateUtil;
import com.xworkz.politician.dao.QueryListPoliticsDAO;
import com.xworkz.politician.dto.PoliticianDTO;

public class fetchAllConstAndExpByNameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueryListPoliticsDAO dao = new QueryListPoliticsDAO();

		List<Object[]> dtos = dao.fetchAllConstAndExpByName("arun");
		
		for (Object[] objects : dtos) {
			System.out.print(objects[0]+"\t");
			System.out.println(objects[1]);
		}
		
		//dtos.forEach(e ->System.out.println(e[0]+" "+e[1]));
		HibernateUtil.getFactory().close();

	}

}
