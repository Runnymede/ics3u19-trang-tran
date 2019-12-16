package tran;

import java.util.Scanner;

/**
 * Name: Trang Tran
 * Date: January 16, 2019
 * Program: Survival Game
 */
public class ChoicesGame {
	/**
	 * Start of the program
	 */
    public static void main(String[] args) throws InterruptedException {
    	//scanner import
    	Scanner sc=new Scanner(System.in);
    	
    	//Variable Declaration 
    	String playgame;
    	String mainAnswer1;
    	String riverAnswer1, riverAnswer2, riverAnswer3;
    	String forestAnswer1;
    	String hillAnswer1;
    	int weirdDance, strangeMan;
    				

    	//Beginning code that welcomes user to game
    	System.out.println("Welcome to the survival game.");
    	System.out.println("Do you want to play?(Y/N)");
    	playgame=sc.next();
    	
    	Thread.sleep(2000);
    	System.out.flush();
    	
    	while (playgame.equalsIgnoreCase("Y")  || playgame.equalsIgnoreCase("yes"))
    	{
    		System.out.println("Loading...");
    		
    		Thread.sleep(2000);
    		System.out.flush();
    		
    		System.out.println("Your plane crashed and you're stranded on an island. ");
    		System.out.println("You're the only one to survive the crash. ");
    		System.out.println("You gather some materials from the surrounding passengers and store them in your bag.");
    		System.out.println("You proceed to exit the plane and look at your surroundings. ");
    		System.out.println();
    		System.out.println("You see a river, a forest, and a hill. Which do you proceed?"); 
    		System.out.println();
    		
    		
    		//options for start scenario
    		System.out.println("River-R");
    		System.out.println("Forest-F");
    		System.out.println("Hill-H");
    		mainAnswer1 = sc.next();
    			
    		Thread.sleep(2000);
    		System.out.flush();
    		
    			if (mainAnswer1.equalsIgnoreCase("r")) 
    			{
    				System.out.println("You're near the river and you see something moving. ");
    				System.out.println("You also see a light shining in the trees. ");
    				System.out.println("Do you go closer to the river, do you follow the light, or do you keep walking?");
    				System.out.println();
    				
    				//options for river scenario
    				System.out.println("Follow the light-L");
    				System.out.println("Closer to the river-C");
    				System.out.println("Keep walking-K");
    				riverAnswer1=sc.next();
    			
    				Thread.sleep(2000);
    				System.out.flush();
    					
    					//river scenario option 1
    					if (riverAnswer1.equalsIgnoreCase("L"))
    					{
    						System.out.println("While following the light, you spot a bridge. ");
    						System.out.println();
    						System.out.println("Do you cross the bridge or do you keep following the light?");
    						System.out.println();
    						
    						System.out.println("Follow the light-L");
    						System.out.println("Cross the bridge-B");
    						riverAnswer2=sc.next();
    						
    						Thread.sleep(2000);
    						System.out.flush();
    							if (riverAnswer2.equalsIgnoreCase("L"))
    							{
    								System.out.println("You chose follow the light");
    								System.out.println("You were able to find a fire!");
    								System.out.println("That means there must be other people on the island");
    								System.out.println("You were able to find these people, and hitch a ride!");
    								System.out.println("You win!");
    							}
    							else if (riverAnswer2.equalsIgnoreCase("B"))
    							{
    								System.out.println("You tried to cross the bridge but it collapsed!");
    								System.out.println("You have died");
    							}
    				
    					}//end of river scenario 1
    					
    					//river option 2
    					else if (riverAnswer1.equalsIgnoreCase("C"))
    					{
    						System.out.println("You see fish in the river but you accidently fell in");
    						System.out.println("Turns out the fish were piranhas. They ate you alive.");
    						System.out.println("You have died");
    						
    					}//end river scenario 2
    					
    					//river option 3
    					else if (riverAnswer1.equalsIgnoreCase("K"))
    					{
    						System.out.println("You keep going and you come to a stop");
    						System.out.println("You see something moving in the trees and you also see a beach");
    						System.out.println();
    						System.out.println("Do you go toward the moving thing or do you go to the beach?");
    						System.out.println();
    						
    						System.out.println("Toward moving thing-T");
    						System.out.println("To the beach-B");
    						riverAnswer3=sc.next();
    							if (riverAnswer3.equalsIgnoreCase("T"))
    							{
    								System.out.println("That was a jaguar!");
    								System.out.println("You were mauled to death by the jaguar");
    							}
    							else if (riverAnswer3.equalsIgnoreCase("B"))
    							{
    								System.out.println("You see a ship!");
    								System.out.println("You have nothing to alert the ship.");
    								System.out.println("so you start doing a weird dance in hopes of getting attention");
    								
    								weirdDance=(int)(Math.random()*10)+1;
    								
    								//50% chances to live and die. 1-10
    									if (weirdDance<=5 && weirdDance>=1)
    									{
    										System.out.println("You got the sailors attention!");
    										System.out.println("They came and picked you up");
    										System.out.println("Congratulations! You win");
    									}
    									else 
    									{
    										System.out.println("The sailors ignored you.");
    										System.out.println("You stood there watching them float away");
    										System.out.println("You were eventually spotted by a tribe and they killed you");
    									}
    								
    							}
    				
    					}//end river scenario 3
    				
    			}//end of river section
    					
    			else if (mainAnswer1.equalsIgnoreCase("f")) 
    			{
    				System.out.println("You run to the forest in a hurry. ");
    				System.out.println("You start looking around and you notice a cave");
    				System.out.println();
    				System.out.println("Do you keep running or do you go into the cave?");
    				System.out.println();
    				
    				//options for cave scenario
    				System.out.println("Into the cave-C");
    				System.out.println("Keep running-R");
    				forestAnswer1=sc.next();
    				
    				Thread.sleep(2000);
    				System.out.flush();
    	
    					if (forestAnswer1.equalsIgnoreCase("C"))
    					{
    						System.out.println("You start to proceed to enter the cave");
    						System.out.println("There was a bear!");
    						System.out.println("You have died by the bear");
    					}
    					else if (forestAnswer1.equalsIgnoreCase("R"))
    					{
    						System.out.println("You triped and fell on a rock");
    						System.out.println("You were knocked unconsious");
    						System.out.println("You were eventually eaten alive");
    					}
    					

    			}//end of forest section
    					
    			else if (mainAnswer1.equalsIgnoreCase("h"))
    			{
    				System.out.println("You start walking up a hill." );
    				System.out.println("You see a house that looks abandoned. ");
    				System.out.println();
    				System.out.println("Do you go to the house or do you keep climbing?");
    				System.out.println();
    				
    				//options for hill scenario
    				System.out.println("Toward house-H");
    				System.out.println("Keep climbing-C");
    				hillAnswer1=sc.next();
    				
    				Thread.sleep(2000);
    				System.out.flush();
    				
    					if (hillAnswer1.equalsIgnoreCase("H"))
    					{
    						System.out.println("You entered the house");
    						System.out.println("You find a man inside");
    						System.out.println("You asked him if he can help you build a boat");
    						
    						strangeMan=(int)(Math.random()*5)+1;
    						//1-3 he will help you, 4-5 he won't help you 
    						if (strangeMan<=3 && strangeMan>=1)
    							{
    								System.out.println("He said yes");
    								System.out.println("He will help you build a boat as long as he comes with");
    								System.out.println("You win!");
    							}
    							else
    							{
    								System.out.println("He said no");
    								System.out.println("You tried to convince him to reconsider");
    								System.out.println("It didn't work. He killed you and ate you");
    							}
    						
    					}
    					else if (hillAnswer1.equalsIgnoreCase("C"))
    					{
    						System.out.println("You were so clumsy, that you slipped and fell all the way down to the hill");
    						System.out.println("You were knocked unconsious");
    						System.out.println("You were eventually eaten alive");
    					}
    					
    			}//end hill section
    			
    			
    			//ask the player if they want to play again
    			System.out.println();
    			System.out.println("Do you want to play again? (Y/N)");
    			playgame = sc.next(); 
    			
    			Thread.sleep(2000);
    			System.out.flush();
    			
    	}//end while loop
    				
    		
    	System.out.println("No? ok. Come back later");
    	
    	sc.close();
   
    }
}

