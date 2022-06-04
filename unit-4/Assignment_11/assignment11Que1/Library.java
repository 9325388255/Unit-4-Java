package ass11;

public class Library {
	
	 int bookId;
	 String bookName;
	 String BookAuthor;
	
	public Library() {
		// TODO Auto-generated constructor stub
	}	
	
	public Library(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		BookAuthor = bookAuthor;
	}	
	
	@Override
	public int hashCode() {
		return this.bookId; 
	}	
	
	@Override
	public boolean equals(Object o) 
	{ 
		if (this == o) 
		{
			return true;
		}
		Library s1 = this; 
		Library s2 = (Library) o;
		
		return s1.bookId == s2.bookId; //unique bookid
	}
}
