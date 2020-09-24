import java.util.Scanner;

public class ExerciseB5
{
	enum GreetAgain {Y, N};
	
	public static void main(String[] args)
	{
		GreetAgain userAnswer = GreetAgain.Y;
		Scanner readAnswer = new Scanner(System.in);
		
		while (userAnswer.toString() == "Y")
		{
			System.out.println("Welcome! Would you like to be greeted again? (Y/N)");
			userAnswer = GreetAgain.valueOf(readAnswer.next());										
		}	
		
		readAnswer.close();
	}	
}