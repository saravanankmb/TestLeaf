package week1.day2_homeassignments;

import java.util.Iterator;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// To declare the range variable
		int range, sum = 0;
		
		// Input the range from user
		System.out.print("Enter the range of Fibonacci Series: ");
		
		// Create Scanner object
		Scanner getRange = new Scanner(System.in);
		
		// Read the next integer from the screen
		range = getRange.nextInt();
		
        // Close the Scanner object
        getRange.close(); // Important to prevent resource leaks
	
        // declare and initialize variables for fibonacci series calculation
        int num1 = 0, num2 = 1, fibonacciNum = 0;
        for (int i = 0; i < range; i++) {
        	fibonacciNum = num1;
			System.out.println(fibonacciNum);
			num1 = num2;
			num2 = num1 + fibonacciNum;
        }
			
		}
        
	}

