import java.util.Scanner;

public class Test {

	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int nDice, randomnum, result, score = 0, count=1;
		String guess, numRange, repeat="";
	do {	
		System.out.print("Enter the number of dice: ");
		nDice=input.nextInt();
		
		System.out.printf("Will the total value be in the HIGH or LOW range?: \n"); //Get user's guess on value range
		guess=input.next();
		guess=guess.toUpperCase();
		
		Dice game = new Dice(nDice); //Initialize the object game based on the Dice class
		
		randomnum = game.Randomize(nDice); //Use Randomize method to get random value
		
		numRange = game.Range(nDice, randomnum); //Use Range method to get the value ranges
	
		result = game.Answer(guess, numRange); //Use Answer method to determine if the user was right/wrong and get points
		
		score = score + result; //Running score is equal to the starting score plus the result (+1 or -1)
		System.out.printf("Your score is: %d\n\n", score);	
		
		System.out.printf("Times you have played: %d\n\n", count); //Display count and keep running total of games played
		count++;
		
		System.out.printf("Do you want to play again? (yes or no): "); //Ask the user to play again or not
		repeat=input.next();
		repeat = repeat.toUpperCase();
		}
	
	while (repeat.equals("YES")); //Loop the program if the user wants to play again. If not, say thanks!
	if (repeat != ("YES"))
		System.out.print("Thanks for playing!");
	}
}
