package challenges.Dmoj;

import java.util.Scanner;

public class ColdCompress {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int max=sc.nextInt();
		String [] texts=new String[max];

		for (int i=0; i<max; i++) {
			texts[i]=sc.next();
		}

		for (int i=0; i<max; i++) {
			count(texts[i]);
		}
	}

	public static void count(String textLine) {

		char current=textLine.charAt(0);
		char next=textLine.charAt(1);
		int counter=0;
		int counter2=0;


		for (int a=0;a<textLine.length();a++) {
			if (current==a) {
				counter++;
			}
			else {
				counter2=a;
			}
		}
		System.out.print(counter+" "+current+" ");
		counter=0;
		current=textLine.charAt(counter2);

		System.out.println();

	}

}