package Assignment5;

import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Student stud = new Student();
		
		System.out.println("How many Student objects need to be created.");
		
		int objLength = sc.nextInt();
		
		Object[][] arr = new Object[objLength][4];
		
		for(int i = 0;i<arr.length;i++)
		{

			System.out.println("Enter the student Roll");
			int roll = sc.nextInt();
			stud.setRoll(roll);

			System.out.println("Enter the student name");
			String name = sc.next();
			stud.setName(name);

			System.out.println("Enter the student Adderss");
			String address = sc.next();
			stud.setAddress(address);


			System.out.println("Enter the student Marks");
			int marks = sc.nextInt();
			stud.setMarks(marks);

			arr[i][0] = roll;
			arr[i][1] = name;
			arr[i][2] = address;
			arr[i][3] = marks;

		}

		for(int k = 0;k<arr.length;k++)
		{
			System.out.println("Student "+ (k+1)+ " Roll No is :"+arr[k][0]);
			System.out.println("Student "+ (k+1)+ "Name is :"+arr[k][1]);
			System.out.println("Student "+ (k+1)+ "Address is :"+arr[k][2]);
			System.out.println("Student  "+ (k+1)+ "Marks is :"+arr[k][3]);
		}

		int sum = 0;

		for(int k = 0;k<arr.length;k++)
		{


			sum = (int) arr[k][3] + sum;
		}

		System.out.println("Average of students marks is  "+ sum/arr.length);



		sc.close();
	}
	
}
