package tran.unit4;

import java.util.Scanner;
/**
 * Prompts the user for the number of lines that will make up the triangle.<br>
 * Displays the triangle using stars and spaces.<br><p>
 * Date: December 17, 2019
 * @author 333771657
 */
public class IsoTriangles {

	public static void drawSpaces(int spaces){
		System.out.println(" ");
	}

	public static void drawStars(int stars) {
		System.out.println("*");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size");
		int sizeOfTriangle=sc.nextInt();

		while () {
			drawStars(sizeOfTriangle+(sizeOfTriangle-1));
		}
		
	}

}
