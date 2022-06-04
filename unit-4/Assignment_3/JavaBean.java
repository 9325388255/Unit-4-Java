package Assignment3;

public class JavaBean {
	
	private int roll;
	private String name;
	private int age;
	private int marks; 
	
	//zero argument constructor	
	public JavaBean(){
		
	}
	
	//parameterized constructor
	public JavaBean (int roll, String name, int age, int marks ){
		
		this.roll = roll;
		this.name = name;
		if(age>18 && age<60) {
			this.age = age;
		}
		if(marks>0 && marks<500) {
			this.marks = marks;
		}	
	}

    //constructor	 get set method
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
	
	public int getAge() {		
		return age;
		
	}

	public void setAge(int age) {
		if(age>18 && age<60) {
			this.age = age;
		}
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if(marks>0 && marks<500) {
			this.marks = marks;
		}
	}
	
	public void showDetails(){
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Marks is :"+marks);
		}
	
	
public static void main(String[] args){
		
		//using zero argument constructor
		JavaBean student1 = new JavaBean();
		student1.setRoll(100);
		student1.setName("Ram");
		student1.setAge(61);
		student1.setMarks(750);

		//using parameterized constructor
		JavaBean student2 = new JavaBean(101, "Ramesh", 13, 650);
		
		System.out.println("Student1 details: "); //printing using zero argument constructor
		student1.showDetails();
		
		System.out.println("Student2 details"); //printing using parameterized constructor set get method
		System.out.println("Roll is :"+student2.getRoll());
		System.out.println("Name is :"+student2.getName());
		System.out.println("Age is :"+student2.getAge());
		System.out.println("Marks is :"+student2.getMarks());
		}

}
