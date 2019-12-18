package extraChallenges;

public class AdventOfCodeDay1 {

	public static void main(String[] args) {
		//have all the masses of all the modules that need fuel
		int [] RocketFuelArray= {75592, 56081, 141375, 103651, 132375, 90584, 94148,
				85029, 95082, 148499, 108192, 97739, 60599, 140308, 125171, 129160, 
				143118, 98762, 103907, 115389, 127835, 57917, 72980, 88747, 86595, 
				130407, 116862, 84652, 112817, 136922, 51900, 76677, 146244, 121897, 
				99310, 136486, 84665, 117344, 88992, 83929, 74820, 56651, 74001, 88636, 
				51232, 57878, 114559, 58879, 145519, 83727, 111774, 146256, 123479, 
				86955, 64027, 59812, 59211, 85835, 58084, 113676, 119161, 106368, 137358, 
				85290, 81131, 124857, 51759, 82977, 138957, 146216, 147807, 72265, 60332, 
				136741, 110215, 89293, 148703, 73152, 93080, 140220, 68511, 77397, 51934, 
				100243, 92442, 135254, 98873, 51105, 118755, 79155, 89249, 137430, 142807, 
				86334, 117266, 149484, 89284, 63361, 52269, 111666};

		/**
		 * Advent of code->Day 1, Part 1
		 * Fuel required to launch a given module is based on its mass. 
		 * Specifically, to find the fuel required for a module, take its mass, 
		 * divide by three, round down, and subtract 2.
		 */

		int total=0;

		//Does the fuel calculation for all modules
		for (int i=0;i<RocketFuelArray.length;i++)
		{
			int totalFuel=RocketFuelArray[i];
			total+=(Math.round(totalFuel/3))-2;
		}

		System.out.println("*****Fuel required*****");
		System.out.println(total);

		/**
		 * Advent of code->Day 1, Part 2
		 * calculate its fuel and add it to the total.
		 *  Then, treat the fuel amount you just calculated 
		 *  as the input mass and repeat the process, continuing 
		 *  until a fuel requirement is zero or negative.
		 *  A.K.A Torture!!!!
		 */

		total=0;
		int totalFuel;

		System.out.println("*****Adding starts*****");

		//visits and does the fuel calculation for all modules
		for (int i=0;i<RocketFuelArray.length;i++)
		{
			totalFuel=RocketFuelArray[i];

			while(totalFuel>0)
			{
				totalFuel=(Math.round(totalFuel/3))-2;

				if (totalFuel>(-1))
				{
					total+=totalFuel;
				}

				System.out.println(total);
			}

		}
		System.out.println("*****Final amount of fuel needed*****");
		System.out.println(total);
	}

}
