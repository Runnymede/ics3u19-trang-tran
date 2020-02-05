package extraChallenges;

import java.util.Scanner;

public class ColdCompress {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int lines=sc.nextInt();
		String [] characters= new String [lines];
		
		for (int i=0;i<characters.length;i++) {
			characters[i]=sc.next();
		}
		
		for (int i=0;i<characters.length;i++) {
			count(characters[i]);
		}
	}
	
	public static void count(String textLine) {
		int count=0;
		for (int i=0; i<=textLine.length();i++) {
			count=0;
			for (int a=0; a<textLine.length();a++) {
				if (textLine.charAt(i)==textLine.charAt(a)) {
					count++;
				}
			}
			System.out.println(count+textLine.charAt(i));
			if (textLine.charAt(i)==textLine.charAt(i+1)) {
				i++;
			}
		}
	}

}