/**
 * Your description here
 * @author ENTER YOUR NAME HERE
 * @version ENTER DATE HERE
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordGuessing {

    /**
     * Takes a filename as input. Reads a list of words from the file into a
     * list and returns the list. Ensures that all of the words in the list are
     * in UPPERCASE (i.e. transforms lowercase letters to uppercase before
     * adding them to the list). Assumes that the file will be correctly
     * formatted with one word per line (though there may be blank lines with
     * no words on them). If the file cannot be read prints the
     * error message "ERROR: File fname not found!" where "fname" is the name of
     * the file and returns an empty list.  Note that the order of the words in the
     * list must be the same as the order of the words in the file to pass the
     * test cases.
     *
     * @param fname
     *            the name of the file to read words from
     * @return a list of words read from the file in all uppercase letters.
     */
    public static List<String> readWords(String fname) {
        List<String> words = new ArrayList<String>();
        try {
    		File textFile = new File(fname);
        	Scanner textScanner = new Scanner(textFile);
        	
        	while (textScanner.hasNext()) {
        		String str = textScanner.nextLine();
        		str.toUpperCase();
        		
        	if (str.length() > 0) {
        		str = str.toUpperCase();
        	
        		words.add(str); }
        	}
        	
        	textScanner.close();
        	
        }
    	catch (FileNotFoundException e) {
        	System.out.print("ERROR: File "+fname+ "not found");
        	
        }
        	
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return words;
    }

    /**
     * Takes a Random object and a list of strings and returns a random String
     * from the list. Note that this method must not change the list.  The list
     * is guaranteed to have one or more elements in it.
     *
     * @param rnd
     *            Random number generator object
     * @param inList
     *            list of strings to choose from
     * @return an element from a random position in the list
     */
    public static String getRandomWord(Random rnd, List<String> inList) {
    	int pos =0;
    	if (inList.size()!=1)
    	pos= rnd.nextInt(inList.size()-1);
    	
    		
    	String word =  inList.get(pos);
    	
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return word;
    }

    /**
     * Given a String, returns a StringBuilder object that is the same length
     * but is only '*' characters. For example, given the String DOG as input
     * returns a StringBuilder object containing "***".
     *
     * @param inWord
     *            The String to be starred
     * @return a StringBuilder with the same length as inWord, but all stars
     */
    public static StringBuilder starWord(String inWord) {
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < inWord.length(); i++)
    		sb.append('*');
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return sb;
    }

    /**
     * Prompts the user to enter a single character. If the user enters a blank
     * line or more than one character, give an error message as given in the
     * assignment and prompt them again. When the user enters a single
     * character, return the uppercase value of the character they typed.
     *
     * @param inScanner
     *            A scanner to take user input from
     * @return the uppercase value of the character typed by the user.
     */
    public static char getCharacterGuess(Scanner in) {
    	System.out.print("Enter a character to guess:");
    	String letter = in.nextLine();
    	while (letter.length() <1 || letter.length()>1) {
    		System.out.println("Enter onle a single character!");
    		System.out.print("Enter a character to guess:");
        	letter = in.nextLine();
    		
    	}
    	letter=letter.toUpperCase();
    	
    	char car = letter.charAt(0);
    	
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return car;
    }

    /**
     * Count the number of times the character ch appears in the String word.
     *
     * @param ch
     *            character to count.
     * @param word
     *            String to examine for the character ch.
     * @return a count of the number of times the character ch appears in the
     *         String word
     */
    public static int charCount(char ch, String word) {
    	int count = 0;
    	for (int i = 0; i < word.length(); i++) {
    		if (ch == word.charAt(i))
    			count++;
    	}
    	
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return count;
    }

    /**
     * Modify the StringBuilder object starWord everywhere the char ch appears
     * in the String word. For example, if ch is 'G', word is "GEOLOGY", and
     * starWord is "**O*O*Y", then this method modifies starWord to be
     * "G*O*OGY".  Your code should assume that word and starWord are
     * the same length.
     *
     * @param ch
     *            the character to look for in word.
     * @param word
     *            the String containing the full word.
     * @param starWord
     *            the StringBuilder containing the full word masked by stars.
     */
    public static void modifyStarWord(char ch, String word,
            StringBuilder starWord) {
    	for (int i = 0; i < word.length(); i++) {
    		if (ch == word.charAt(i)) 
    			starWord.setCharAt(i, ch);
    		}
    			
        // TODO - complete this function

    }
    
    public static void previousLetter(List<Character> list, Character str) {
    	list.add(str);
    }
    
    public static boolean repeat(boolean a, Scanner in) {
    	System.out.print("Would you like a rematch [Y/N]?: ");
    	String choice = in.nextLine();
    	while (choice.length()>1 || choice.charAt(0) != 'y' && choice.charAt(0) != 'Y' && choice.charAt(0) != 'n' && choice.charAt(0) != 'N') {
    		System.out.println("Please enter only a Y or an N.");
    		System.out.print("Would you like a rematch [Y/N]?: ");
    		choice = in.nextLine();}
    	if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') { 
    			System.out.println();
    	a = true;}
    	else
    		a=false;
    	
    	return a;
    }

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        // TODO - complete this function
    	System.out.print("Enter a random seed: ");
    	int seed = Integer.parseInt(in.nextLine());
    	Random rnd = new Random(seed);
    	System.out.print("Enter a filename for your wordlist: ");
    	String file = in.nextLine();
    	List<String> fList = readWords(file);
    	int listLen = fList.size();
    	System.out.println("Read "+ listLen+ " words from the file.");
    	System.out.println();
    	boolean playAgain=true;
    	while (playAgain){
    	List<Character> prevC = new ArrayList<Character>();
    	
    	boolean correct = false;
    	String wordG = "";
    	
    	String word = getRandomWord(rnd, fList); 
       word = word.toUpperCase();
    	StringBuilder sb = starWord(word);
    	while (!correct) {
    	System.out.println("The word to guess is: "+ sb);
    
    	System.out.print("Previous characters guessed: [");    	
    		for (int i = 0; i < prevC.size()-1; i++)
    			System.out.print(prevC.get(i)+", ");
    		if (prevC.size()>0)
    		System.out.println(prevC.get(prevC.size()-1)+"]");  
    		else
    			System.out.println("]");
   	
    	char chG = getCharacterGuess(in);
    	previousLetter(prevC, chG);
    	
    	modifyStarWord(chG, word, sb);
    	int occur = charCount(chG, word);
    	System.out.println("The character "+chG+" occurs in "+occur+" positions.");
    	System.out.println();
    	
    	System.out.println("The word to guess is: "+ sb);
    	System.out.print("Enter your guess for the word: ");
    	
    	wordG = in.nextLine();
    	wordG=wordG.toUpperCase();
    	correct = wordG.equals(word);
    	int guessNum =0;
    	guessNum++;
    	if (correct) {
    		System.out.println("Yes! "+word+" is the correct word!");
    		System.out.println("That took you "+guessNum+" guesses.");
    	}
    	else {
    		System.out.println("That is not the word.");
    		System.out.println();}
    	}
    	
    	
    		playAgain = repeat(playAgain, in);
    	}
    	System.out.print("Goodbye!");
    
    	
    	
    }

}
