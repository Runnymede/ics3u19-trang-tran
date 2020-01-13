package tran.culminating;
import java.awt.*;
import hsa_new.Console;

/**
 * 
 * Date: January 13, 2020
 * @author Trang Tran
 */
public class Mancala {
	static Console c = new Console (320, 240, "Mancala");
	static boolean playerTurn=true;

	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args)  throws InterruptedException{
		int [] playerHoles= {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
		String playerAnswer;
		int index=0;
		
		c.println("MANCALA");
		c.println("If you don't know what this game is, it's a board game. ");
		c.println("The game has a board with 14 holes. "
				+ "Two big holes at the ends (called the Mancala) and "
				+ "12 small holes lined in two rows in the middle. "
				+ "In every hole in the middle, there are 4 beads. "
				+ "In total, there are 48 beads. These beads are used "
				+ "to score and keep the game going. \r\n");
		c.println("*************************************************************");
		c.println("RULES:");
		c.println("");
		c.println("SPECIAL RULES:");
		c.println("");
		c.println("Do you want to play?");
		playerAnswer=c.readLine();
		 
		Thread.sleep (1000/30);
		do {
			while (gameOver(playerHoles)==false) {
				if (playerTurn==true) {
					drawScreen(playerHoles);
					c.println("Which hole will you take the beads out of?");
					index=c.readInt();
					dropBeads(playerHoles, index);
					
					if (playAgain(playerHoles)==true) {
						playerTurn=true;
					}
					else {
						playerTurn=false;
					}
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
				}
			}
			
			drawScreen (playerHoles);
			c.println("Do you want to play again?");
			playerAnswer=c.readLine();
		}while(playerAnswer.equalsIgnoreCase("yes"));
	}

	/**
	 * 
	 * @param holes
	 */
	public static void drawScreen(int [] holes) {

	}

	/**
	 * 
	 * @param holes
	 * @param index
	 */
	public static void dropBeads(int [] holes, int index) {

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
