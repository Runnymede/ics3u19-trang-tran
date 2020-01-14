package tran.culminating;
import java.awt.*;
import hsa_new.Console;
import java.awt.color.*;

/**
 * ICS3U Culminating game program 
 * This program is meant to run the game Mancala upon user's request.
 * Date: January 13, 2020
 * @author Trang Tran
 */
public class Mancala {
	static Console c = new Console (44, 156, "Mancala");
	static boolean playerTurn=true;

	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args)  throws InterruptedException{
		int [] playerHoles= {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
		String playerAnswer;
		int index=0;
		
		//Introduction to the game and asks the user if the want to play
		c.println("MANCALA", 24);
		c.println("If you don't know what this game is, it's a board game. "
				+ "The game has a board with 14 holes.");
		c.print("Two big holes at the ends (called the Mancala) and "
				+ "12 small holes lined in two rows in the middle. "
				+ "\nIn every hole in the middle, there are 4 beads. "
				+ "In total, there are 48 beads. \nThese beads are used "
				+ "to score and keep the game going. \r\n");
		c.println("**********************************************************************************");
		c.println("RULES:");
		c.println("1. Every hole (except mancala) starts with 4 beads");
		c.println("2. The mancala on your right is your scoring and the row of holes nearest to you is your side");
		c.println("3. The game begins with one player picking up all of the beads in any one of the holes on their side");
		c.println("4. The player deposits one stone in the next hole and the hole after that, in a counter-clockwise motion, until the stones run out.");
		c.println("5. You’re not allowed to take beads from your opponent's side");
		c.println("6. Your own Mancala counts as a hole but your opponent's Mancala does not count, so skip it and continue moving to the next holes");
		c.println("7. Always place all captured beads in your Mancala");
		c.println("8. The game ends when all six holes on a player's side of the Mancala board are empty");
		c.println("9. The player who still has beads on their side of the board when the game ends, captures all of them");
		c.println("10. Count all the beads in each Mancala. The winner is the player with the most beads");
		c.println();
		c.println("SPECIAL RULES:");
		c.println("1. If you end your turn by putting a bead in your own mancala then you get a free turn");
		c.println("2. If the last bead you drop is in an empty hole on your side, you capture that bead and any beads in the hole directly opposite");
		c.println("**********************************************************************************");
		c.println("Do you want to play?");
		playerAnswer=c.readLine();
		Thread.sleep (1000/30);
		c.clear();
		
		//Repeat the game code if the user wants to play again
		do {
			while (gameOver(playerHoles)==false) {
				if (playerTurn==true) {
					drawScreen(playerHoles);
					c.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					c.println("Which hole will you take the beads out of?");
					index=c.readInt();
					dropBeads(playerHoles, index);
					
					if (playAgain(playerHoles)==true) {
						playerTurn=true;
					}
					else {
						playerTurn=false;
					}
					
					c.clear();
					
				}
				else {
					drawScreen(playerHoles);
					c.println("Which hole will you take the beads out of?");
					index=c.readInt();
					dropBeads(playerHoles, index);
					
					if (playAgain(playerHoles)==true) {
						playerTurn=false;
					}
					else {
						playerTurn=true;
					}
					c.clear();
				}
			}
			
			drawScreen (playerHoles);
			c.println("Do you want to play again?");
			playerAnswer=c.readLine();
			Thread.sleep(3000);
			c.clear();
		}while(playerAnswer.equalsIgnoreCase("yes"));
		
		System.out.println("Come back when you wanna play again!");
		Thread.sleep(5000);
		c.close();
	}

	/**
	 * Method "drawScreen" will draw the Mancala board after each turn.
	 * @param holes
	 */
	public static void drawScreen(int [] holes) {
		c.drawRect(8,9,20,10);
		
	}

	/**
	 * 
	 * @param holes
	 * @param index
	 */
	public static void dropBeads(int [] holes, int index) {
		int maxBeads=holes[index];
		holes[index]=0;
		for (int i=index+1;i<=maxBeads;i++) {
			holes[i]+=1;
		}
	}

	/**
	 * 
	 * @param index1
	 * @param index2
	 */
	public static void capture(int index1, int index2) {
		
	}

	/**
	 * 
	 * @param holes
	 * @return
	 */
	public static boolean gameOver(int [] holes) {

		return false;
	}

	/**
	 * 
	 * @param holes
	 * @return
	 */
	public static boolean playAgain(int [] holes) {

		return true;
	}
}
