package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helpers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//declare list
		List<String> stringList = new ArrayList<>();

		//gets string input and turns it into integer
		String []cities=sc.nextLine().split(" ");
		int [] cityNum=new int [4];
		for (int i=0;i<cityNum.length;i++) {
			cityNum[i]=Integer.parseInt(cities[i]);
		}
	}

}
