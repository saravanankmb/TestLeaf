package week1.day2_homeassignments;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// To get the input number from user
		System.out.print("Enter the input number: ");
		
		// Create Scanner Object
		Scanner getInput = new Scanner(System.in);
		
		// Read and store the input integer
		int input = getInput.nextInt();
		
		// declare and initialize the variables
		int inputTemp, output = 0;
		
		// use while loop to reverse the given number
		/*while (inputTemp > 0) {
			
			output = (output*10) + (inputTemp%10);
			
			inputTemp = inputTemp/10;
		}*/
		
		// use for loop to reverse the given number
		for(inputTemp = input; inputTemp > 0; inputTemp = inputTemp/10) {
			output = (output*10) + (inputTemp%10);
		}
		
		if (input == output) { // check if the original number and the reversed number are equal
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
		

	}

}
