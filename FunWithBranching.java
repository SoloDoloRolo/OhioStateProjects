 /**Program that generates random math problems for 
 * user to answer and then displays the percentage correct.
 * @author Solomon Bryant
 *@version 09182019
 */
import java.util.Random;
import java.util.Scanner;
public class FunWithBranching {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a random number seed: ");
		int seed = Integer.parseInt(keyboard.nextLine());
		Random rnd = new Random(seed);
		
		int firstNum = rnd.nextInt(20)+ 1;
        int secNum = rnd.nextInt(20) +1;
        
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Hello "+name+"!");
        System.out.println("Please answer the following questions:");
        System.out.println("");
        int ans;       
        int count = 0; 
        // Start of series of if and else statements to
        // display wrong or correct and add to count if correct
        System.out.print(firstNum+" + "+secNum+" = ");
        ans = Integer.parseInt(keyboard.nextLine());
        
        if (ans == (firstNum+secNum)) {
        	count++;
        	System.out.println("Correct!");
        	System.out.println("");
        }
        	else {
        		System.out.println("Wrong!");
        		System.out.println("The correct answer is: "+(firstNum+secNum));
        		System.out.println("");
        	}
        System.out.print(firstNum+" - "+secNum+" = ");
        ans = Integer.parseInt(keyboard.nextLine());
        
        if (ans == (firstNum-secNum)) {
        	count++;
        	System.out.println("Correct!");
        	System.out.println("");
        }
        	else {
        		System.out.println("Wrong!");
        		System.out.println("The correct answer is: "+(firstNum-secNum));
        		System.out.println("");
        	}
        System.out.print(firstNum+" * "+secNum+" = ");
        ans = Integer.parseInt(keyboard.nextLine());
        
        if (ans == (firstNum*secNum)) {
        	count++;
        	System.out.println("Correct!");
        	System.out.println("");
        }
        	else {
        		System.out.println("Wrong!");
        		System.out.println("The correct answer is: "+(firstNum*secNum));
        		System.out.println("");
        	}
        System.out.print(firstNum+" / "+secNum+" = ");       
        ans = Integer.parseInt(keyboard.nextLine());
        
        if (ans == (firstNum/secNum)) {
        	count++;
        	System.out.println("Correct!");
        	System.out.println("");
        }
        	else {
        		System.out.println("Wrong!");
        		System.out.println("The correct answer is: "+(firstNum/secNum));
        		System.out.println("");
        	}
        	System.out.print(firstNum+" % "+secNum+" = ");
            ans = Integer.parseInt(keyboard.nextLine());
            
            if (ans == (firstNum%secNum)) {
             	count++;
               	System.out.println("Correct!");
                System.out.println("");
                }
                	else {
                		System.out.println("Wrong!");
                		System.out.println("The correct answer is: "+(firstNum%secNum));
                		System.out.println("");
                	}
                System.out.println("You got "+ count + " correct answers!");
                System.out.print("That's ");
                // If statements to print the percentage correct
                // depending on count
                if (count == 0) {
                	System.out.println("00.0%"+"!");
                }  
                if (count == 1) {
                	System.out.println("20.0%"+"!");
                }
                if (count == 2) {
                	System.out.println("40.0%"+"!");
                }
                if (count == 3) {
                	System.out.println("60.0%"+"!");
                }
                if (count == 4) {
                	System.out.println("80.0%"+"!");
                }
                if (count == 5) {
                	System.out.println("100.0%"+"!");
                }
                }
	
        	}
        
	


