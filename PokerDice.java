/*
 *   A program that plays and scores a round of the game Poker Dice.  In this game,
 *   five dice are rolled.  The player is allowed to select a number of those five dice
 *   to re-roll.  The dice are re-rolled and then scored as if they were a poker hand.
 *   The following hands MUST be correctly scored in this assignment to receive
 *   full credit:
 *      * Highest value x
 *      * One pair
 *      * Two pair
 *      * Three of a kind
 *      * Straight
 *      * Full house
 *      * Four of a kind
 *      * Five of a kind
 *
 * @author ENTER YOUR NAME HERE
 * @version THE DATE HERE
 *
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PokerDice {

    /**
     * Prompts the user with a message passed into method and returns true if
     * the user enters a 'Y' and false if the user enters an 'N'. The method
     * should work if the user uses upper or lower case inputs. If the user
     * enters any other value, the method should display an error message and
     * continue prompting until a valid value is entered.
     *
     * @param inScanner
     *            Scanner to provide in put from user
     * @param msg
     *            message to display to prompt the user to enter a value
     * @return
     */
    public static boolean promptToPlay(Scanner in, String msg) {
    	System.out.print(msg);
    	String ans = in.nextLine();
    	boolean a = false;
    	while (ans.charAt(0) != 'n' && ans.charAt(0) != 'N'&& ans.charAt(0) != 'y' && ans.charAt(0) != 'Y') {
    		System.out.println("ERROR! Only 'Y' and 'N' allowed as input!");
    		System.out.print(msg);
    		ans = in.nextLine();
    	
    	while (ans.length()>1) {
    		System.out.println("ERROR! Only 'Y' and 'N' allowed as input!");
    		System.out.print(msg);
    		ans = in.nextLine();    		
    	}
    	}
    	if (ans.charAt(0) == 'n' || ans.charAt(0) == 'N')
    		a = false;
    	else if (ans.charAt(0) == 'y' || ans.charAt(0) == 'Y')
    		a = true;
    	
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return a;
    }

    /**
     * Replaces the zeroes in the array dice with random values between 1 and 6
     * chosen from the Random generator rnd. Then sorts the array so that the
     * values are in sorted order. 
     *
     * @param rnd
     *            generator to pull values from
     * @param dice
     *            array to fill with values.
     */
    public static void rollDice(Random rnd, int[] dice) {
    	for (int i = 0; i< dice.length; i++) {
    		if (dice[i] == 0) 
    			dice[i]=rnd.nextInt(6)+1;    	
    	}
    	
    	Arrays.sort(dice);
        // TODO - complete this method

    }

    /**
     * Displays the array dice as the user's current set of die rolls and
     * prompts them to indicate the indices of dice to be re-rolled, one index
     * at a time. If the user enters a -1, the loop ends. If the user enters an
     * invalid index other than -1, the method displays an error message and
     * continues prompting until a valid index or -1 is entered.
     *
     * @param dice
     *            array to set dice to be rerolled
     * @param inScanner
     *            Scanner to provide input from user
     */
    public static void promptForReroll(int[] dice, Scanner inScanner) {
    	System.out.print("Your current roll: [");
    	for (int i=0; i<dice.length-1;i++)
    		System.out.print(dice[i]+", ");
    	
    	System.out.println(dice[4]+"]");
    	int c= 0;
    	while(c!=-1) {
    		
        	
        	
    	System.out.print("Select a die to re-roll (-1 to keep remaining dice): ");
    	c = Integer.parseInt(inScanner.nextLine());
    	if(c ==-1) {
    	}
    	while(c <-1 || c>4) { 
    		if (c == -1) {
    		}
    		else {
    		
    		
    		System.out.println("Error: Index must be between 0 and 4");
    		System.out.print("Your current roll: [");
        	for (int i=0; i<dice.length-1;i++)
        		System.out.print(dice[i]+", ");
        	
        	System.out.println(dice[4]+"]");
        	System.out.print("Select a die to re-roll (-1 to keep remaining dice): ");
        	c = Integer.parseInt(inScanner.nextLine());
    	}    	
    	}
    	if(c!=-1) {
    	dice[c]=0;
    	System.out.print("Your current roll: [");
    	for (int i=0; i<dice.length-1;i++)
    		System.out.print(dice[i]+", ");
    	
    	System.out.println(dice[4]+"]");
    	}
    	}
    	
        // TODO - complete this method

    }

    /**
     * Returns an array where each position represents the counts of a value in
     * the array dice. For example, if dice is [1, 2, 3, 3, 5], then this method
     * would return [1, 1, 2, 0, 1, 0] - where index 0 holds the number of 1s,
     * index 1 holds the number of 2s, index 2 holds the number of 3s, etc.
     *
     * @param dice
     *            die rolls to count
     * @return array holding counts of each value in the array dice
     */
    public static int[] getCounts(int[] dice) {
    	int[] a = new int[6];
    	
    	for (int i = 0; i < a.length; i++) {
    		int count = 0;
    		for (int j = 0; j<dice.length; j++) {
    			
    			if (dice[j] == i+1) {
    			count++; }
    		}
    			a[i]= count;
    			
    		
    	}
    	
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return a;
    }

    /**
     * Given a SORTED array in increasing order, returns true if the numbers
     * form an unbroken sequence, false otherwise. For example, [1,2,3,4,5]
     * would be true, but [1,2,3,4,6] would be false.
     *
     * @param dice
     *            array sorted in increasing order
     * @return true if values in dice are in an unbroken sequence, false
     *         otherwise
     */
    public static boolean inSequence(int[] dice) {
    	boolean straight = true;
    	int i = 0;
    	while (straight && i <4) {   	
    		if (dice[i+1]!=dice[i]+1) {
    			straight = false;
    		}
    		i++;
    	}
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return straight;
    }

    /**
     * Returns true if value is somewhere in the array, false otherwise
     *
     * @param array
     *            array to search for value
     * @param value
     *            item to look for in the array
     * @return true if value is in array, otherwise false
     */
    public static boolean contains(int[] array, int value) {
    	boolean mul = false;
    	int i=0;
    	
    	while (!mul && i < array.length) {
    		if (array[i]==value)
    			mul= true;
    	    i++;   	    
    	}
    		   	
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return mul;
    }

    /**
     * Scores the value of the array of dice as a poker hand. Returns a String
     * giving the rank of the hand. See the assignment write-up for details on
     * how the rank string should be formatted.
     *
     * @param dice
     *            die rolls in sorted order
     * @return String holding the rank of the roll in the array dice
     */
    public static String scoreDice(int[] dice) {
    	String str="";
    	int[] counts = getCounts(dice);
    	boolean straight = inSequence(dice);
    	boolean five= contains(counts, 5);
    	boolean four= contains(counts, 4);
    	boolean three= contains(counts, 3);
    	boolean two= contains(counts, 2);
    	int count= 0;
    	if(straight)
    		str="Straight";
    	else if(five)
    		str="Five of a kind";
    	else if(four)
    		str="Four of a kind";
    	else if (two&&three)
    		str="Full house";
    	else if(three)
    		str="Three of a kind";
    	else if (two) {
    		for (int i=0; i<counts.length; i++) {
    			if (counts[i] == 2){
    				
    			count++;}
    			
    		}
    		if (count == 1)
    			str="One pair";
    		if (count == 2)
    			str="Two pair";
    	}
    	else { 
    		int max = dice[0];

    		for (int i = 1; i < dice.length; i++) {
    		    if (dice[i] > max) {
    		      max = dice[i];
    		    }
    		}
        	
    		str="Highest value "+max;}
    		
        // TODO - complete this method

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return str;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter a random seed: ");
    	
    	int seed = Integer.parseInt(in.nextLine());
    	System.out.println("Welcome to the Poker Dice game!");
    	System.out.println("Roll 5 dice and try to assemble the best poker hand.");
        Random rnd = new Random(seed);
    	String a = "Would you like to play [Y/N]? ";
    	boolean b = promptToPlay(in, a);
    	if(!b)
    		System.out.println();
    	while (b) {
    	
    	int[] dice = new int[5];
    	rollDice(rnd, dice);
    	
    	promptForReroll(dice, in);
    	System.out.println("Keeping remaining dice...");
    	System.out.println("Rerolling...");
    	rollDice(rnd, dice);
    	System.out.print("Your final roll: [");
    	for (int i=0; i<dice.length-1;i++)
    		System.out.print(dice[i]+", ");
    	
    	System.out.println(dice[4]+"]");
    	
    	String ans = scoreDice(dice);
    	System.out.println(ans);
    	String c =("Would you like to play again [Y/N]? ");
    	b= promptToPlay(in, c);
    	
    	}
    	
    	System.out.println("Goodbye!");
        // TODO - complete this method

    }

}