package com.masai.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import Utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{


	//@Override
	public boolean createEmployee(Employee e1) {
		
		boolean flag= false;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(e1);
		flag=true;
		
		em.getTransaction().commit();
		
		
		em.close();
		
		return flag;
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		//List <Employee> l1 = new ArrayList<>();

			EntityManager em= EMUtil.provideEntityManager();
			
			String emp1="select * from employee"; //here account is the table name
			
		 	Query q= em.createNativeQuery(emp1, Employee.class);
		 	//Query q= em.createNamedQuery("allAccount");
		
		 	List<Employee> list= q.getResultList();
		 	
		 	//list.forEach(a -> System.out.println(a));
		
		return list;
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		// TODO Auto-generated method stub
		

		String msg = null;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Employee emp1=em.find(Employee.class, empId);
		
		if(emp1 != null){			
			msg = emp1.getAddress();
		}
		
		em.close();
	
		return msg;
		
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		// TODO Auto-generated method stub
       String msg = "Employee not exist";
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Employee emp1=em.find(Employee.class, empId);
		
		if(emp1 != null){	
			
			em.getTransaction().begin();
			
			emp1.setSalary(emp1.getSalary()+bonus);
			
			em.merge(emp1);
			
			msg = "Bonus added to your salry";
			
			em.getTransaction().commit();
		}
		em.close();
	
		return msg;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		boolean flag=false;
	
        EntityManager em= EMUtil.provideEntityManager();
		
		Employee emp1=em.find(Employee.class, empId);
		
		if(emp1 != null){
			
			em.getTransaction().begin();
			
			em.remove(emp1);
			flag=true;
			
			em.getTransaction().commit();
		}
		
		em.close();		
		
		return flag;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		// TODO Auto-generated method stub
		
		String [] s1 = new String[2];
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Employee emp1=em.find(Employee.class, empId);
		
		if(emp1 != null){		
			
			s1[0] = emp1.getName();
			s1[1] = emp1.getAddress();
		}
		em.close();
		return s1;
	}
	

}
