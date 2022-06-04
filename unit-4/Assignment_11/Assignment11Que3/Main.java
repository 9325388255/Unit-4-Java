package Ass11Que3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Employee> employees = new TreeSet<>();
		//Set<Employee> employees = new LinkedHashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		while(i<2) {
			try {
				System.out.println("Enter empId:");
				int ei = sc.nextInt();
				
				System.out.println("Enter empName:");
				String en = sc.next();
				
				System.out.println("Enter salary:");
				double sal = sc.nextDouble();
				
				employees.add(new Employee(ei, en, sal));
			}
			catch(Exception e) {
				System.out.println("Please Enter valid Deatils");
			}
			i++;
		}
		for(Employee e:employees) {
			System.out.println("========================================================================================");
			System.out.println(e);
		}
		System.out.println("============================================================================================");
		sc.close();		
	}
}
