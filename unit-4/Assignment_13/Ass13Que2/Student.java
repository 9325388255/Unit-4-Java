package Ass13Que2;

//Question 2:
//Create a class of students with attributes  RollNo, Name,  marks (maximum marks 500 )
//In the main runner class make the list of students add student to it
//Using java 8 functionality sort them according to their RollNo. and filter out the students
//getting marks below 250 out of 500. And display them.


public class Student {
	
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
	
}
