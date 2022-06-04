package Assignment3;

public class Student {

	int roll;
	String name;
	String address;
	String collageName;
	
public Student(int roll, String name, String address){
  		super();
  		this.roll = roll;
  		this.name = name;
  		this.address = address; 	
  		this.collageName =  "NIT"; 
  	}
	

public Student(int roll, String name, String address, String collageName ){
	super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName =  collageName; 		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

     public static Student getStudent(boolean isFromNIT){
    	 if(isFromNIT == true) {
    		 Student s1 = new Student(451, "Krutika", "Chandrapur");
    				 return s1;
    	 }
    	 else {
    		 Student s2 = new Student(321, "Nilesh", "Dhule", "AEC");
			 	return s2;
    	 }
	}     
    
     public void showDetails(){
 		System.out.println("Roll is :"+roll);
 		System.out.println("Name is :"+name);
 		System.out.println("Age is :"+address);
 		System.out.println("Marks is :"+collageName);
 		}
      
     
     public static void main(String[] args) {
    	     	 
    	Student s1 =  getStudent(true);
    	
    	s1.showDetails();
    	
    	System.out.println("=================================");
    	
    	Student s2 =  getStudent(false);
    	
    	s2.showDetails();
   	 
	}
}
	

