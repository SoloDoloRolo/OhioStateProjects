/**
	 * Program to reverse a String entered by a user.
	 * @author Clayton McEldowney
	 * @author Solomon
	 * @version 10072019
	 *
	 */
	import java.util.Scanner;

	public class ReverseStrings {

		
		
	    /**
	     * Prompts the user for input repeatedly until the user enters a non-empty
	     * String.
	     *
	     * @param in
	     *            the Scanner object to be used to read user input
	     * @return the String entered by the user
	     */

	    public static String getUserInput(Scanner jhon) {
	    	System.out.print("Enter a non-empty string: ");
	    	 String str = jhon.nextLine();
	    	
	    	while (str.length()==0) {
	    		System.out.println("ERROR - you must enter a non-empty string!");
	    		System.out.print("Enter a non-empty string. ");
	    		str= jhon.nextLine();
	    		
	    	}
	    		
	        return str;
	    }

	    /**
	     * Returns the reverse of the input String inString.
	     *
	     * @param inString
	     *            the String to be reversed
	     * @return the reverse of inString
	     */
	    public static String reverse(String inString) {
	        String rev = "";
	        char a;
	        int i;
	        for(i=0; i< inString.length(); i++) {
	        a = inString.charAt(inString.length()-(i+1));
	       rev = rev+a;
	        }
	    	
	    	
	    	
	        return rev;
	    }

	    public static void main(String[] args) {
	        // Set up the scanner
	        Scanner inScanner = new Scanner(System.in);
	        // Prompt the user for input
	        String input = getUserInput(inScanner);
	        // Reverse the user's input
	        String reversed = reverse(input);
	        // Display the result
	        System.out.println("You typed: " + input);
	        System.out.println("In the mirror, that is " + reversed);
	        inScanner.close();
	    }
	    }



