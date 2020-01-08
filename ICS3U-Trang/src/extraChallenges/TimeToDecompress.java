package extraChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TimeToDecompress {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int lines = sc.nextInt();
		String [] inputs = new String [lines];
		
		for (int i=0; i<lines; i++) {
            inputs[i]=sc.nextLine();
        }
		
		for (int i=0; i<lines; i++) {
			String[] now=inputs[i].split(" ");
			List<String> part = new ArrayList<>();
			part.addAll(Arrays.asList(now));
			
			for (int a=1;a<=Integer.valueOf(part.get(0));a++) {
				System.out.print(part.get(1));
			}
			System.out.println();
		}
		
		

	}

}
