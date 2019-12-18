package extraChallenges;

public class AdventOfCodeDay2 {

	public static void main(String[] args) {
		/**
		 * Advent of code->Day 2, Part 1
		 * the first step is to restore the gravity assist program
		 * (your puzzle input) to the "1202 program alarm" state it
		 * had just before the last computer caught fire. To do this,
		 * before running the program, replace position 1 with the 
		 * value 12 and replace position 2 with the value 2. What 
		 * value is left at position 0 after the program halts?
		 */
		int sum;
		int multiplyer;
		int mover0=0;
		int mover1=1;
		int mover2=2;
		int mover3=3;

		int [] opcode= {1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,6,1,19,
				1,5,19,23,2,6,23,27,1,27,5,31,2,9,31,35,1,5,35,39,
				2,6,39,43,2,6,43,47,1,5,47,51,2,9,51,55,1,5,55,59,
				1,10,59,63,1,63,6,67,1,9,67,71,1,71,6,75,1,75,13,
				79,2,79,13,83,2,9,83,87,1,87,5,91,1,9,91,95,2,10,
				95,99,1,5,99,103,1,103,9,107,1,13,107,111,2,111,
				10,115,1,115,5,119,2,13,119,123,1,9,123,127,1,5,
				127,131,2,131,6,135,1,135,5,139,1,139,6,143,1,143,
				6,147,1,2,147,151,1,151,5,0,99,2,14,0,0};


		//				99,1,5,99,103,1,103,9,107,1,13,107,111,2,111,10,115,1,115,5,
		//				119,2,13,119,123,1,9,123,127,1,5,127,131,2,131,6,135,1,135,5,
		//				139,1,139,6,143,1,143,6,147,1,2,147,151,1,151,5,0,99,2,14,0,0};

		while(mover3<opcode.length)
		{

			if (opcode[mover0]==1)
			{
				sum=opcode[opcode[mover1]]+opcode[opcode[mover2]];
				opcode[opcode[mover3]]=sum;
			}
			else if (opcode[mover0]==99)
			{
				mover0++;
				mover1++;
				mover2++;
				mover3++;

			}
			else
			{
				multiplyer=opcode[opcode[mover1]]*opcode[opcode[mover2]];
				opcode[opcode[mover3]]=multiplyer;
			}

			mover0+=4;
			mover1+=4;
			mover2+=4;
			mover3+=4;
		}
		System.out.println("Opcode 0:");
		System.out.println(opcode[0]);
		System.out.println("Actual Final opcode:");
		for (int j=0;j<opcode.length;j++)
		{
			System.out.println(opcode[j]);
		}

		/**
		 * Advent of code->Day 2, Part 2
		 */

		int noun=0;
		int verb=0;
		int [] Intcode= {1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,6,1,19,
				1,5,19,23,2,6,23,27,1,27,5,31,2,9,31,35,1,5,35,39,
				2,6,39,43,2,6,43,47,1,5,47,51,2,9,51,55,1,5,55,59,
				1,10,59,63,1,63,6,67,1,9,67,71,1,71,6,75,1,75,13,
				79,2,79,13,83,2,9,83,87,1,87,5,91,1,9,91,95,2,10,
				95,99,1,5,99,103,1,103,9,107,1,13,107,111,2,111,
				10,115,1,115,5,119,2,13,119,123,1,9,123,127,1,5,
				127,131,2,131,6,135,1,135,5,139,1,139,6,143,1,143,
				6,147,1,2,147,151,1,151,5,0,99,2,14,0,0};

		//		1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,6,1,19,
		//		1,5,19,23,2,6,23,27,1,27,5,31,2,9,31,35,1,5,35,39,
		//		2,6,39,43,2,6,43,47,1,5,47,51,2,9,51,55,1,5,55,59,
		//		1,10,59,63,1,63,6,67,1,9,67,71,1,71,6,75,1,75,13,
		//		79,2,79,13,83,2,9,83,87,1,87,5,91,1,9,91,95,2,10,
		//		95,99,1,5,99,103,1,103,9,107,1,13,107,111,2,111,
		//		10,115,1,115,5,119,2,13,119,123,1,9,123,127,1,5,
		//		127,131,2,131,6,135,1,135,5,139,1,139,6,143,1,143,
		//		6,147,1,2,147,151,1,151,5,0,99,2,14,0,0
		//		
		int mover02=0;
		int mover12=1;
		int mover22=2;
		int mover32=3;

		while(mover32<Intcode.length)
		{

			if (Intcode[mover02]==1)
			{
				sum=Intcode[Intcode[mover12]]+Intcode[Intcode[mover22]];
				Intcode[Intcode[mover32]]=sum;
			}
			else if (Intcode[mover02]==99)
			{
				mover02++;
				mover12++;
				mover22++;
				mover32++;

			}
			else
			{
				multiplyer=Intcode[Intcode[mover12]]*Intcode[Intcode[mover22]];
				Intcode[Intcode[mover32]]=multiplyer;
			}

			if (100*Intcode[mover02]+Intcode[mover12]==19690720)
			{
				noun=Intcode[mover02];
				verb=Intcode[mover12];

			}
			mover02+=4;
			mover12+=4;
			mover22+=4;
			mover32+=4;
		}

		System.out.println("Noun: "+noun);
		System.out.println("Verb: "+verb);

	}

}
