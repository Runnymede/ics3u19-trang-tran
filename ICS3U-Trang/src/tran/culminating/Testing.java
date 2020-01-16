package tran.culminating;

import java.util.Scanner;
/**
 * This program is meant for testing the logistics of Mancala without 
 * the graphics. All aspects of the code (escept graphics) will be tested in here 
 * and transfered to the final game.
 * Date: January 15, 2020
 * @author Trang Tran
 */
public class Testing {
	static boolean playerTurn=true;
	static int [] scores= {0,0};
	private static int [] mancalaHoles= {4,4,4,4,4,4,0,4,4,4,4,4,4,0};

	/**
	 * Start of the program
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner (System.in);

		String playerAnswer;
		int index=0;
		playerAnswer=sc.next();

		while(playerAnswer.equalsIgnoreCase("yes")) {
			while (gameOver(mancalaHoles)==false) {

				System.out.println(playerTurn);
				for (int i=0;i<mancalaHoles.length; i++) {
					System.out.println(i+". "+mancalaHoles[i]);
				}
				for (int i=0;i<scores.length;i++) {
					System.out.println("Player "+i+": "+scores[i]);
				}

				if (playerTurn==true) {
					//Player 1's holes would be the bottom row and scoring will be right
					System.out.println("Which hole will you take the beads out of?");
					index=sc.nextInt();
					while (index==6||index==7||index==8||index==9||index==10||index==11||index==12||index==13) {
						System.out.println("Why are you trying to cheat???? Enter another hole: ");
						index=sc.nextInt();
					}
					dropBeads(index);

					//checks if they get another turn
					if (playTurnAgain()==true) {
						playerTurn=true;
					}
					else {
						playerTurn=false;
					}


				}
				else {
					//Player 2's holes would be the top row and scoring will be left

					System.out.println("Which hole will you take the beads out of?");
					index=sc.nextInt();
					while (index==0||index==1||index==2||index==3||index==4||index==5||index==6||index==13) {
						System.out.println("Why are you trying to cheat???? Enter another hole: ");
						index=sc.nextInt();
					}
					dropBeads(index);

					//checks if they get another turn
					if (playTurnAgain()==true) {
						playerTurn=false;
					}
					else {
						playerTurn=true;
					}

				}

			}
			if (scores[0]>scores[1]) {
				System.out.println("PLAYER 1 WINS!!");
			}
			else {
				System.out.println("PLAYER 2 WINS!!");
			}
			System.out.println("Do you want to play again?");
			playerAnswer=sc.next();
			Thread.sleep(3000);

		}
		System.out.println("Come back when you wanna play again!");
		Thread.sleep(5000);
		
	}


	/**
	 * Method "dropBeads" will deposit one stone in the next hole in a 
	 * counter-clockwise motion(after the hole the user chose). This method 
	 * will also keep track of where the last bead is deposited. 
	 * This method will also call playerTurnAgain and capture.
	 * @param index - the hole that the user chose to take all the beads out of
	 */
	public static void dropBeads(int index) {
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
				mancalaHoles[13]+=1;

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

		//call the capture method if the last bead ends in a hole that was previously empty
		if (mancalaHoles[lastIndex]==1) {
			capture(lastIndex);
		}

	}

	//TODO: fix the capture aspect
	/**
	 * Method "capture" follows the "capturing" process of the game. If the last
	 * bead of a player's turn moves to an empty hole on their side, the player 
	 * is able to capture the beads directly parallel to that hole.
	 * @param index1 - the hole that the user chose to take all the beads out of
	 */
	public static void capture(int index1) {
		if (playerTurn==true) {
			if (index1==0) {
				scores[0]+=mancalaHoles[12];
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

	//TODO: test this gameOver sequence
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

	//TODO: Figure how to incorporate this method. **NEED LAST INDEX**
	/**
	 * Method "playTurnAgain" checks whether the last bead moved to the mancala. 
	 * This allows the player to have an extra turn.
	 * @param holes - the array that stores the amount of beads in every hole
	 * @return true if the last bead moved to the mancala.
	 */
	public static boolean playTurnAgain(int lastIndex) {
		
		return false;
	}
}
