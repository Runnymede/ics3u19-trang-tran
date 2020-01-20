package tran.culminating;
import java.awt.*;
import hsa_new.Console;
import java.awt.Image;
import java.awt.Font;

/**
 * ICS3U Culminating Game Program
 * This program is meant to run the game Mancala upon user's request.
 * Date: January 13, 2020
 * @author Trang Tran
 */
public class Mancala {

	//Global Variables
	static Console c = new Console (44, 156, "Mancala");
	static boolean playerTurn=true;
	static Font font1=new Font("New Times Roman", 20, 16);
	static Font font2=new Font("New Times Roman", 20, 30);

	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args)  throws InterruptedException{
		
		//Variables used
		int [] mancalaHoles= {4,4,4,4,4,4,0,4,4,4,4,4,4,0};//stores the amount of beads in every hole
		String playerAnswer;//stores the user answer to play the game
		String playerName1;//stores the name of player 1
		String playerName2;//stores the name of player 2
		int index=0;//stores the value of the index that the user chose to take the beads out of

		//Introduction to the game and asks the user if they want to play
		c.println("Mancala");
		c.println("If you don't know what this is, it's a board game. "
				+ "The board has a total of 14 holes and 48 beads.");
		c.print("Two big holes at the ends (called the mancala) and "
				+ "12 small holes lined in two rows in the middle. "
				+ " \nThe holes are labeled with white numbers. "
				+ "The amount of beads in the hole will be represented by the black number."
				+ "\nThese beads are used to score and keep the game going. "
				+ "The goal of the game is to get more beads in your mancala");
		c.println("\n**********************************************************************************");
		c.println("RULES:");
		c.println("1. Player 1's mancala is on the right and the row of holes on the bottom is player 1's side");
		c.println("2. Player 2's mancala is on the left and the row of holes on the top is player 2's side");
		c.println("3. The player deposits one stone in the following holes, in a counter-clockwise motion, until the stones run out.");
		c.println("4. You're not allowed to take beads from your opponent's side");
		c.println("5. Your own Mancala counts as a hole but your opponent's Mancala does not count");
		c.println("6. The game ends when all six holes on a player's side of the Mancala board are empty");
		c.println("7. The player who still has beads on their side of the board when the game ends, captures all of them");
		c.println("8. Count all the beads in each Mancala. The winner is the player with the most beads");
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
			while (gameOver(mancalaHoles)==false) {
				
				//prints board to the screen
				drawScreen(mancalaHoles, playerName1, playerName2);

				//player 1's turn
				if (playerTurn==true) {
					//gets user input 
					c.setFont(font1);
					c.drawString("Which hole will you take the beads out of?(bottom row)", 75, 125);
					c.getCursor();
					c.setCursor(8,11);
					index=c.readInt();
					Thread.sleep (1000/30);
					c.clear();
					
					//calls the turns, noCheating and dropBeads Method
					drawScreen(mancalaHoles, playerName1, playerName2);
					turns(dropBeads(noCheating(index, mancalaHoles), mancalaHoles));
				}
				
				//Player 2's turn
				else {
					//gets user input 
					c.setFont(font1);
					c.drawString("Which hole will you take the beads out of?(top row)", 75, 125);
					c.getCursor();
					c.setCursor(8,11);
					index=c.readInt();
					Thread.sleep (1000/30);
					c.clear();
					
					//calls the turns, noCheating and dropBeads Method
					drawScreen(mancalaHoles, playerName1, playerName2);
					turns(dropBeads(noCheating(index, mancalaHoles), mancalaHoles));
				}
				c.clear();
			}
			//when the game is over, all the beads are added on the players side to decide the winner 
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
			drawScreen (mancalaHoles, playerName1, playerName2);
			c.setFont(font1);
			c.drawString("Do you want to play again?", 75, 125);
			c.getCursor();
			c.setCursor(8,11);
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
	 * Method "noCheating" catches the player cheating. If they try to cheat by typing an index
	 * they can't pick the program will have them pick again.
	 * @param - index the index they chose before the method is called
	 * @param holes - the array that stores the amount of beads in each hole
	 * @return the new index 
	 */
	public static int noCheating(int index, int []holes) {
		if (playerTurn==true) {
			while ((holes[index]==0)||index==6||index==7||index==8||index==9||index==10||index==11||
					index==12||index==13) {
				c.setFont(font1);
				c.drawString("Why are you trying to cheat???? Enter another hole: ", 75, 125);
				c.getCursor();
				c.setCursor(8,11);
				index=c.readInt();
			}
		}
		else {
			while ((holes[index]==0)||(index==0||index==1||index==2||index==3||index==4||index==5||
					index==6||index==13)) {
				c.setFont(font1);
				c.drawString("Why are you trying to cheat???? Enter another hole: ", 75, 125);
				c.getCursor();
				c.setCursor(8,11);
				index=c.readInt();
			}
		}
		return index;
	}
	
	/**
	 * Method "dropBeads" will deposit one stone in the next hole in a 
	 * counter-clockwise motion(after the hole the user chose). This method 
	 * will also keep track of where the last bead is deposited. 
	 * This method will also call playerTurnAgain and capture.
	 * @param index - the hole that the user chose to take all the beads out of
	 * @param holes - the array that stores the amount of beads in each hole
	 * @return the hole that the last bead falls in
	 */
	public static int dropBeads(int index, int []holes) {
		//variables
		int maxBeads=holes[index];
		int lastIndex=0;
		int counter=1;
		holes[index]=0;

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

			holes[currentIndex]+=1;
			lastIndex=currentIndex;
			counter++;
		}

		//Calls the capture Method
		if (holes[lastIndex]==1 && lastIndex!=13 && lastIndex!=6 && holes[14-(lastIndex+2)]!=0) {
			capture(lastIndex, holes.length-(lastIndex+2), holes);
		}

		return lastIndex;
	}

	/**
	 * Method "capture" follows the "capturing" process of the game. If the last
	 * bead of a player's turn moves to an empty hole on their side, the player 
	 * is able to capture the beads directly parallel to that hole.
	 * @param index1 - the hole that the user chose to take all the beads out of
	 * @param index2 - the hole parallel to index1
	 * @param holes - the array that stores the amount of beads in each hole
	 */
	public static void capture(int index1, int index2, int []holes) {
		//player 1's turn
		if (playerTurn==true){
			if (index1==0||index1==1||index1==2||index1==3||index1==4||index1==5) {
				holes[6]+=holes[index2]+1;
				holes[index1]=0;
				holes[index2]=0; 
			}
		}
		//player 2's turn
		else {
			if (index1==7||index1==8||index1==9||index1==10||index1==11||index1==12) {
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

		//checks if all the holes on one side is empty
		//this stops the game
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
	 * @param holes - the array that stores the amount of beads in every hole
	 */
	public static void drawScreen(int [] holes, String player1, String player2) {
		//variables
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image []pics=new Image [13];

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
		if (playerTurn==true&&gameOver(holes)==false) {
			c.setFont(font2);
			c.drawString(player1+"'s Turn!!", 75, 95);
		}
		else if (playerTurn==false&&gameOver(holes)==false){
			c.setFont(font2);
			c.drawString(player2+"'s Turn!!", 75, 95);
		}
		else {
			//when it's game over, every hole in the middle will have no beads
			holes[0]=0;
			holes[1]=0;
			holes[2]=0;
			holes[3]=0;
			holes[4]=0;
			holes[5]=0;
			holes[7]=0;
			holes[8]=0;
			holes[9]=0;
			holes[10]=0;
			holes[11]=0;
			holes[12]=0;
		}
		c.setFont(font2);
		c.drawString(player1+": "+holes[6], 1000, 100);
		c.drawString(player2+": "+holes[13], 1000, 125);
		c.setFont(font1);
		
		//Printing the board and the beads within each hole
		c.drawImage(pics[12], 25, 135, 1200, 500, null);
		if (holes[0]>12) {
			c.drawImage(pics[11], 210, 425, 145, 145, null);
		}
		else if (holes[0]!=0) {
			c.drawImage(pics[holes[0]-1], 210, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[0]+" beads", 255, 563);
		
		if (holes[1]>12) {
			c.drawImage(pics[11], 360, 424, 145, 145, null);
		}
		else if (holes[1]!=0) {
			c.drawImage(pics[holes[1]-1], 360, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[1]+" beads", 395, 563);
		
		if (holes[2]>12) {
			c.drawImage(pics[11], 500, 425, 145, 145, null);
		}
		else if (holes[2]!=0) {
			c.drawImage(pics[holes[2]-1], 500, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[2]+" beads", 540, 563);
		
		if (holes[3]>12) {
			c.drawImage(pics[11], 645, 425, 145, 145, null);
		}
		else if (holes[3]!=0) {
			c.drawImage(pics[holes[3]-1], 645, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[3]+" beads", 685, 563);

		if (holes[4]>12) {
			c.drawImage(pics[11], 785, 425, 145, 145, null);
		}
		else if (holes[4]!=0) {
			c.drawImage(pics[holes[4]-1], 785, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[4]+" beads", 830, 563);
		
		if (holes[5]>12) {
			c.drawImage(pics[11], 930, 425, 145, 145, null);
		}
		else if (holes[5]!=0) {
			c.drawImage(pics[holes[5]-1], 930, 425, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[5]+" beads", 975, 563);
		
		if (holes[6]>12) {
			c.drawImage(pics[11], 1075, 325, 145, 145, null);
		}
		else if (holes[6]!=0) {
			c.drawImage(pics[holes[6]-1], 1075, 325, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[6]+" beads", 1114, 300);
		
		if (holes[7]>12) {
			c.drawImage(pics[11], 930, 160, 145, 145, null);
		}
		else if (holes[7]!=0) {
			c.drawImage(pics[holes[7]-1], 930, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[7]+" beads", 975, 200);
		
		if (holes[8]>12) {
			c.drawImage(pics[11], 785, 160, 145, 145, null);
		}
		else if (holes[8]!=0) {
			c.drawImage(pics[holes[8]-1], 785, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[8]+" beads", 830, 200);
		
		if (holes[9]>12) {
			c.drawImage(pics[11], 645, 160, 145, 145, null);
		}
		else if (holes[9]!=0) {
			c.drawImage(pics[holes[9]-1], 645, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[9]+" beads", 690, 200);
		
		if (holes[10]>12) {
			c.drawImage(pics[11], 500, 160, 145, 145, null);
		}
		else if (holes[10]!=0) {
			c.drawImage(pics[holes[10]-1], 500, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[10]+" beads", 545, 200);
		
		if (holes[11]>12) {
			c.drawImage(pics[11], 360, 160, 145, 145, null);
		}
		else if (holes[11]!=0) {
			c.drawImage(pics[holes[11]-1], 360, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[11]+" beads", 405, 200);
		
		if (holes[12]>12) {
			c.drawImage(pics[11], 210, 160, 145, 145, null);
		}
		else if (holes[12]!=0) {
			c.drawImage(pics[holes[12]-1], 210, 160, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[12]+" beads", 255, 200);
		
		if (holes[13]>12) {
			c.drawImage(pics[11], 70, 280, 145, 145, null);
		}
		else if (holes[13]!=0){
			c.drawImage(pics[holes[13]-1], 70, 280, 145, 145, null);
		}
		c.setColor(Color.black);
		c.drawString(holes[13]+" beads", 115, 470);
		
	}
}
