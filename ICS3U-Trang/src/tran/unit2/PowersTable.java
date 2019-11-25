package tran.unit2;
/**
 * This program displays a table of powers.<br>
 * So each row displays the answer to x to the power of 1-6.<br>
 * The base number goes up to 6 and the exponent goes up to 5.<br><p>
 * Date: November 11, 2019
 * @author Trang Tran
 */
public class PowersTable {
	/**
	 * Start of the program
	 */
	public static void main(String[] args) {
		
		//variables
		int base;
		int exponent;
		int product;
		
		//Output
		System.out.println("This is a powers table for number 1 through 6:");
		System.out.format("%6s %5s %5s %5s %5s", "x^1", "x^2", "x^3", "x^4", "x^5");
		System.out.println();
		
		//adds the base number 
		for (base=1;base<=6;base++)
		{
			//adds the exponent number
			for (exponent=1;exponent<=5;exponent++)
			{
				//calculates the power with the same base number and changing exponent
				product=(int)Math.pow(base, exponent);
				
				//formats it into a table
				System.out.format("%6s", product);
			}
			System.out.format("\n");
		}
		
		
	}

}
