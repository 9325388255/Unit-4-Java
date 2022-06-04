package E2Que2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Ticket t = new Ticket();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of bookings:");
		int nb = sc.nextInt();
		
		System.out.println("Enter the available tickets:");
		int at = sc.nextInt();
		t.setAvailableTickets(at);
		
		System.out.println("Enter the ticketid:");
		int ti = sc.nextInt();
		t.setTicketid(ti);
		
		System.out.println("Enter the price:");
		int p = sc.nextInt();
		t.setPrice(p);
		
		System.out.println("Enter the no of tickets:");
		int nt = sc.nextInt();
				
		System.out.println("Available tickets: " +at );
		System.out.println("Total amount: " +  t.calculateTicketCost(nt) );
		System.out.println("Available ticket after booking: "+(at - nt));
		
		sc.close();
	}

}
