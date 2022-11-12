

import java.util.Scanner;

public class FillArray {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of digits to be stored: ");
		
		int arynum = keyboard.nextInt();
		
		int[] myarray;
		
		while (arynum < 0) {
			
			System.out.print("ERROR! You must enter a non-negative number of digits!");
			
			System.out.println();
			
			System.out.println();
			
			System.out.print("Please enter the number of digits to be stored: ");
			
            arynum = keyboard.nextInt();
		}
		
		if (arynum == 0) {
			System.out.print("No digits to store? Goodbye!");
		}
		myarray = new int[arynum];
		
	    	int i;
		
	
		
		for (i = 0 ; i < myarray.length; i++ ) {
			 
		System.out.print("Enter Integer " + i +": ");
				  		
				myarray[i] = keyboard.nextInt();}
				
		
		
		//The contents of your array: 
		//Number of digits in array: 3
		//Digits in array: 0 -5 16 
		
		System.out.println("The contents of your array:");
		
		System.out.println("Number of digits in array: " +arynum);
		
		System.out.print("Digits in array:");
		
		for (i = 0; i < myarray.length; i++ ) {
			
			System.out.print(+myarray[i] + " ");
		
		}
	
			
		
				
		 
		
		
			
			
			
			
		}
		
		 

	}


