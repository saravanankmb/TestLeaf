package week2.day1_homeassignments;

public class Library {

	public String addBook(String bookTitle) {
		
		System.out.println("Book Added Successfully");
		
		return bookTitle;

	}
	
	public void issueBook() {
		
		System.out.println("Book Issued Successfully");

	}
	public static void main(String[] args) {

		//Create object for Library Class
		Library objLibrary = new Library();
		
		//Call addBook method
		objLibrary.addBook("The Secret");
		
		//Call issueBook method
		objLibrary.issueBook();

	}

}
