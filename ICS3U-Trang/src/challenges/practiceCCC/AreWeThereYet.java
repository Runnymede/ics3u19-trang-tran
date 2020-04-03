package challenges.practiceCCC;
import java.util.Scanner;

public class AreWeThereYet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int counter=1;//stores the output line 
		
		//get input from user
		String []cities=sc.nextLine().split(" ");
		int [] cityNum=new int [4];
		for (int i=0;i<cityNum.length;i++) {
			cityNum[i]=Integer.parseInt(cities[i]);
		}
		
		//calls the distances method
		while (counter<=5) {
			distances(counter, cityNum);
			counter++;
		}
	}

	//prints the lines of output
	public static void distances(int line, int [] input) {
		//initialize the first line of output
		int [] firstOutput= {0,input[0],input[0]+input[1],input[0]+input[1]+input[2], input[0]+input[1]+input[2]+input[3]};
		
		//if it's the first line of output print the array
		if (line==1) {
			for (int i=0;i<firstOutput.length;i++) {
				System.out.print(firstOutput[i]+" ");
			}
		}
		//every other line of output
		else {
			
			int currentNum=firstOutput[line-1];
			System.out.println();
			System.out.print(currentNum+" ");
			
			//finds the next number in the sequence
			for (int i=0; i<4; i++) {
				currentNum-=input[i];
				System.out.print(Math.abs(currentNum)+" ");
			}
		}

	}

}
