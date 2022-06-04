package Assign7Que2;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student() {
		
	};
	
	public Student(int roll, String name, int marks, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	};

	public void displayDetails() {
		Scanner sc=new Scanner(System.in);		
		
		System.out.println("Student roll:");
		int roll=sc.nextInt();
		this.roll = roll;
		System.out.println("Student name:");
		String name=sc.next();
		this.name = name;
		System.out.println("Student marks:");
		int mark=sc.nextInt();
		this.marks = mark;
		System.out.println("Grade:");
		System.out.println(calculateGrade(mark));
		this.grade = calculateGrade(mark);
	};
	
	
	@Override
	 public String toString(){//overriding the toString() method from Object class 
		  return "ROLL NO IS : "+roll+", NAME IS : "+ name+", MARKS ARE : "+ marks+", Grade id "+grade;  
	}  
	
	 private char calculateGrade(int marks){
		 
		 if(marks >= 500) { 
			 return 'A';
		 }
		 else if(marks < 500 &&  marks >=400) {
			 return 'B';
		 }
		 else{
			 return 'C';
		 }
	 }
}
