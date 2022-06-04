package ass11;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Library> books = new LinkedHashSet<>();
			
		Scanner sc = new Scanner(System.in);		
		
		while(true) {
			try {
				System.out.println("Enter bookId:");
				int bi = sc.nextInt();
				
				System.out.println("Enter bookName:");
				String bn = sc.next();
				
				System.out.println("Enter BookAuthor:");
				String ba = sc.next();
				
				books.add(new Library(bi,bn,ba));
				System.out.println("Enter More books (y/n) ?");
				String ch = sc.next();
				
				if(ch.equalsIgnoreCase("n")) {
					break;
				}
			}
			catch(Exception e) {
				System.out.println("Please Enter valid Deatils");
			}
		}
		for(Library b:books) {
			System.out.println("=====================================================");
			System.out.println(b);
		}
		System.out.println("=====================================================");
		sc.close();		
	}
}
