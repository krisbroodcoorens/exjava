import java.util.Scanner;

public class ExerciseC4
{
	enum GreetAgain {Y, N, y, n};
	
	public static void main (String[] args) 
	{		
		questionAnswerRecursive();		
	}
	
	public static void questionAnswerRecursive(){	
		Scanner readAnswer = new Scanner(System.in);
		GreetAgain userAnswer = GreetAgain.Y;
		System.out.println("Welcome!"+"\n"+"Would you like to be greeted again? (Y/N)");
		userAnswer = GreetAgain.valueOf(readAnswer.next());
		if (userAnswer.equals(GreetAgain.Y) || userAnswer.equals(GreetAgain.y))
		{
			questionAnswerRecursive();
		}
		readAnswer.close();	 
	}

}