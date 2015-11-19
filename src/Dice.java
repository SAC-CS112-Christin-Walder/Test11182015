import java.util.Random;

public class Dice {
	
	private int dice, lo, hi;
	private int lLow, hLow, lHigh, hHigh;
	private String range;
	private int points;

	public Dice() //Default constructor
	{
		dice=1;
	}
	
	public Dice(int nDice) //Constructor that will initialize with the user's input on the number of dice
	{
		dice=nDice;
	}
	
	
	public int Randomize(int dice) //Method to generate random value
	{
		lo = dice*1;
		hi = dice*6;
		
		Random rand = new Random();
		return rand.nextInt(hi - lo + 1) + lo;
	}
	
	public String Range(int dice, int random) //Method to determine the range and print results
	{
		lLow = dice;
		hLow = dice*3;
		lHigh = (dice*3)+1;
		hHigh = dice*6;

		
		System.out.printf("Low Range: %d-%d\n", lLow, hLow);
		System.out.printf("High Range: %d-%d\n\n", lHigh, hHigh);
		
		if (random>=lLow && random<=hLow)
			range = "LOW";
		else if (random>=lHigh && random<=hHigh)
			range = "HIGH";
		else
			range = "ERROR";
		
		System.out.printf("Random Value: %d\n", random);
		System.out.printf("Random Value's Range: %s\n\n", range);
		return range;
	}
	
	public int Answer(String userRange, String compRange) //Method to compare the user's guess and calculate points
	{
		
		if (userRange.equals(compRange)) {
			System.out.print("You are correct! +1 point\n");
			points=1;
		}
		else {
			System.out.printf("You are incorrect. -1 point...\n");
			points=-1;
		
		}
		return points;
	}
	
}
