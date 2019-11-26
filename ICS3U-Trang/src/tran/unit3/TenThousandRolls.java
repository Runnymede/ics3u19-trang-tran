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
		int [] totalRolls=new int[11];
		int total;
		int counter=2;
		
		for (int i=1;i<=10000;i++)
		{
			dice1=(int)(Math.random()*6)+1;
			dice2=(int)(Math.random()*6)+1;

			total=dice1+dice2;

			if (total==2)
			{
				totalRolls[0]+=1;
			}
			else if(total==3)
			{
				totalRolls[1]+=1;
			}
			else if(total==4)
			{
				totalRolls[2]+=1;
			}
			else if(total==5)
			{
				totalRolls[3]+=1;
			}
			else if(total==6)
			{
				totalRolls[4]+=1;
			}
			else if(total==7)
			{
				totalRolls[5]+=1;
			}
			else if(total==8)
			{
				totalRolls[6]+=1;
			}
			else if(total==9)
			{
				totalRolls[7]+=1;
			}
			else if(total==10)
			{
				totalRolls[8]+=1;
			}
			else if(total==11)
			{
				totalRolls[9]+=1;
			}
			else
			{
				totalRolls[10]+=1;
			}
			
		}
		
		System.out.printf("%6s %20s", "Total", "Number of Rolls");
		System.out.println();
		
		for(int j=0;j<11;j++) 
		{
			System.out.printf("%6s %20s", counter, totalRolls[j]);
			System.out.println();
			counter++;
		}



	}
}
