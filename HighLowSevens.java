/**
 * DESCRIPTION OF PROGRAM HERE
 * @author YOUR NAME HERE
 * @version DATE HERE
 *
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HighLowSevens {

    /**
     * Prompts the user for an amount to bet. Ensures that the amount will be
     * between 0 and the maximum number of dollars they have available.
     *
     * @param in
     *            A Scanner to provide input
     * @param maxDollars
     *            the maximum number of dollars available
     * @return the amount to bet, guaranteed to be between 0 and maxDollars
     */
    public static int promptForAmount(Scanner in, int maxDollars) {
    	System.out.print("Enter an amount to bet (0 to quit): " );
    	int bet = Integer.parseInt(in.nextLine());
    	while (bet > maxDollars || bet < 0 ) {
    		System.out.println("Your bet must be between 0 and "+maxDollars+ " dollars.");
    		System.out.println("You have "+maxDollars+" dollars.");
    		System.out.print("Enter an amount to bet (0 to quit): " );
        	bet = Integer.parseInt(in.nextLine());
    	}
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return bet;
    }

    /**
     * Prompts the user to enter a single character and ensures that the user
     * must input either an 'H', an 'L' or an 'S'. If they enter a correct
     * character in lowercase, converts it to uppercase.
     *
     * @param in
     *            A Scanner to provide input
     * @return a choice of 'H', 'L' or 'S' guaranteed to be in uppercase.
     */
    public static char promptForChoice(Scanner in) {
    	System.out.print("High, low or sevens (H/L/S)?: ");
    	String choice = in.nextLine();
    	
    	
    	
    		
    		while (choice.length()>1 || choice.length() <1 || choice.charAt(0) != 's' && choice.charAt(0) != 'S' && choice.charAt(0) != 'h' && choice.charAt(0) != 'H' && choice.charAt(0) != 'l' && choice.charAt(0) != 'L') {
    			System.out.println("You must enter only H, L or S.");
        		System.out.print("High, low or sevens (H/L/S)?: ");
            	choice = in.nextLine(); } 
    		if (choice.charAt(0) == 'l')
    			choice = "L";
    		if (choice.charAt(0) == 's')
    			choice = "S";
    		if (choice.charAt(0) == 'h')
    			choice = "H";
    	
    	char a = choice.charAt(0);
    		
    		
    	
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return a;
    }

    /**
     * Returns an array of length numDice where each entry holds a random value
     * between 1 and 6 (representing the roll of a single die).
     *
     * @param rnd
     *            A Random number generator to use
     * @param numDice
     *            number of dice to roll
     * @return an array containing numDice values between 1 and 6
     */
    public static int[] rollDice(Random rnd, int numDice) {
    	int[] a = new int[numDice];
    	for (int i = 0; i < a.length; i++)
    		a[i] = rnd.nextInt(6)+1;
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return a;
    }

    /**
     * Returns the sum of all of the values in the array dice. Note that this
     * method should be able to be called with an arbitrary number of dice so do
     * not hardcode it to only work with 2 dice.
     *
     * @param dice
     *            the values to be displayed
     * @return the sum of the values in the array dice
     */
    public static int totalDice(int[] dice) {
    	int a=0;
    	for (int i = 0; i < dice.length; i++)
    		a = a + dice[i];
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return a;
    }

    /**
     * Returns the amount won or lost according to the choice made, the total on
     * the dice and the bet. If the choice is 'S' and the total is 7 this is 4
     * times the bet. If the choice is 'H' and the total is >=8 this is the same
     * as the bet. If the choice is 'L' and the total is <=6 - it is also the
     * same as the bet Otherwise, the player has lost and this function returns
     * the negative value of their bet.
     *
     * @param choice
     *            One of 'H', 'L', or 'S' - must be uppercase
     * @param total
     *            the total of the dice rolled
     * @param bet
     *            the dollar amount that has been bet
     * @return the correct amount won or lost according to the rules of the
     *         game.
     */
    public static int determineWinnings(char choice, int total, int bet) {
    	int win=bet;
    	
    	if(total == 7) {
   		 if (choice == 'S') 
   			 win=4*bet;
   		 else 
   			 win=bet*-1;
    	}		
   	 
    	if(total > 7) {
   		 if (choice == 'H') 
   			 win=bet;
   		 else 
   			 win=bet*-1;
   		
   		 }    	  		  		
    	 if(total < 7) {
    		 if (choice == 'L') 
    			 win=bet;
    		 else 
    			 win=bet*-1;
    	 }
    if (win > 0)
    	System.out.println("You won "+win+" dollars!");
    else
    	System.out.println("You lost your bet!");
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return win;
    }

    public static void main(String[] args) {
        // TODO - Complete the main method using the functions created
        // above.
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter a random seed: ");
    	int seed = Integer.parseInt(in.nextLine());
    	Random rnd = new Random(seed);
    	int dol = 100;
    	int check=1;
    	while(dol > 0 && check != 0) {
    	
    	System.out.println("You have " +dol+  " dollars.");    	
    	int amt = promptForAmount(in, dol);
    	
    	
    	if (amt == 0 ) {
    		System.out.println("You ended the game with "+dol+ " dollars left.");
    		System.out.println("Goodbye!");
    		check = 0;
    	}
    	
    	else {
    	char ans = promptForChoice(in);
    	int[] dice = rollDice(rnd, 2);
    	System.out.println("Your dice are showing: ["+dice[0]+", "+dice[1]+"]");
    	int total = totalDice(dice);
    	System.out.println("Your total is: "+total);
    	int win = determineWinnings(ans, total, amt);
    	System.out.println();
    	dol = dol+ win;
    	check = 1;
    	}
    	}
    }

}