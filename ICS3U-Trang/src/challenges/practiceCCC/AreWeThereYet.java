package challenges.practiceCCC;
import java.util.Scanner;

public class AreWeThereYet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] output=new int [25];
		
		String []cities=sc.nextLine().split(" ");
		int [] cityNum=new int [4];
		
		for (int i=0;i<cityNum.length;i++) {
			cityNum[i]=Integer.parseInt(cities[i]);
		}
		
		int counter=1;
		while (counter<=5) {
			distances(counter, cityNum);
			
		}
	}
	
	public static void distances(int line, int [] input) {
		
	}
	
}
