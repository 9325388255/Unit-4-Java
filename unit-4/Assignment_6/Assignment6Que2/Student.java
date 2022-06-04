package InheritanceAssignment6;

public class Student {

	int studentId;
	String name;
	int departmentId;
	String gender;
	String phone;
	
	
	public Student(){
		
	}


	public Student(int studentId, String name, int departmentId, String gender, String phone) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.departmentId = departmentId;
		this.gender = gender;
		this.phone = phone;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
