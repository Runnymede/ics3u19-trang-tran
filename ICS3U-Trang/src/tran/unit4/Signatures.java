package tran.unit4;
/**
 * Practice using two methods to print two different images to the console.<br>
 * Date: December 16, 2019
 * @author Trang Tran
 */
public class Signatures {
	/**
	 * Start of the program
	 * @param args
	 */
	
	public static void main(String[] args) {
		printSignature();
		printImage();
	}
	
	//Method prints an ASCII text art to the console
	public static void printSignature() {
		System.out.println(".------..------..------..------..------.");
		System.out.println("|T.--. ||R.--. ||A.--. ||N.--. ||G.--. |");
		System.out.println("| :/\\: || :(): || (\\/) || :(): || :/\\: |");
		System.out.println("| (__) || ()() || :\\/: || ()() || :\\/: |");
		System.out.println("| '--'T|| '--'R|| '--'A|| '--'N|| '--'G|");
		System.out.println("`------'`------'`------'`------'`------'");
	}

	//Method prints an ASCII image to the console
	public static void printImage() {
		System.out.println("\n >(.)__ <(.)__ =(.)__\r\n" + 
				"  (___/  (___/  (___/");
	}

}
