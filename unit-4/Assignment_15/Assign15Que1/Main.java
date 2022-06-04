package Assign15Que1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Create an object of the Student class with all the details.
//2. Serialize the Student object inside a file called "student.txt" in the current location.
//Note:- make sure while serializing don't serialize the password field
//3. Deserialize the Student object from the "student.txt" file and print all the details.

public class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student s1 = new Student();
		
		FileOutputStream fos=new FileOutputStream("student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		oos.close();
		
		System.out.println("a1 object is serailized");
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
		Student a2 = (Student)ois.readObject();
		a2.funx();		

	}

}
;