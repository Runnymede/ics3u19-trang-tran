package tran.unit2;
/**
 * Counts down from 10 to 1.<br>
 * Prints out "Blast off" at the end of the count down.<br>
 * Delays for 1 second after every number in the count down.<br><p>
 * Date: November 11, 2019
 * @author Trang Tran
 */
public class BlastOff {
	/**
	 * Start of the program
	 */
	public static void main(String[] args) throws InterruptedException {
		
		//prints all the numbers from 10 to 1
		for (int i=10;i>=1;i--)
		{
			System.out.println(i);
			
			//1 second delay after each print
			Thread.sleep(1000);
		}
		
		//output
		System.out.println("BLAST OFF!!!");
		

	}
}