package practiceCCC;
import java.util.Scanner;

public class OccupyParking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int spaces=sc.nextInt();
		char [] yes=sc.next().toCharArray();
		char [] tod=sc.next().toCharArray();
		int counter=0;
		
		for (int i=0; i<spaces; i++) {
			if (check(yes, tod)=='C') {
				counter++;
			}
		}
		
		System.out.println(counter);
		
	}
	
	public static char check(char [] yes, char []tod) {
		int counter=0;
		
		for (int i=0; i<yes.length; i++) {
			if (yes[i]=='C'&&tod[i]=='C') {
				return 'C';
			}
		}
		
		return '.';
	}
	

}
