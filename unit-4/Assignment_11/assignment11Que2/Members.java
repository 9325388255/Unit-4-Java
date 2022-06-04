package ass11Que2;

public class Members {
	
	int memberId;
    String memberName;
    int membershipNo;
    String membershipEnddate;
    
    public Members() {
		// TODO Auto-generated constructor stub
	}

	public Members(int memberId, String memberName, int membershipNo, String membershipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEnddate = membershipEnddate;
	}
	
	
	
	@Override
	public int hashCode() {
		return this.memberId;// && (this.membershipNo));
	}
	
	@Override
	public boolean equals(Object o) 
	{ 
		if (this == o) 
		{
			return true;
		}
		Members m1 = this; 
		Members m2 = (Members) o;
		
		return ((m1.memberId == m2.memberId) && (m1.membershipNo == m2.membershipNo)) ; //unique bookid
	}
    
    
	@Override
	public String toString() {
		return "Members: MemberId ="+memberId + "memberName ="+memberName +"membershipNo ="+membershipNo+ "membershipEnddate ="+membershipEnddate;
		
	}

}
