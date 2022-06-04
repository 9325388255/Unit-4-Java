package Assignment5;

import java.util.Scanner;

public class TiketMain {
		
	public static void main(String[] args) {
			
			Ticket t = new Ticket();
					
			Scanner scanner = new Scanner(System.in);//scanner
			
			System.out.println("Enter No of Bookings :");
			int noofbookings = scanner.nextInt();//bookings
			
			System.out.println("Enter No of available tickits :");
			int avlTickit =  scanner.nextInt();//tic availabe
			
			Ticket.availableTickets = avlTickit;//set available ticks=entered no

				
			System.out.println("Enter the tickitId :");
			int tickitID = scanner.nextInt();
				
			System.out.println("Enter the price :");
			int price = scanner.nextInt();
				
			System.out.println("Enter the no of tickits :");
			int nooftickis = scanner.nextInt();
		
				
			System.out.println("No of Bookings :" + noofbookings );
				
			System.out.println("TicketId :" + t.getTicketid() );
				
			System.out.println("Available tickets :" + t.getAvailableTickets() );
				
			int totalamt = t.calculateTicketCost(nooftickis);
				 
			System.out.println("Total Amt: " + totalamt);
				
			int avalableTicket = avlTickit - nooftickis;
			System.out.println("Avl tickit after booking: " + avalableTicket);
			
			scanner.close();
	}
}
