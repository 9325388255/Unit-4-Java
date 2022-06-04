package ass11Que2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
	public static void main(String[] args) {
		
		Set<Members> members = new LinkedHashSet<>();
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<=2) {
		//for(int i =0; i<=5; i++) {
			try {
				System.out.println("Enter  memberId:");
				int mi = sc.nextInt();
				
				System.out.println("Enter memberName:");
				String mn = sc.next();
				
				System.out.println("Enter membershipNo:");
				int mno = sc.nextInt();
				
				System.out.println("Enter membershipEnddate:");
				String med = sc.next();
				
				members.add(new Members(mi,mn,mno,med));
				
			}
			catch(Exception e) {
				System.out.println("Please Enter valid Deatils");
			}
			i++;
		}
		for(Members m:members) {
			System.out.println("===============================================================================");
			System.out.println(m);
		}
		System.out.println("====================================================================================");
		sc.close();		
	}
}
