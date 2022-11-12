/**


 * @author Solomon Bryant
 * @version 10022019
 */

import java.util.Scanner;

public class LuhnAlgorithm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a credit card number (enter a blank line to quit): ");		
	String s = in.nextLine();
	if (s.length() == 0)
		System.out.println("Goodbye!");
	while (s.length() != 0) {				
	while (s.length() != 16 && s.length() != 0) {
		System.out.println("ERROR! Number MUST have exactly 16 digits.");
		System.out.println();
		System.out.print("Enter a credit card number (enter a blank line to quit): ");		
	    s = in.nextLine();	    
	}

	
	if (s.length() != 0) {
	
	String save;
	save = s.substring(15,16);
	int testNum = Integer.parseInt(save);
	int[] even = new int[8];
	int[] odd = new int[7];
	int i;
	int j = 0;		
	for (i = 0; i < 8; i++) {
		save = s.substring(j,(j+1));
		even[i] = Integer.parseInt(save);
		j = j + 2;  }
	
	
	for (i = 0; i < 8; i++) {
		even[i] = even[i]*2;
		
			if (even[i] >= 10) {
				even[i] = even[i]-9; }	
				}
	
	
	int sumEven = 0;
	for( int num : even) {
        sumEven = sumEven+num;
    }	
				
	j = 1;
	for (i = 0; i < 7; i++) {
		save = s.substring(j,(j+1));
		odd[i] = Integer.parseInt(save);
		j = j + 2;  }	
		
	int sumOdd = 0;
	for( int num : odd) {
        sumOdd = sumOdd+num;
    }
	
	int sumAll = sumOdd + sumEven;
	
	int ones = (sumAll%10);
		if (ones == 0) {
			System.out.println("Check digit should be: 0");
			System.out.println("Check digit is: " + testNum);
				if (testNum == 0)
					System.out.println("Number is valid.");
				else {
					System.out.println("Number is not valid.");
				}
		}
		else {
			ones = (10 - ones);
			System.out.println("Check digit should be: " + ones);
			System.out.println("Check digit is: " + testNum);
				if (testNum == ones)
					System.out.println("Number is valid.");
				else {
					System.out.println("Number is not valid.");
			
		        }
	  }
		System.out.println();
		System.out.print("Enter a credit card number (enter a blank line to quit): ");		
		s = in.nextLine();
		}
	  if (s.length() == 0) {
		  System.out.println("Goodbye!");
	  }
	}
		
	}
}




