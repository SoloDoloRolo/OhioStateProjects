/**
 * Program to copy one file into another, using command line arguments
 *
 * @author Solomon  Bryant
 * @author Clayton 
 * @version DATE HERE
 *
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class CopyFile {

    /**
     * Returns the reverse of the input String inString.
     *
     * @param inString
     *            the String to be reversed
     * @return the reverse of inString
     */
    public static String reverse(String inString) {
    	int length = inString.length();
    	String a="";
    	for (int i = 0; i < length; i++) {
    		a = a+inString.charAt(length-1-i);}
    	
    	
        // TODO - complete this function

        // TODO - the following line is only here to allow this program to
        //  compile.  Replace it and remove this comment when you complete
        //  this method.
        return a;
    	
    }

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter name of filename for input: ");
    	String name = in.nextLine();
    	System.out.print("Enter name of filename for output: ");
    	String outName = in.nextLine();
    	
    	try {
    		File textFile = new File(name);
        	Scanner textScanner = new Scanner(textFile);      	
            
          
            	File outTextFile = new File(outName);
            	PrintWriter textWriter = new PrintWriter(outTextFile);
    	while (textScanner.hasNext()) {
    		String str = textScanner.nextLine();
    		String upperCase = str.toUpperCase();
    		textWriter.println(reverse(upperCase));}
    	
    	textScanner.close();
    	textWriter.close();
        //TODO: Prompt the user for a filename

        //TODO: Open the file and print each line to the screen.
        //TODO: Don't forget to close the file when you are done.
        
    	
        } catch (FileNotFoundException e) {
        	System.out.print("Error - cannor open file "+name);
        }
       in.close();
       
        
    	
          
          
        }
}

    

