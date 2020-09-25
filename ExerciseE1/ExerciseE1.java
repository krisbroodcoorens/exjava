import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ExerciseE1
{
	public static void main(String[] args)
	{
		String instructorFirstName;
		String instructorLastName;
		int instructorAge;
		int startAge;
		double startSalary;		
		Scanner readInputData = new Scanner(System.in);
	
		//Accept value "instructorFirstName" from user via Terminal
		instructorFirstName = acceptFirstName(readInputData);		
		
		//Accept value "instructorFirstName" from user via Terminal
		instructorLastName  = acceptLastName(readInputData);	
		
		//Accept value "instructorFirstName" from user via Terminal
		instructorAge 		 = acceptAge(readInputData);
		
		//Accept value "startAge" from user via Terminal
		startAge 		 	 = acceptStartAge(readInputData);
		
		//Accept value "instructorFirstName" from user via Terminal
		startSalary  		 = acceptStartSalary(readInputData);
		
		//Calculate salary history
		printSalaryHistory(instructorFirstName, instructorAge, startAge, startSalary);		
		
		readInputData.close();
	}
	
	public static String acceptFirstName(Scanner readInputData)
	{
		boolean firstNameOk = false;
		String firstName = null;		
		//Accept value "instructorFirstName" from user via Terminal => loop until entered format of "instructorFirstName" is valid
		do
		{
			try
			{
				System.out.println("Please enter instructor first name: ");
				firstName = readInputData.nextLine();
				System.out.println(firstName);				
				if (firstName.isEmpty())
				{
					System.out.println("Instructor first name should be filled in.");
				}
				else
				{
					firstNameOk = true;
				}
			}
			catch (Exception expFirstName)
			{
				System.out.println("First name not valid. Please enter the first name in a correct format.");
			}
		} 
		while (!firstNameOk);
	
		return firstName;
	}
	
	public static String acceptLastName(Scanner readInputData)
	{
		boolean lastNameOk = false;
		String lastName = null;
		//Accept value "lastName" from user via Terminal => loop until entered format of "lastName" is valid
		do
		{
			try
			{
				System.out.println("Please enter instructor last name");
				lastName = readInputData.nextLine();
				if (lastName.isEmpty())
				{
					System.out.println("Instructor last name should be filled in.");
				}
				else
				{
					lastNameOk = true;
				}
			}
			catch (Exception expLastName)
			{
				System.out.println("Last name not valid. Please enter the first name in a correct format.");
			}
		} 
		while (!lastNameOk);		
		
		return lastName;		
	}
	
	public static int acceptAge(Scanner readInputData)
	{
		boolean ageOk = false;
		int age = 0;
		//Accept value "age" from user via Terminal => loop until entered format of "age" is valid
		do
		{
			try
			{
				System.out.println("Please enter instructor age");
				age = Integer.parseInt(readInputData.nextLine());
				ageOk = true;
			}
			catch (NumberFormatException expAge)
			{
				System.out.println("Age is not numeric. Please enter the age of the instructor in a correct format.");
			}
		} while (!ageOk);
		
		return age;
	}
		
	public static int acceptStartAge(Scanner readInputData)
	{
		boolean startAgeOk = false;
		int startAge = 0;
		//Accept value "startAge" from user via Terminal => loop until entered format of "startAge" is valid
		do
		{
			try
			{
				System.out.println("Please enter instructor startAge");
				startAge = Integer.parseInt(readInputData.nextLine());
				startAgeOk = true;
			}
			catch (NumberFormatException expStartAge)
			{
				System.out.println("Start age is not numeric. Please enter the start age of the instructor in a correct format.");
			}
		} while (!startAgeOk);
		
		return startAge;				
	}
	
	public static double acceptStartSalary(Scanner readInputData)
	{
		boolean startSalaryOk = false;
		double startSalary = 0.0;
		//Accept value "startSalary" from user via Terminal => loop until entered format of "startSalary" is valid
		do
		{
			try
			{
				System.out.println("Please enter instructor start salarty");
				startSalary = Double.parseDouble(readInputData.nextLine());
				startSalaryOk = true;
			}
			catch (NumberFormatException expStartSalary)
			{
				System.out.println("Start Salary is not numeric. Please enter the start salary of the instructor in a correct format.");
			}
		} while (!startSalaryOk);
		
		return startSalary;		
	}
	
	public static void printSalaryHistory (String firstName, int age, int startAge, double startSalary) 
	{
		int increasedAge = startAge;
		double increasedSalary = startSalary;
		int currentAge = age;
		
		try 
		{
			FileWriter mySalaryHistoryWriter = new FileWriter("salaryHistory.txt");
			while (increasedAge <= currentAge && (increasedAge - startAge) <= 35 )
			{
				mySalaryHistoryWriter.write("Salary of " + firstName + " at " + increasedAge + " is " + increasedSalary + "\n");
				increasedAge += 5;
				increasedSalary *= 1.03;
			}
			mySalaryHistoryWriter.write("Maximum Salary reached");
			System.out.println("Successfully create file salaryHistory.txt");
			mySalaryHistoryWriter.close();			
		}
		catch(IOException expSalaryHistory) 
		{
			System.out.println("Error writing file salaryHistory.txt");
			System.out.println(expSalaryHistory.getMessage());			
		}	  
	} 
}