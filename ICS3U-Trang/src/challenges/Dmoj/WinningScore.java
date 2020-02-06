package challenges.Dmoj;

import java.util.Scanner;

public class WinningScore {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int [] score=new int [6];
		int s=3;
		int totalBanana=0;
		int totalApple=0;
		
		for (int i=0;i<score.length;i++) {
			score[i]=sc.nextInt();
		}
		
		for (int a=0;a<3;a++) {
			totalApple+=score[a]*s;
			s-=1;
		}
		
		s=3;
		for (int b=3;b<score.length;b++) {
			totalBanana+=score[b]*s;
			s-=1;
		}
		
		if (totalApple<totalBanana) {
			System.out.println("B");
		}
		else if (totalApple>totalBanana) {
			System.out.println("A");
		}
		else {
			System.out.println("T");
		}
			
		
	}

}
