package tran.unit1;
/**
 * AboutMe.java
 * this is a program about the author
 * Date created: September 17, 2019
 *@author Trang Tran
 */
public class AboutMe {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {

		// Author's information
		System.out.print("Trang");
		System.out.println(" T.");
		System.out.println("Ms. Kemp");
		System.out.println("Runnymede C.I.");
		System.out.println("\"GOOO RAVENS!\"\n");
		
		//author's timetable 
		System.out.println("School Year 2019-2020");
		System.out.println();
		
		System.out.format("%-10s %-8s %7s", "Period", "Day 1", "Day 2\n");
		System.out.format("%-10s %-7s %7s", "1", "SPH3U1-01", "SPH3U1-01\n");
		System.out.format("%-10s %-9s %7s", "08:45", "Enns, M", "Enns, M\n");
		System.out.format("%-10s %-6s %7s", "10:07", "226", "226\n");
		System.out.println();
		
		System.out.format("%-10s %-7s %7s", "2", "TGJ3M1-01", "TGJ3M1-01\n");
		System.out.format("%-10s %-9s %7s", "10:07", "Yasui, R", "Yasui, R\n");
		System.out.format("%-10s %-7s %6s", "11:24", "027", "027\n");
		System.out.println();
		
		System.out.format("%-10s", "Lunch \n11:24 \n12:26 \n");
		System.out.println();
		
		System.out.format("%-10s %-7s %7s", "3", "ICS3U3-02", "HSP3U1-02\n");
		System.out.format("%-10s %-9s %7s", "12:26", "Kemp, C", "Alam, N\n");
		System.out.format("%-10s %-7s %6s", "13:43", "024", "216\n");
		System.out.println();
		
		System.out.format("%-10s %-7s %7s", "4", "HSP3U1-02", "ICS3U3-02\n");
		System.out.format("%-10s %-9s %7s", "13:48", "Alam, N", "Kemp, C\n");
		System.out.format("%-10s %-7s %6s", "15:05", "216", "024\n");
		System.out.println();
	}

}
