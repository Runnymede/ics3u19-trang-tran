package tran.culminating;

import java.util.Scanner;
/**
 * This program is meant for testing the logistics of Mancala without 
 * the graphics. 
 * Date: January 15, 2020
 * @author Trang Tran
 */
public class Testing {
	static boolean playerTurn=true;

	/**
	 * Start of the program
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner (System.in);
		
		int [] mancalaHoles= {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
		String playerAnswer;
		int index=0;
		playerAnswer=sc.next();

		while(playerAnswer.equalsIgnoreCase("yes")) {
			while (gameOver(mancalaHoles)==false) {

				System.out.println(playerTurn);
				for (int i=0;i<mancalaHoles.length; i++) {
					System.out.println(i+". "+mancalaHoles[i]);
				}
				System.out.println("Player 1: "+mancalaHoles[6]);
				System.out.println("Player 2: "+mancalaHoles[13]);
				
				if (playerTurn==true) {
					//Player 1's holes would be the bottom row and scoring will be right
					System.out.println("Which hole will you take the beads out of?");
					index=sc.nextInt();
					while (index==6||index==7||index==8||index==9||index==10||index==11||index==12||index==13) {
						System.out.println("Why are you trying to cheat???? Enter another hole: ");
						index=sc.nextInt();
					}
					turns(dropBeads(index, mancalaHoles));

				}
				else {
					//Player 2's holes would be the top row and scoring will be left
					System.out.println("Which hole will you take the beads out of?");
					index=sc.nextInt();
					while (index==0||index==1||index==2||index==3||index==4||index==5||index==6||index==13) {
						System.out.println("Why are you trying to cheat???? Enter another hole: ");
						index=sc.nextInt();
					}
					turns(dropBeads(index, mancalaHoles));

				}

			}
			mancalaHoles[6]+=mancalaHoles[0]+mancalaHoles[1]+mancalaHoles[2]+mancalaHoles[3]+mancalaHoles[4]+mancalaHoles[5];
			mancalaHoles[13]+=mancalaHoles[7]+mancalaHoles[8]+mancalaHoles[9]+mancalaHoles[10]+mancalaHoles[11]+mancalaHoles[12];
			if (mancalaHoles[6]>mancalaHoles[13]) {
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
	 * @param holes - the array that stores the amount of beads in each hole
	 */
	public static int dropBeads(int index, int []holes) {
		int maxBeads=holes[index];
		int lastIndex=0;
		int counter=1;

		holes[index]=0;
		
		//depositing the beads
		for (int currentIndex=index+1;counter<=maxBeads;currentIndex++) {
			//Skip the opponent's mancala 
			if (playerTurn==false&&currentIndex==6) {
				currentIndex=7;
			}
			if (playerTurn==true&&currentIndex==13) {
				currentIndex=0;
			}
			
			if (currentIndex==14) {
				currentIndex=0;
			}
			holes[currentIndex]+=1;
			lastIndex=currentIndex;
			counter++;
		}
		
		if (holes[lastIndex]==1&&lastIndex!=13&&lastIndex!=6) {
			capture(lastIndex, holes.length-(lastIndex+2), holes);
		}
		
		return lastIndex;
	}

	
	//TODO: CAPTURE IS WRONG!! Eg. moved 5 beads and the last one landed
	//on empty hole ON THE OTHER SIDE and captured.
	/**
	 * Method "capture" follows the "capturing" process of the game. If the last
	 * bead of a player's turn moves to an empty hole on their side, the player 
	 * is able to capture the beads directly parallel to that hole.
	 * @param index1 - the hole that the user chose to take all the beads out of
	 * @param index2 - the hole parallel to index1
	 * @param holes - the array that stores the amount of beads in each hole
	 */
	public static void capture(int index1, int index2, int []holes) {
		if (playerTurn==true){
			if (index2!=0&&(index1==0||index1==1||index1==2||index1==3||index1==4||index1==5)) {
				holes[6]+=holes[index2]+1;
				holes[index1]=0;
				holes[index2]=0;
			}
		}
		else {
			if (index2!=0&&(index1==7||index1==8||index1==9||index1==10||index1==11||index1==12)) {
				holes[13]+=holes[index2]+1;
				holes[index1]=0;
				holes[index2]=0;
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
		else {
			//switch the players
			if (playerTurn==true) {
				playerTurn=false;
			}
			else {
				playerTurn=true;
			}
		}
		
	}
}
