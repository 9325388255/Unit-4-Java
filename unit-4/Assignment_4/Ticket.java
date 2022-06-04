package Assignment5;

public class Ticket {
	
	private int ticketid; 
	private int price;
	static int availableTickets;
	
	Ticket(){
		
	}

	public Ticket(int ticketid, int price) {
		super();
		this.ticketid = ticketid;
		this.price = price;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		
		if(availableTickets > 0) {
			Ticket.availableTickets = availableTickets;
		}
		else {
			Ticket.availableTickets = 0;
		}
	}
	
	
public int calculateTicketCost(int nooftickets) {
		
		if( nooftickets <= getAvailableTickets())
		{			
			int setAvailableTickets = ((getAvailableTickets() - nooftickets));	
			
			int ticketPrice = this.getPrice();
			
			int totalAmount = nooftickets*ticketPrice;;
			
			return totalAmount;
	}
		else {
			return -1;
		}
	
	}
	

}
