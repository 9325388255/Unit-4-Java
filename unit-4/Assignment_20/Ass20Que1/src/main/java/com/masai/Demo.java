package com.masai;

import javax.persistence.EntityManager;

import Utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee e1 = new Employee();
		e1.setName("Amit");
		e1.setSalary(10000);
		e1.setHomeAddress(new Address("Pune", "Maharashtra","400001"));
		e1.setOfficeAddress(new Address("Mumbai", "Maharashtra", "420011"));
		
		Employee e2 = new Employee();
		e2.setName("Kunal");
		e2.setSalary(30000);
		e2.setHomeAddress(new Address("Delhi", "Delhi","100001"));
		e2.setOfficeAddress(new Address("Gurgaon", "Haryana", "220011"));
		
		Employee e3 = new Employee();
		e3.setName("Jatin");
		e3.setSalary(50000);
		e3.setHomeAddress(new Address("Kolkata", "West Bengal","700001"));
		e3.setOfficeAddress(new Address("Jamshedpur", "Jharkhand", "780011"));
		
		Employee e4 = new Employee();
		e4.setName("Sunil");
		e4.setSalary(90000);
		e4.setHomeAddress(new Address("Bengaluru", "Karnataka","600001"));
		e4.setOfficeAddress(new Address("Chennai", "Tamil Nade", "680011"));
		
		em.getTransaction().begin();
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Records inserted....");
	}
}
