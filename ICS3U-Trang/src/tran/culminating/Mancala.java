package tran.culminating;
import java.awt.*;
import hsa_new.Console;

/**
 * ICS3U Culminating game program 
 * This program is meant to run the game Mancala upon user's request.
 * Date: January 13, 2020
 * @author Trang Tran
 */
public class Mancala {

	//Global Variables
	static Console c = new Console (44, 156, "Mancala");
	static boolean playerTurn=true;
	static int [] scores= {0,0};
	static int [] playerHoles= {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
	static Color woodBrown = new Color(222, 184, 135);
	static Color tan = new Color(212, 174, 125);
	static Font fontTitle=new Font("Times New Roman", Font.PLAIN, 90);

	;	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args)  throws InterruptedException{

		String playerAnswer;
		int index=0;

		//Introduction to the game and asks the user if the want to play
		c.println("Mancala");
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
		c.println("5. You're not allowed to take beads from your opponent's side");
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
		while(playerAnswer.equalsIgnoreCase("yes")) {
			while (gameOver(playerHoles)==false) {
				if (playerTurn==true) {
					//Player 1's holes would be the bottom row and scoring will be right
					drawScreen(playerHoles);
					c.println("Which hole will you take the beads out of?");
					index=c.readInt();
					if (index==7||index==8||index==9||index==10||index==11||index==12||index==13) {
						c.println("Why are you trying to cheat???? Enter another hole: ");
						index=c.readInt();
					}
					dropBeads(playerHoles, index);

					if (playTurnAgain(playerHoles)==true) {
						playerTurn=true;
					}
					else {
						playerTurn=false;
					}

					c.clear();

				}
				else {
					//Player 2's holes would be the top row and scoring will be left
					drawScreen(playerHoles);
					c.println("Which hole will you take the beads out of?");
					index=c.readInt();
					if (index==0||index==1||index==2||index==3||index==4||index==5||index==6) {
						c.println("Why are you trying to cheat???? Enter another hole: ");
						index=c.readInt();
					}
					dropBeads(playerHoles, index);

					if (playTurnAgain(playerHoles)==true) {
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
		}

		System.out.println("Come back when you wanna play again!");
		Thread.sleep(5000);
		c.close();
	}

	/**
	 * Method "drawScreen" will draw the Mancala board, print the score board
	 * and print the player turn indication board after each turn.
	 * @param holes - the array that stores the amount of beads in every hole
	 */
	public static void drawScreen(int [] holes) {
		c.setColor(woodBrown);
		c.fillRect(20,200,1190,400);
		c.setColour(tan);
		c.fillOval(28,235, 150, 325);

	}

	/**
	 * Method "dropBeads" will deposit one stone in the next hole in a 
	 * counter-clockwise motion(after the hole the user chose). This method 
	 * will also keep track of where the last bead is deposited. 
	 * This method will also call playerTurnAgain and capture.
	 * @param holes - the array that stores the amount of beads in every hole
	 * @param index - the hole that the user chose to take all the beads out of
	 */
	public static void dropBeads(int [] holes, int index) {
		int maxBeads=holes[index];
		int lastIndex=0, curerntIndex;
		holes[index]=0;

		//Sowing the beads
		for (curerntIndex=index+1;curerntIndex<=maxBeads;curerntIndex++) {

			//skip player 2's Mancala when it's player 1's turn & vise versa
			if (playerTurn==true&&curerntIndex==13) {
				curerntIndex=1;
			}
			if (playerTurn==false&&curerntIndex==6) {
				curerntIndex=7;
			}

			//keep sowing if it reaches hole 13
			if (curerntIndex==13) {
				curerntIndex=1;
			}

			//add the score when a bead lands in a players mancala
			if (playerTurn==true&&curerntIndex==6) {
				scores[0]+=1;
			}
			if (playerTurn==false&&curerntIndex==13) {
				scores[1]+=1;
			}

			holes[curerntIndex]+=1;
			lastIndex=curerntIndex;
		}

		//call the capture method if the last bead ends in a hole that was previously empty
		if (holes[lastIndex]==1) {
			capture(lastIndex);
		}

	}

	/**
	 * Method "capture" follows the "capturing" process of the game. If the last
	 * bead of a player's turn moves to an empty hole on their side, the player 
	 * is able to capture the beads directly parallel to that hole.
	 * @param index1 - the hole that the user chose to take all the beads out of
	 */
	public static void capture(int index1) {
		if (playerTurn==true) {
			if (index1==0) {
				scores[0]+=playerHoles[12];
			}
			else if (index1==1) {

			}
			else if (index1==1) {

			}
			else if (index1==1) {

			}
		}
		else {

		}

	}

	/**
	 * Method "gameOver" checks whether a player's side has no beads. 
	 * This indicates a game over according to the rules.
	 * @param holes - the array that stores the amount of beads in every hole
	 * @return true when the game is over 
	 */
	public static boolean gameOver(int [] holes) {

		return false;
	}

	/**
	 * Method "playTurnAgain" checks whether the last bead moved to the mancala. 
	 * This allows the player to have an extra turn.
	 * @param holes - the array that stores the amount of beads in every hole
	 * @return true if the last bead moved to the mancala.
	 */
	public static boolean playTurnAgain(int [] holes) {

		return true;
	}
}
