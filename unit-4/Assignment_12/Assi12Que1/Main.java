package Assi12Que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import ass11.Library;

public class Main {
	
public static void main(String[] args) {
		
		HashMap<String,Student> hm=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		int c=0;
	while(c<3) {
		c++;
		System.out.println(c+" enter State");
		String s1=sc.next();
		System.out.println(c+" enter roll");
		int roll=sc.nextInt();
		System.out.println(c+" enter name");
		String name=sc.next();
		System.out.println(c+" enter marks");
		int mark=sc.nextInt();
		Student stu=new Student(roll,name,mark);
		hm.put(s1, stu);
		
	}
	
	
	  
	  Set<Map.Entry<String,Student>> set=hm.entrySet();
	  
		for(Map.Entry<String,Student> me:set) {
			Student stud=me.getValue();
		
			
			System.out.println(me.getKey()+"  ="+" name "+stud.getName()+" rollno "+stud.getRoll()+" marks  "+stud.getMarks());
		}
		
		
       List<Student> studentList = new ArrayList<>();
		
		Set<String> studentKey = hm.keySet();
		
		for(String s0: studentKey) {
			studentList.add(hm.get(s0));
			System.out.println(hm.get(s0));
		}
		
//		for(StudenBean arr:studentList) {
//			System.out.println("**"+arr);
//			
//		}
//		
		Collections.sort(studentList, new StudentmarksComp());
		
		Map<String, Student> sortedStudents = new HashMap<>();
		
		Set<Map.Entry<String, Student>> entries = hm.entrySet();
		
		for(Student s0:studentList) {
			
			for(Map.Entry<String, Student> e: entries) {
				if(e.getValue().equals(s0)) {
					sortedStudents.put(e.getKey(), s0);
				}
			}
		}
		
		for(Map.Entry<String, Student> me : sortedStudents.entrySet()) {
			System.out.println(me.getKey());//only key
			System.out.println(me.getValue());
			System.out.println("=====================================================================");
		}
}

}


//Bean Class
class Student{
	private int roll;
	private String name;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		
		return "Student Details : rollNo = " +roll +"Name = "+name + "Marks ="+marks;
	}
	
	@Override
	public int hashCode() {
		return this.roll; 
	}	
	
	@Override
	public boolean equals(Object o) 
	{ 
		if (this == o) 
		{
			return true;
		}
		Student s1 = this; 
		Student s2 = (Student) o;
		
		return s1.getMarks()== s2.getMarks(); //unique bookid
	}
}



class StudentmarksComp implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getMarks() > o2.getMarks())
			return +1;
		else if(o1.getMarks() < o2.getMarks())
			return -1;
		return 0;
	}

	
}
