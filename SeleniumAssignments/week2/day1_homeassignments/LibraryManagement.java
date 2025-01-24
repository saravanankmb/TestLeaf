package week2.day1_homeassignments;

public class LibraryManagement {

	public static void main(String[] args) {
		//Create object for Library Class
		Library objLibrary = new Library();
		
		//Call addBook method
		objLibrary.addBook("Ikigai");
		
		//Call issueBook method
		objLibrary.issueBook();

	}

}
