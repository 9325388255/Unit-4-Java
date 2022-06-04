package Ass13Que2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<>();
		
		students.add(new Student(12, "Ram", 200));
		students.add(new Student(10, "Sita", 750));
		students.add(new Student(10, "Golu", 100));
		students.add(new Student(14, "Tony", 230));
		students.add(new Student(14, "Jumbo", 720));
		students.add(new Student(16, "Akash", 620));
		
		//System.out.println(students);
		Collections.sort(students, new RollCompare());
		System.out.println(students);
		
		System.out.println("===========================================================");
		
		students.removeIf( student -> student.getMarks() > 250 );
		System.out.println(students);
	}

}

class RollCompare implements Comparator<Student>{


	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getRoll() > o2.getRoll()) {
			return +1;}
		if(o1.getRoll() < o2.getRoll()) {
			return -1;
		}
			return 0;
	}	
}
