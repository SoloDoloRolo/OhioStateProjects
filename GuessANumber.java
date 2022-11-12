
import java.util.Random;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Random rnd = new Random();
		
		System.out.print("Enter a random seed: ");
		
		int seed = keyboard.nextInt();
		
		System.out.print("Enter a guess between 1 and 200: ");
		
		int guess = keyboard.nextInt();
		
		int r = rnd.nextInt(200)+1;
		
		int tries = 1;
		
		while (guess != r) {
			
			
			if (guess < 1 | guess > 200) {
				System.out.println("Your guess is out of range.  Pick a number between 1 and 200.");
			}
			
			
			if (guess > r) {
				System.out.println("Your guess was too high - try again.");
				System.out.println();

			}
			
			if  (guess < r) {
				System.out.println("Your guess was too low - try again.");
				System.out.println();
			}		
		
		
			
			
				System.out.print("Enter a guess between 1 and 200: ");
			
				guess = keyboard.nextInt();
				
				
	
			
			//update
				 tries++;
			
		}
			
				System.out.print("Congratulations!  Your guess was correct!");
				//spaces between the prompt
				System.out.println();
				
				System.out.println();
				
				System.out.println("I had chosen " + r + " as the target number.");
				
				System.out.println("You guessed it in " + tries + " tries.");
				//1                     That was impossible!
				//2-3                   You're pretty lucky!
				//4-7                   Not bad, not bad...
				//8                     That was not very impressive.
				//9-10                  Are you having any fun at all?
				//11 or more            Maybe you should play something else.
				if (tries == 1) {
					System.out.println("That was impossible!");
				}
				
				if (tries >= 2 && tries <= 3) {
					System.out.println("You're pretty lucky!");
				}
				
				if (tries >= 4 && tries <= 7) {
					System.out.println("Not bad, not bad...");
				}
				
				if (tries == 8) {
					System.out.println("That was not very impressive.");
				}
				
				if (tries == 9 && tries == 10) {
					System.out.println("Are you having any fun at all?");
				}
				
				if (tries >= 11) {
					System.out.println("Maybe you should play something else.");
				}
	}

	}


