package E2Que2;

public class Ticket {

	int ticketid;
	int price;
	int availableTickets;
	
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
	public int getAvailableTickets() {
		return availableTickets;
	}
	public void setAvailableTickets(int availableTickets) {
		
		if(availableTickets > 0)
			this.availableTickets = availableTickets;
//		else
//			this.availableTickets = 0;
	}
	
	
	public int calculateTicketCost(int nooftickets) {
		
		if(nooftickets <= getAvailableTickets()) {
			
			int setAvailableTickets = (getAvailableTickets() - nooftickets);
			
			int totalAmoount = nooftickets*price;
			
			return totalAmoount;
		}
		else {
			return -1;
		}
			
	}
	
}
