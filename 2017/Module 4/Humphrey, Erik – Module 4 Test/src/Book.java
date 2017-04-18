public class Book {
	// Member variables
	private String title, borrowersName;
	private int pubYear;
	private Boolean leantOut;
	
	// Constructor and overloaded constructor
	public Book() {
		title = "Untitled";
		pubYear = 2017;
		leantOut = true;
	}
	
	public Book(String t, int y) {
		title = t;
		pubYear = y;
		leantOut = true;
	}
	
	// Accessor methods
	public String getTitle() {
		return title;
	}
	
	public int getPubYear() {
		return pubYear;
	}
	
	public Boolean getStatus() {
		return leantOut;
	}
	
	public String getBorrower() {
		return borrowersName;
	}
	
	// Modifier methods
	public void setTitle(String t) {
		title = t;
	}
	
	public void setPubYear(int y) {
		pubYear = y; 
	}
	
	public void lendOut(String n) {
		borrowersName = n;
	}
	
	// Helper method
	public void bookReturned() {
		leantOut = false;
	}
	
	// Override the toString method to display a summary of the book
	public String toString() {
		String leantTo;
		// Assuming the status should just be the boolean and not this part
		if (getStatus() == true) {
			leantTo = "leant to: " + getBorrower();
		}
		else {
			leantTo = "not leant out";
		}
		String bookSummary = "Book title: " + getTitle() + "\nYear published: " + getPubYear() + "\nThis book is " + leantTo + "\n";
		return (bookSummary);
	}
}
