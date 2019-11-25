package tran.unit2;
/**
 * The program rolls two dies, 6 times.<br>
 * For each roll, it adds both numbers on the dice and displays them in a table.<br><p>
 * Date: November 12, 2019
 * @author 333771657
 */
public class DiceRolls {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		//variables
		int dice1;
		int dice2;
		int sum;
		
		//Output
		System.out.format("%6s %6s %6s", "Dice 1", "Dice 2", "Total");
		System.out.println();
		
		//does the rolling and adding 6 times and formats them into a table
		for(int i=1;i<=5;i++)
		{
			//rolling both dies
			dice1=(int)(Math.random()*6)+1;
			dice2=(int)(Math.random()*6)+1;;
			
			//Adding the numbers on both dies
			sum=dice1+dice2;
			
			//formats output
			System.out.format("%6s %6s %6s", dice1, dice2, sum);
			System.out.println();
		}
		
		
	}

}
