package E4Que4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Assign12Que1.Student;

public class Main {
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		Scanner sc=new Scanner(System.in);
		int c=0;
	while(c<2) {
		try {
			c++;
			System.out.println(c+" enter Roll");
			int roll=sc.nextInt();
			System.out.println(c+" enter Name");
			String name=sc.next();
			System.out.println(c+" enter Marks");
			int marks=sc.nextInt();
			Student stu=new Student(roll,name,marks);
			students.add(stu);
		}
		catch(Exception e) {
			System.out.println("Enter valid details");
		}
	}
	System.out.println(students);
	
	}

}
