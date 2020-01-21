package tran.culminating;
import java.awt.*;
import hsa_new.Console;
import java.awt.Image;
import java.awt.Font;

/**
 * ICS3U Culminating Game Program
 * This program is meant to run the game Mancala upon user request.
 * Date: January 13, 2020
 * @author Trang Tran
 */
public class Mancala {

	//Global Variables
	static Console c = new Console (44, 156, "Mancala");
	static boolean playerTurn=true;//switches the players
	static int [] mancalaHoles= {4,4,4,4,4,4,0,4,4,4,4,4,4,0};//stores the amount of beads in every hole
	static Font font1=new Font("New Times Roman", 20, 16);//font used for questions
	static Font font2=new Font("New Times Roman", 20, 30);//font used for the scoreboard

	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args)  throws InterruptedException{

		//Variables used
		String playerAnswer;//stores the user answer to play the game
		String playerName1;//stores the name of player 1
		String playerName2;//stores the name of player 2
		int index=0;//stores the value of the index that the user chose to take the beads out of

		//Introduction to the game and asks the user if they want to play
		c.println("Mancala");
		c.println("If you don't know what this is, it's a board game. "
				+ "The board has a total of 14 holes and 48 beads.");
		c.print("Two big mancalaHoles at the ends (called the mancala) and "
				+ "12 small holes lined in two rows in the middle. "
				+ " \nThe holes are labeled with white numbers. "
				+ "The amount of beads in the hole will be represented by the black number."
				+ "\nThese beads are used to score and keep the game going. "
				+ "The goal of the game is to get more beads in your mancala");
		c.println("\n**********************************************************************************");
		c.println("RULES:");
		c.println("1. Player 1's mancala is on the right and the row of holes on the bottom is player 1's side");
		c.println("2. Player 2's mancala is on the left and the row of holes on the top is player 2's side");
		c.println("3. The player chooses a hole and deposits one stone in the following holes, in a counter-clockwise motion, until the stones run out.");
		c.println("4. You're not allowed to take beads from your opponent's side");
		c.println("5. Your own Mancala counts as a hole but your opponent's Mancala does not count");
		c.println("6. The game ends when all six holes on a player's side of the Mancala board are empty");
		c.println("7. The player who still has beads on their side of the board when the game ends, captures all of them");
		c.println("8. Count all the beads in each mancala. The winner is the player with the most beads");
		c.println();
		c.println("SPECIAL RULES:");
		c.println("1. If you end your turn by putting a bead in your own mancala then you get a free turn");
		c.println("2. If the last bead you drop is in an empty hole on your side, you capture that bead and any beads in the hole directly opposite");
		c.println("**********************************************************************************");
		c.println("Do you want to play?");
		playerAnswer=c.readLine();
		Thread.sleep (1000/30);
		c.clear();

		//Play the game when the player inputs yes
		while(playerAnswer.equalsIgnoreCase("yes")) {
			//Asks both player's name
			c.println("What's your name player 1?");
			playerName1=c.readLine();
			c.println("What's your name player 2?");
			playerName2=c.readLine();
			
			//Resets the board
			mancalaHoles[0]=4;
			mancalaHoles[1]=4;
			mancalaHoles[2]=4;
			mancalaHoles[3]=4;
			mancalaHoles[4]=4;
			mancalaHoles[5]=4;
			mancalaHoles[6]=0;
			mancalaHoles[7]=4;
			mancalaHoles[8]=4;
			mancalaHoles[9]=4;
			mancalaHoles[10]=4;
			mancalaHoles[11]=4;
			mancalaHoles[12]=4;
			mancalaHoles[13]=0;
			c.clear();

			//Beginning game code 
			while (gameOver()==false) {

				//prints board to the screen
				drawScreen(playerName1, playerName2);

				//player 1's turn
				if (playerTurn==true) {
					//gets user input 
					c.setFont(font1);
					c.drawString("Which hole will you take the beads out of?(your side is the bottom row)", 75, 125);
					c.getCursor();
					c.setCursor(9,11);
					index=c.readInt();
					Thread.sleep (1000/30);
					c.clear();

					//checks if the user is cheating and calls noCheating method
					while ((mancalaHoles[index]==0)||index==6||index==7||index==8||index==9||index==10||index==11||
							index==12||index==13) {
						index=noCheating(index, playerName1, playerName2);
					}
					//calls the turns, noCheating and dropBeads Method
					turns(dropBeads(index));
				}

				//Player 2's turn
				else {
					//gets user input 
					c.setFont(font1);
					c.drawString("Which hole will you take the beads out of?(your side is the top row)", 75, 125);
					c.getCursor();
					c.setCursor(9,11);
					index=c.readInt();
					Thread.sleep (1000/30);
					c.clear();

					//checks if the user is cheating and calls noCheating method
					while ((mancalaHoles[index]==0)||(index==0||index==1||index==2||index==3||index==4||index==5||
							index==6||index==13)) {
						index=noCheating(index, playerName1, playerName2);
					}
					//calls the turns, noCheating and dropBeads Method
					turns(dropBeads(index));
				}
				c.clear();
			}
			//all the remaining beads are added to the player's mancala
			mancalaHoles[6]+=mancalaHoles[0]+mancalaHoles[1]+mancalaHoles[2]+mancalaHoles[3]+mancalaHoles[4]+mancalaHoles[5];
			mancalaHoles[13]+=mancalaHoles[7]+mancalaHoles[8]+mancalaHoles[9]+mancalaHoles[10]+mancalaHoles[11]+mancalaHoles[12];
			
			//the winner is decided and displays a message
			if (mancalaHoles[6]>mancalaHoles[13]) {
				c.setFont(font2);
				c.drawString(playerName1+" Wins!!", 75, 95);
			}
			else {
				c.setFont(font2);
				c.drawString(playerName2+" Wins!!", 75, 95);
			}

			//draws the final board and asks the user to play again
			drawScreen (playerName1, playerName2);
			c.setFont(font1);
			c.drawString("Do you want to play again?", 75, 125);
			c.getCursor();
			c.setCursor(9,11);
			playerAnswer=c.readLine();
			Thread.sleep(3000);
			c.clear();
		}

		//output message when the user doesn't want to play again
		c.println("Come back when you wanna play again!");
		Thread.sleep(3000);
		c.close();
	}

	/**
	 * Method "noCheating" catches the player cheating. The program will ask the user to enter another index
	 * @param index - the index they chose before the method is called
	 * @param player1 - stores the name of player 1
	 * @param player2 - stores the name of player 2
	 * @return the new index 
	 */
	public static int noCheating(int index, String player1, String player2) {

		//print the board and ask the use to enter again
		drawScreen(player1, player2);
		c.setFont(font1);
		c.drawString("Why are you trying to cheat? Enter another hole! The game will not proceed until you do. ", 75, 125);
		c.getCursor();
		c.setCursor(9,11);
		index=c.readInt();
		return index;
	}

	/**
	 * Method "dropBeads" will deposit one stone in the next hole in a 
	 * counter-clockwise motion(after the hole the user chose). This method 
	 * will also keep track of where the last bead is deposited. 
	 * This method will also call playerTurnAgain and capture.
	 * @param index - the hole that the user chose to take all the beads out of
	 * @return the hole that the last bead falls in
	 */
	public static int dropBeads(int index) {
		//variables
		int maxBeads=mancalaHoles[index];
		int lastIndex=0;
		int counter=1;
		mancalaHoles[index]=0;

		//depositing the beads
		for (int currentIndex=index+1;counter<=maxBeads;currentIndex++) {
			//When it reaches the 13th hole, it will deposit a bead and continue to deposit in the 0 hole
			if (currentIndex==14) {
				currentIndex=0;
			}
			//Skip the opponent's mancala 
			if (playerTurn==false&&currentIndex==6) {
				currentIndex=7;
			}
			if (playerTurn==true&&currentIndex==13) {
				currentIndex=0;
			}

			mancalaHoles[currentIndex]+=1;
			lastIndex=currentIndex;
			counter++;
		}

		//Calls the capture Method
		if (mancalaHoles[lastIndex]==1 && lastIndex!=13 && lastIndex!=6 && mancalaHoles[14-(lastIndex+2)]!=0) {
			capture(lastIndex, mancalaHoles.length-(lastIndex+2));
		}

		return lastIndex;
	}

	/**
	 * Method "capture" follows the "capturing" process of the game. If the last
	 * bead of a player's turn moves to an empty hole on their side, the player 
	 * is able to capture the beads directly parallel to that hole. Does not count if there's 
	 * nothing in the parallel hole
	 * @param index1 - the hole that the user chose to take all the beads out of
	 * @param index2 - the hole parallel to index1
	 */
	public static void capture(int index1, int index2) {
		//player 1's turn
		if (playerTurn==true){
			if (index1==0||index1==1||index1==2||index1==3||index1==4||index1==5) {
				mancalaHoles[6]+=mancalaHoles[index2]+1;
				mancalaHoles[index1]=0;
				mancalaHoles[index2]=0; 
			}
		}
		//player 2's turn
		else {
			if (index1==7||index1==8||index1==9||index1==10||index1==11||index1==12) {
				mancalaHoles[13]+=mancalaHoles[index2]+1;
				mancalaHoles[index1]=0;
				mancalaHoles[index2]=0;
			}
		}

	}

	/**
	 * Method "gameOver" checks whether a player's side has no beads. 
	 * This indicates a game over according to the rules.
	 * @return true when the game is over 
	 */
	public static boolean gameOver() {

		//checks if all the mancalaHoles on one side is empty
		if (mancalaHoles[0]==0&&mancalaHoles[1]==0&&mancalaHoles[2]==0&&mancalaHoles[3]==0&&mancalaHoles[4]==0&&mancalaHoles[5]==0) {
			return true;
		}
		if (mancalaHoles[7]==0&&mancalaHoles[8]==0&&mancalaHoles[9]==0&&mancalaHoles[10]==0&&mancalaHoles[11]==0&&mancalaHoles[12]==0){
			return true;
		}

		return false;
	}

	/**
	 * Method "turns" switches the turns and
	 * checks whether the last bead moved into the mancala. 
	 * This allows the player to have an extra turn.
	 * @param lastIndex - the hole that the last bead landed in
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

	/**
	 * Method "drawScreen" will draw the Mancala board, print the score board
	 * and print the player turn indication board after each turn.
	 * It will also print the beads in each hole.
	 * @param player1 - stores the name of player 1
	 * @param player2 - stores the name of player 2
	 */
	public static void drawScreen(String player1, String player2) {
		//variables
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image []pics=new Image [13];

		//assigning pics array
		pics[0]=toolkit.getImage("src/tran/culminating/Mancala-1.png");
		pics[1]=toolkit.getImage("src/tran/culminating/Mancala-2.png");
		pics[2]=toolkit.getImage("src/tran/culminating/Mancala-3.png");
		pics[3]=toolkit.getImage("src/tran/culminating/Mancala-4.png");
		pics[4]=toolkit.getImage("src/tran/culminating/Mancala-5.png");
		pics[5]=toolkit.getImage("src/tran/culminating/Mancala-6.png");
		pics[6]=toolkit.getImage("src/tran/culminating/Mancala-7.png");
		pics[7]=toolkit.getImage("src/tran/culminating/Mancala-8.png");
		pics[8]=toolkit.getImage("src/tran/culminating/Mancala-9.png");
		pics[9]=toolkit.getImage("src/tran/culminating/Mancala-10.png");
		pics[10]=toolkit.getImage("src/tran/culminating/Mancala-11.png");
		pics[11]=toolkit.getImage("src/tran/culminating/Mancala-12.png");
		pics[12]=toolkit.getImage("src/tran/culminating/MancalaBoard.png");

		//printing the player indication and scores
		if (playerTurn==true&&gameOver()==false) {
			c.setFont(font2);
			c.drawString(player1+"'s Turn!!", 75, 95);
		}
		else if (playerTurn==false&&gameOver()==false){
			c.setFont(font2);
			c.drawString(player2+"'s Turn!!", 75, 95);
		}
		else {
			//when it's game over, every hole in the middle will have no beads
			mancalaHoles[0]=0;
			mancalaHoles[1]=0;
			mancalaHoles[2]=0;
			mancalaHoles[3]=0;
			mancalaHoles[4]=0;
			mancalaHoles[5]=0;
			mancalaHoles[7]=0;
			mancalaHoles[8]=0;
			mancalaHoles[9]=0;
			mancalaHoles[10]=0;
			mancalaHoles[11]=0;
			mancalaHoles[12]=0;
		}
		c.setFont(font2);
		c.drawString(player1+": "+mancalaHoles[6], 1000, 100);
		c.drawString(player2+": "+mancalaHoles[13], 1000, 125);
		c.setFont(font1);

		//Printing the board and the beads within each hole
		c.drawImage(pics[12], 25, 135, 1200, 500, null);
		if (mancalaHoles[0]>12) {
			c.drawImage(pics[11], 210, 425, 145, 145, null);
		}
		else if (mancalaHoles[0]!=0) {
			c.drawImage(pics[mancalaHoles[0]-1], 210, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[0]+" beads", 255, 563);

		if (mancalaHoles[1]>12) {
			c.drawImage(pics[11], 360, 424, 145, 145, null);
		}
		else if (mancalaHoles[1]!=0) {
			c.drawImage(pics[mancalaHoles[1]-1], 360, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[1]+" beads", 395, 563);

		if (mancalaHoles[2]>12) {
			c.drawImage(pics[11], 500, 425, 145, 145, null);
		}
		else if (mancalaHoles[2]!=0) {
			c.drawImage(pics[mancalaHoles[2]-1], 500, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[2]+" beads", 540, 563);

		if (mancalaHoles[3]>12) {
			c.drawImage(pics[11], 645, 425, 145, 145, null);
		}
		else if (mancalaHoles[3]!=0) {
			c.drawImage(pics[mancalaHoles[3]-1], 645, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[3]+" beads", 685, 563);

		if (mancalaHoles[4]>12) {
			c.drawImage(pics[11], 785, 425, 145, 145, null);
		}
		else if (mancalaHoles[4]!=0) {
			c.drawImage(pics[mancalaHoles[4]-1], 785, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[4]+" beads", 830, 563);

		if (mancalaHoles[5]>12) {
			c.drawImage(pics[11], 930, 425, 145, 145, null);
		}
		else if (mancalaHoles[5]!=0) {
			c.drawImage(pics[mancalaHoles[5]-1], 930, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[5]+" beads", 975, 563);

		if (mancalaHoles[6]>12) {
			c.drawImage(pics[11], 1075, 325, 145, 145, null);
		}
		else if (mancalaHoles[6]!=0) {
			c.drawImage(pics[mancalaHoles[6]-1], 1075, 325, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[6]+" beads", 1114, 300);

		if (mancalaHoles[7]>12) {
			c.drawImage(pics[11], 930, 160, 145, 145, null);
		}
		else if (mancalaHoles[7]!=0) {
			c.drawImage(pics[mancalaHoles[7]-1], 930, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[7]+" beads", 975, 200);

		if (mancalaHoles[8]>12) {
			c.drawImage(pics[11], 785, 160, 145, 145, null);
		}
		else if (mancalaHoles[8]!=0) {
			c.drawImage(pics[mancalaHoles[8]-1], 785, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[8]+" beads", 830, 200);

		if (mancalaHoles[9]>12) {
			c.drawImage(pics[11], 645, 160, 145, 145, null);
		}
		else if (mancalaHoles[9]!=0) {
			c.drawImage(pics[mancalaHoles[9]-1], 645, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[9]+" beads", 690, 200);

		if (mancalaHoles[10]>12) {
			c.drawImage(pics[11], 500, 160, 145, 145, null);
		}
		else if (mancalaHoles[10]!=0) {
			c.drawImage(pics[mancalaHoles[10]-1], 500, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[10]+" beads", 545, 200);

		if (mancalaHoles[11]>12) {
			c.drawImage(pics[11], 360, 160, 145, 145, null);
		}
		else if (mancalaHoles[11]!=0) {
			c.drawImage(pics[mancalaHoles[11]-1], 360, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[11]+" beads", 405, 200);

		if (mancalaHoles[12]>12) {
			c.drawImage(pics[11], 210, 160, 145, 145, null);
		}
		else if (mancalaHoles[12]!=0) {
			c.drawImage(pics[mancalaHoles[12]-1], 210, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[12]+" beads", 255, 200);

		if (mancalaHoles[13]>12) {
			c.drawImage(pics[11], 70, 280, 145, 145, null);
		}
		else if (mancalaHoles[13]!=0){
			c.drawImage(pics[mancalaHoles[13]-1], 70, 280, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(mancalaHoles[13]+" beads", 115, 470);

	}
}
