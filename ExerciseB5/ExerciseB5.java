import java.util.Scanner;

public class ExerciseB5
{
	enum GreetAgain {Y, N, y, n};
	
	public static void main(String[] args)
	{
		GreetAgain userAnswer = GreetAgain.Y;
		Scanner readAnswer = new Scanner(System.in);
		
		while (userAnswer.equals(GreetAgain.Y) || userAnswer.equals(GreetAgain.y))
		{
			System.out.println("Welcome! Would you like to be greeted again? (Y/N)");
			userAnswer = GreetAgain.valueOf(readAnswer.next());										
		}	
		
		readAnswer.close();
	}	
}