package Ass6Que2;

import java.util.Scanner;

public class Main {	
		
	public static Hosteller getHostellerDetails(){
		
		Scanner sc=new Scanner(System.in);		
		
		System.out.println("Student Id:");
		int studentId=sc.nextInt();
		System.out.println("Student name:");
		String name=sc.next();
		System.out.println("Department Id:");
		int departmentId=sc.nextInt();
		System.out.println("Gender:");
		String gender=sc.next();
		System.out.println("Phone Number:");
		String phone=sc.next();
		System.out.println("Hostel name :");
		String hostelName=sc.next();
		System.out.println("Room Number :");
		int roomNumber=sc.nextInt();
		
		
		Hosteller h1 =	new Hosteller(studentId,name,departmentId,gender,phone,hostelName,roomNumber);
		
		h1.setStudentId(studentId);
		h1.setName(name);
		h1.setDepartmentId(departmentId);
		h1.setGender(gender);
		h1.setPhone(phone);
		h1.setHostelName(hostelName);
		h1.setRoomNumber(roomNumber);
		
		//Modify Room NO
				System.out.println("Modify room number(Y/N)");		
				String ans1=sc.next();
					if(ans1.equals("Y")) 
					{
					System.out.println("New room number :");
					int newroom=sc.nextInt();		
					h1.setRoomNumber(newroom);
				}
						//Phone Modify
			    System.out.println("Modify phone number(Y/N)");
				String ans2=sc.next();
					if(ans2.equals("Y")) {
					System.out.println("New phone number :");
					String newphone=sc.next();
					h1.setPhone(newphone);
				}
		
		return h1;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Hosteller h2=getHostellerDetails();
		
		System.out.println("Details are: "+ h2.getStudentId()+" "+ h2.getName()+" "+h2.getDepartmentId()+" "+h2.getGender()+" "+h2.getPhone()+" "+h2.getHostelName()+" "+h2.getRoomNumber());

	}



}
