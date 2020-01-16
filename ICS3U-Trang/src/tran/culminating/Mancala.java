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
	static int [] mancalaHoles= {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
	/**
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
			while (gameOver(mancalaHoles)==false) {
				drawScreen(mancalaHoles);

				if (playerTurn==true) {
					c.println("Which hole will you take the beads out of?");
					index=c.readInt();
					while (index==7||index==8||index==9||index==10||index==11||index==12||index==13||index==6) {
						c.println("Why are you trying to cheat???? Enter another hole: ");
						index=c.readInt();
					}
					turns(dropBeads(index));
					c.clear();

				}
				else {
					c.println("Which hole will you take the beads out of?");
					index=c.readInt();
					while (index==0||index==1||index==2||index==3||index==4||index==5||index==6||index==13) {
						c.println("Why are you trying to cheat???? Enter another hole: ");
						index=c.readInt();
					}
					turns(dropBeads(index));
					c.clear();
				}
			}

			if (scores[0]>scores[1]) {
				System.out.println("PLAYER 1 WINS!!");
			}
			else {
				System.out.println("PLAYER 2 WINS!!");
			}
			drawScreen (mancalaHoles);
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
		Color woodBrown = new Color(222, 184, 135);
		Color tan = new Color(212, 174, 125);
		
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
	public static int dropBeads(int index) {
		int maxBeads=mancalaHoles[index];
		int lastIndex=0;
		mancalaHoles[index]=0;
		int counter=1;

		//depositing the beads
		for (int currentIndex=index+1;counter<=maxBeads;currentIndex++) {
			System.out.println("TEST"+currentIndex);

			//skip player 2's mancala when it's player 1's turn & vice versa
			if (playerTurn==true&&currentIndex==13) {
				currentIndex=1;
			}
			if (playerTurn==false&&currentIndex==6) {
				currentIndex=7;
			}

			//keep sowing if it reaches hole 13
			if (currentIndex==13) {
				mancalaHoles[13]=1;

				//Player 2 scores a point
				if (playerTurn==false&&currentIndex==13) {
					scores[1]+=1;
				}
				counter++;
				currentIndex=0;
			}

			mancalaHoles[currentIndex]+=1;      
			lastIndex=currentIndex;

			//add the score when a bead lands in a player 1's mancala
			if (playerTurn==true&&currentIndex==6) {
				scores[0]+=1;
			}

			//counts how many iterations it has done and compares to max of the beads
			counter++;
		}
		return lastIndex;

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
				scores[0]+=mancalaHoles[12]+1;
				mancalaHoles[12]=0;
				mancalaHoles[0]=0;
			}
			else if (index1==1) {
				scores[0]+=mancalaHoles[11]+1;
				mancalaHoles[11]=0;
				mancalaHoles[1]=0;
			}
			else if (index1==2) {
				scores[0]+=mancalaHoles[10]+1;
				mancalaHoles[2]=0;
				mancalaHoles[10]=0;
			}
			else if (index1==3) {
				scores[0]+=mancalaHoles[9]+1;
				mancalaHoles[3]=0;
				mancalaHoles[9]=0;
			}
			else if (index1==4) {
				scores[0]+=mancalaHoles[8]+1;
				mancalaHoles[4]=0;
				mancalaHoles[8]=0;
			}
			else if (index1==5) {
				scores[0]+=mancalaHoles[7]+1;
				mancalaHoles[5]=0;
				mancalaHoles[7]=0;
			}
		}
		else {
			if (index1==7) {
				scores[1]+=mancalaHoles[5]+1;
				mancalaHoles[5]=0;
				mancalaHoles[7]=0;
			}
			else if (index1==8) {
				scores[1]+=mancalaHoles[4]+1;
				mancalaHoles[4]=0;
				mancalaHoles[8]=0;
			}
			else if (index1==9) {
				scores[1]+=mancalaHoles[3]+1;
				mancalaHoles[3]=0;
				mancalaHoles[9]=0;
			}
			else if (index1==10) {
				scores[1]+=mancalaHoles[2]+1;
				mancalaHoles[2]=0;
				mancalaHoles[10]=0;
			}
			else if (index1==11) {
				scores[1]+=mancalaHoles[1]+1;
				mancalaHoles[11]=0;
				mancalaHoles[1]=0;
			}
			else if (index1==12) {
				scores[1]+=mancalaHoles[0]+1;
				mancalaHoles[12]=0;
				mancalaHoles[0]=0;
			}
		}

	}

	/**
	 * Method "gameOver" checks whether a player's side has no beads. 
	 * This indicates a game over according to the rules.
	 * @param holes - the array that stores the amount of beads in every hole
	 * @return true when the game is over 
	 */
	public static boolean gameOver(int [] holes) {
		if (holes[0]==0&&holes[1]==0&&holes[2]==0&&holes[3]==0&&holes[4]==0&&holes[5]==0) {
			return true;
		}
		if (holes[7]==0&&holes[8]==0&&holes[9]==0&&holes[10]==0&&holes[11]==0&&holes[12]==0){
			return true;
		}
		return false;
	}

	/**
	 * Method "turns" switches the turns and
	 * checks whether the last bead moved to the mancala. 
	 * This allows the player to have an extra turn.
	 * @param lastIndex - 
	 */
	public static void turns(int lastIndex) {

		//if the last bead lands in the mancala, the player goes again
		if (playerTurn==true&&lastIndex==6) {
			playerTurn=true;
		}
		else if (playerTurn==false&&lastIndex==13) {
			playerTurn=false;
		}

		//Switch the players
		if (playerTurn==true) {
			playerTurn=false;
		}
		else {
			playerTurn=true;
		}
	}
}
