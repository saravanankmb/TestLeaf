package week1.day2_homeassignments;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		// Input the number from user
		System.out.print("Enter the number: ");
		
		// Create the scanner object
		Scanner getNum = new Scanner(System.in);
		
		// Read and store the value from user
		int num = getNum.nextInt();
		
		// Declare and initialize the prime status boolean variable
		boolean isPrime = true;
		
		if(num <= 1) { // set to not a prime for value <= 1
			isPrime = false;
		}
		
		for (int i = 2; i < num; i++) { // Check whether the number is divisible from 2 to num-1
			if(num%i==0) { // set to not a prime when divisible by any number
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {// Check the boolean variable and print accordingly
			System.out.println("It's a prime number.");
		}
		else {
			System.out.println("It's not a prime number.");
		}
	}

}
