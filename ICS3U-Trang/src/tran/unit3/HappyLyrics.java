package tran.unit3;
/**
 * Displays the lyrics of the "If you're happy and you know it" song.<br>
 * The song contains 10 different actions for the song.<br><p>
 * Date: November 25, 2019
 * @author Trang Tran
 */
public class HappyLyrics {
	/**
	 * Start of the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		//variables
		String start="If you're happy and you know it";
		String[] action= {" clap your hands."," stomp your feet."," shout hooray.",
				" jump up and down."," laugh out loud.", " pat your head."," sing a song.", 
				" yell out loud.", " stay quiet.", " say hello!"};
		
		//using the indexes in the array to continue the song
		for(int i=0;i<10;i++)
		{
			System.out.println(start+action[i]);
			System.out.println(start+action[i]);
			System.out.println(start+" and you really want to show it.");
			System.out.println(start+action[i]+"\n");
			
		}
		
	}
}
