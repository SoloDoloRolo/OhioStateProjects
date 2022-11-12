/**
 * 
 */

/**
 * @author solocup
 
 */

import java.util.Scanner;

public class BarChartScoreboard {
	

	public static void main(String[] args) {
		
		
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter the number of players: ");
			int numplayers = keyboard.nextInt();
			keyboard.nextLine();
			if (numplayers == 0) {
				System.out.println("No players to display?  Goodbye!");
				System.exit(0);
				}
			
			String [] PlayerName = new String [numplayers];
			int [] PlayerScore = new int [numplayers];
			int longstring = 0;
			int maxi = 0;
			
			for ( int i = 0 ; numplayers > i; i++) {
				
				System.out.print("Enter a player name: ");
				String player = keyboard.nextLine();
				
				if (player.length() > longstring) {
					longstring = player.length();
					}
				
				PlayerName[i] = player;
				
				System.out.print("Enter the score for " + player + ": ");
				int score = keyboard.nextInt();
				keyboard.nextLine();
				
				if (score > maxi) {
					maxi = score;
					}
	
				
				PlayerScore [i] = score;
				System.out.println();
				
			}
			
			
				double maxScore = maxi;
				double numStarsMath;
				double numStars;
				
			
			System.out.println("Current Scoreboard");
			System.out.println("------------------");
			
			for (int i = 0 ; i < numplayers ; i++ ) {
				System.out.print(PlayerName[i]);

				for (int s = PlayerName[i].length(); s < longstring + 1; s++) {
					System.out.print(" ");
					}
				numStarsMath = (PlayerScore[i] / maxScore) * 50;
				numStars = Math.floor(numStarsMath);
				for (int n = 0; n < numStars; n++) {
					System.out.print("*");
					
					}
				System.out.println();
				}
			keyboard.close();
			}

}
