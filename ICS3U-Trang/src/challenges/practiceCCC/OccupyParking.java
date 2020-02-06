import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int spaces=sc.nextInt();
		String yes=sc.next();
		String tod=sc.next();
		int counter=0;

		for (int i=0; i<spaces; i++) {
			if (check(yes, tod, spaces, i)==true) {
				counter++;
			}
		}
		System.out.println(counter);
	}

	public static boolean check(String yes, String tod, int limit, int i) {
		if (yes.charAt(i)=='C' && tod.charAt(i)=='C') {
			return true;
		}
		return false;
	}


}
