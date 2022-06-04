package com.masai;

import java.util.List;

import javax.persistence.EntityManager;

import Utility.EMUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Department dept=new Department();
		dept.setDname("Marketing");
		dept.setLocation("Kolkata");
		
		Employee emp1=new Employee();
		emp1.setEname("Sunil");
		emp1.setSalary(7800);
		emp1.setAddress("Nagpur");
		emp1.setDept(dept); //associating dept with emp1
		
		Employee emp2=new Employee();
		emp2.setEname("Suresh");
		emp2.setSalary(8800);
		emp2.setAddress("Mumbai");
		emp2.setDept(dept); //associating dept with emp1
		
		Employee emp3=new Employee();
		emp3.setEname("Kruti");
		emp3.setSalary(88000);
		emp3.setAddress("Pune");
		emp3.setDept(dept); //associating dept with emp1
		
		//here both emp got the dept details..
		
		//now we need to give both emp details to the dept
		//associating both emp with the dept
		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		dept.getEmps().add(emp3);
		
		em.getTransaction().begin();
		
		em.persist(dept);
		
		em.getTransaction().commit();	
			
		System.out.println("done...");
		

		
	}

}
