package tran.unit2;
/**
 * This program prints our all the even numbers between 1 and 100.<br><p>
 * Date: November 11, 2019
 * @author Trang Tran
 */
public class EvenNumbers {
	/**
	 * Start of the program
	 */
	public static void main(String[] args) {
		
		//variables used
		int modulus;
		
		//checks numbers if they are between 1-100
		for (int i=1;i<=100;i++)
		{
			//finds out if it's divisible by two since all even numbers are divisible by 2
			modulus=i%2;
			
			//checks if it's even
			if (modulus==0)
			{
				System.out.println(i);
			}
			
			
		}

		
	}

}
