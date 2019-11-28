package tran.unit3;
import java.util.Scanner;
/**
 * This program allows two people to play tic tac toe.<br>
 * Each player have to enter the row and column they want to put their letter in.<br>
 * The game is won when there is three of the same letters in a row.<br><p>
 * Date: November 27, 2019
 * @author Trang Tran
 */
public class TicTacToe {
	/**
	 * Start of the program
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);

		//variables
		char[][] board={{'_','_','_'},{'_','_','_'},{'_','_','_'}};
		String startAnswer;
		int playRow;
		int playCol;
		int turns;
		
		//Asks the user to play the game
		System.out.println("Do you want to play Tic Tac Toe? Yes or no?");
		startAnswer=sc.next();

		//start of the game code
		while (startAnswer.equalsIgnoreCase("yes"))
		{
			//Tells the player what they are and prints board
			System.out.println("***********************************************");
			System.out.println("Player 1 is X");
			System.out.println("Player 2 is O");
			System.out.print("***********************************************\n");
			System.out.println("Loading...");
			Thread.sleep(3000);
			
			//printing the board for the user
			System.out.println("  1  2  3");
			for (int row=0; row<3;row++)
			{
				System.out.print(row+1);
				for(int col=0;col<3;col++) 
				{
					System.out.print("|");
					System.out.print(board[row][col]);
					System.out.print("|");
				}
				System.out.print("\n\n");
			}
		
			//Counts the number of turns and stops when the board is full
			for(turns=1;turns<=9;turns++) 
			{
				//Decides which player goes right now
				if (turns==1||turns==3||turns==5||turns==7||turns==9)
				{
					System.out.println("PLAYER 1");
					System.out.println("Where do you want to go?");
					System.out.println("Enter row (first) and column:");
					playRow=sc.nextInt();
					playCol=sc.nextInt();
					
					//Decides if a player is trying to overwrite the other player
					if (board[playRow-1][playCol-1]=='O')
					{
						System.out.println("ARE YOU TRYING TO OVERWRITE ANOTHER PLAYER???!!!");
						System.out.println("Enter another row and column please:");
						playRow=sc.nextInt();
						playCol=sc.nextInt();
					}
					board[playRow-1][playCol-1]='X';
				}	
				else
				{
					System.out.println("PLAYER 2");
					System.out.println("Where do you want to go?");
					System.out.println("Enter row (first) and column (with a space between numbers or press enter):");
					playRow=sc.nextInt();
					playCol=sc.nextInt();
					
					//Decides if a player is trying to overwrite the other player
					if (board[playRow-1][playCol-1]=='X')
					{
						System.out.println("ARE YOU TRYING TO OVERWRITE ANOTHER PLAYER???!!!");
						System.out.println("Enter another row and column please:");
						playRow=sc.nextInt();
						playCol=sc.nextInt();
					}

					board[playRow-1][playCol-1]='O';
				}
					
				//Prints the tic tac tie board each time a player goes
				System.out.println("  1  2  3");
				for (int row=0; row<3;row++)
				{
					System.out.print(row+1);
					for(int col=0;col<3;col++) 
					{
						System.out.print("|");
						System.out.print(board[row][col]);
						System.out.print("|");
					}
					System.out.print("\n\n");
				}
				
				//checks if the player wins
				if ((board[0][0]=='O' || board[0][0]=='X')&&(board[0][1]=='O'||board[0][1]=='X')&& (board[0][2]=='O'||board[0][2]=='X'))
				{
					if(board[0][0]=='O')
					{
						System.out.println("Player 2 wins!!");
						break;
					}
					else
					{
						System.out.println("Player 1 wins!!");
						break;
					}
				}
				else if ((board[1][0]=='O'||board[1][0]=='X')&&(board[1][1]=='O'||board[1][1]=='X')&&(board[1][2]=='O'&&board[1][2]=='X'))
				{
					if(board[1][0]=='O')
					{
						System.out.println("Player 2 wins!!");
						break;
					}
					else
					{
						System.out.println("Player 1 wins!!");
						break;
					}
				}
				else if((board[2][0]=='O'||board[2][0]=='X')&&(board[2][1]=='O'||board[2][1]=='X')&&(board[2][1]=='O'||board[2][1]=='X'))
				{
					if(board[2][0]=='O')
					{
						System.out.println("Player 2 wins!!");
						break;
					}
					else
					{
						System.out.println("Player 1 wins!!");
						break;
					}
				}
				else if((board[0][0]=='O'||board[0][0]=='X')&&(board[1][1]=='O'||board[1][1]=='X')&&(board[2][2]=='O'||board[2][2]=='X'))
				{
					if(board[0][0]=='O')
					{
						System.out.println("Player 2 wins!!");
						break;
					}
					else
					{
						System.out.println("Player 1 wins!!");
						break;
					}
				}
				else if((board[0][2]=='O'||board[0][2]=='X')&&(board[1][1]=='O'||board[1][1]=='X')&&(board[2][0]=='O'||board[2][0]=='X'))
				{
					if(board[0][2]=='O')
					{
						System.out.println("Player 2 wins!!");
						break;
					}
					else
					{
						System.out.println("Player 1 wins!!");
						break;
					}
				}
				else if((board[0][0]=='O'||board[0][0]=='X')&&(board[1][0]=='O'||board[1][0]=='X')&&(board[2][0]=='O'||board[2][0]=='X'))
				{
					if(board[0][0]=='O')
					{
						System.out.println("Player 2 wins!!");
						break;
					}
					else
					{
						System.out.println("Player 1 wins!!");
						break;
					}
				}
				else if((board[0][1]=='O'||board[0][1]=='X')&&(board[1][1]=='O'||board[1][1]=='X')&&(board[2][1]=='O'||board[2][1]=='X'))
				{
					if(board[0][1]=='O')
					{
						System.out.println("Player 2 wins!!");
						break;
					}
					else
					{
						System.out.println("Player 1 wins!!");
						break;
					}
				}
				else if((board[0][2]=='O'||board[0][2]=='X')&&(board[1][2]=='O'||board[1][2]=='X')&&(board[2][2]=='O'||board[2][2]=='X'))
				{
					if(board[0][2]=='O')
					{
						System.out.println("Player 2 wins!!");
						break;
					}
					else
					{
						System.out.println("Player 1 wins!!");
						break;
					}
				}
				else
				{
					//continue
				}
				
				
			}//end For loop
			
			//decides whether it's a tie
			if (turns==9)
			{
				System.out.println("It's a tie!!!");
			}
			
			//Asks the user is they want to play the game
			System.out.println("Do you want to play again?");
			startAnswer=sc.next();
			
		}//end while loop
		
		System.out.println("Thanks for Playing!!");


	}

}

