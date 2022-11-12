/**
 * YOUR DESCRIPTION HERE
 * @author Solomon Bryant
 * @version DATE HERE
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SubstitutionCipher {

    /**
     * Private constants used to shift characters for the substitution cipher.
     */
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";

    /**
     * Constructs a new String where each letter in the String input is shifted
     * by the amount shift to the right, preserving whether the original
     * character was uppercase or lowercase. For example, the String "ABC" with
     * shift 3 would cause this method to return "DEF". A negative value should
     * shift to the left. For example, the String "ABC" with shift -3 would
     * cause this method to return "XYZ". Punctuation, numbers, whitespace and
     * other non-letter characters should be left unchanged. NOTE: For full
     * credit you are REQUIRED to use a StringBuilder to build the String in
     * this method rather than using String concatenation.
     *
     * @param input
     *            String to be encrypted
     * @param shift
     *            Amount to shift each character of input to the right
     * @return the encrypted String as outlined above
     */
    public static String shift(String input, int shift) {
StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            boolean lowercase = Character.isLowerCase(temp);
            boolean uppercase = Character.isUpperCase(temp);
            boolean letter = Character.isLetter(temp);
            boolean positive = true;
            //if (shift < 0)
            	//positive = false;
            if (uppercase && letter) {
            	int pos = UPPERCASE.indexOf(temp);
            	int newPos = (pos + shift)%26 ;
            	if (newPos < 0)
            		newPos=newPos+26;
            	char newTemp = UPPERCASE.charAt(newPos);
            
            sb.append(newTemp);
            }
            else if (lowercase && letter) {
            	int pos = LOWERCASE.indexOf(temp);
            	int newPos = (pos + shift) % 26;
            	if (newPos < 0)
            		newPos=newPos+26;
            	char newTemp = LOWERCASE.charAt(newPos);
            	
            	sb.append(newTemp);
            }
            else {
            sb.append(temp);
            }
        }
        
        return sb.toString();
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        
    }

    /**
     * Displays the message "promptMsg" to the user and reads the next full line
     * that the user enters. If the user enters an empty string, reports the
     * error message "ERROR! Empty Input Not Allowed!" and then loops,
     * repeatedly prompting them with "promptMsg" to enter a new string until
     * the user enters a non-empty String
     *
     * @param in
     *            Scanner to read user input from
     * @param promptMsg
     *            Message to display to user to prompt them for input
     * @return the String entered by the user
     */
    public static String promptForString(Scanner in, String promptMsg) {
    	System.out.print(promptMsg);
    	String a = in.nextLine();
    	while (a.length() ==0) {
    		System.out.println("ERROR! Empty Input Not Allowed!");
    		System.out.print(promptMsg);
    		a = in.nextLine();
    	}
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return a;
    }

    /**
     * Opens the file inFile for reading and the file outFile for writing,
     * reading one line at a time from inFile, shifting it the number of
     * characters given by "shift" and writing that line to outFile. If an
     * exception occurs, must report the error message: "ERROR! File inFile not
     * found or cannot write to outFile" where "inFile" and "outFile" are the
     * filenames given as parameters.
     *
     * @param inFile
     *            the file to be transformed
     * @param outFile
     *            the file to write the transformed output to
     * @param shift
     *            the amount to shift the characters from inFile by
     * @return false if an exception occurs and the error message is written,
     *         otherwise true
     */
    public static boolean transformFile(String inFile, String outFile,
            int shift) {
    	boolean works = true;
    	try {
    		File textFile = new File(inFile);
        	Scanner textScanner = new Scanner(textFile);      	
            
          
            	File outTextFile = new File(outFile);
            	PrintWriter textWriter = new PrintWriter(outTextFile);
    	while (textScanner.hasNext()) {
    		String str = textScanner.nextLine();    		    		
    		textWriter.println(shift(str, shift));}
    	
    	textScanner.close();
    	textWriter.close();
        //TODO: Prompt the user for a filename

        //TODO: Open the file and print each line to the screen.
        //TODO: Don't forget to close the file when you are done.
        
    	
        }
    	catch (FileNotFoundException e) {
        	System.out.print("ERROR! File "+inFile+ "not found or cannot write to "+outFile);
        	works = false;
        }
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return works;
    }

    /**
     * Prompts the user to enter a single character choice. The only allowable
     * values are 'E', 'D' or 'Q'. All other values are invalid, including all
     * values longer than one character in length, however the user is allowed
     * to enter values in either lower or upper case. If the user enters an
     * invalid value, the method displays the error message "ERROR! Enter a
     * valid value!" and then prompts the user repeatedly until a valid value is
     * entered. Returns a single uppercase character representing the user's
     * choice.
     *
     * @param in
     *            Scanner to read user choices from
     * @return the user's choice as an uppercase character
     */
    public static char getChoice(Scanner in) {
    	System.out.print("Enter your choice: ");
    	String choice = in.nextLine();
    	while (choice.length()>1 || choice.charAt(0) != 'e' && choice.charAt(0) != 'E' && choice.charAt(0) != 'D' && choice.charAt(0) != 'd' && choice.charAt(0) != 'q' && choice.charAt(0) != 'Q') {
    		System.out.println("ERROR! Enter a valid value!");
    		System.out.print("Enter your choice: ");
    		choice = in.nextLine();
    	}
    	char valid = choice.charAt(0);
    	boolean lower = Character.isLowerCase(valid);
    	if (lower)
    		valid = Character.toUpperCase(valid);

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return valid;
    }

    /**
     * Displays the menu of choices to the user.
     */
    public static void displayMenu() {
        System.out.println("[E]ncode a file");
        System.out.println("[D]ecode a file");
        System.out.println("[Q]uit");
    }

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	displayMenu();
    	char a = getChoice(in);
    	while (a != 'Q') {
    		String inP = "Enter an input file: ";
    		String inFile = promptForString(in, inP);
    		
    		String outP = "Enter an output file: ";
    		String outFile = promptForString(in, outP);
    				
    		String numP ="Enter a shift amount: ";
    		int shift = Integer.parseInt(promptForString(in, numP));
    		
    		boolean go = transformFile(inFile,outFile,shift);
    		if (go) {
    			System.out.println("Finished writing to file.");
    		}
    	    System.out.println(); 
    	    displayMenu();
    		a = getChoice(in);
    	}
    	System.out.println();
        System.out.println("Goodbye!");

        // TODO - complete this procedure with your own implementation

        in.close();
    }

}