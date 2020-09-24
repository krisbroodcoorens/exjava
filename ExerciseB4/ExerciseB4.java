import java.util.Scanner;

public class ExerciseB4
{
	public static void main(String[] args)
	{
		String languageCode;		
		Scanner readLanguage = new Scanner(System.in);
		
		System.out.println("Please enter a language code (NL, FR, EN or other).");
		languageCode   = readLanguage.nextLine();
				
		switch (languageCode)
		{
			case "NL":
				System.out.println("Goeiedag!");
				break;
			case "EN":
				System.out.println("Good day!");
				break;
			case "FR":
				System.out.println("Bonjour!");
				break;
			default:
				System.out.println("Goeiedag, bonjour and good day!");
				break;
		}
	}	
}