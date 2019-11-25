package tran.unit3;
/**
 * This program rolls two dies and adds the total 10,000 times.<br>
 * 
 * Date: November 25, 2019
 * @author Trang Tran
 */
public class TenThousandRolls {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		//variables
		int dice1;
		int dice2;
		int [] totalRolls=new int[10000];
		int total;
		
		for (int i=1;i<=10000;i++)
		{
			dice1=(int)(Math.random()*6)+1;
			dice2=(int)(Math.random()*6)+1;
			
			total=dice1+dice2;
			
			for (int j=0;j<10000;i++)
			{
				totalRolls[j]=total;
			}
			
		}
		
		
		
		
	}
}
