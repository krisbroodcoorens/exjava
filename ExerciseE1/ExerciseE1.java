
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
	
		//Accept value "instructorFirstName" from user via Terminal
		instructorFirstName = acceptFirstName();		
		
		//Accept value "instructorFirstName" from user via Terminal
		instructorLastName  = acceptLastName();	
		
		//Accept value "instructorFirstName" from user via Terminal
		instructorAge 		 = acceptAge();
		
		//Accept value "startAge" from user via Terminal
		startAge 		 	 = acceptStartAge();
		
		//Accept value "instructorFirstName" from user via Terminal
		startSalary  		 = acceptStartSalary();
		
		//Calculate salary history
		printSalaryHistory(instructorFirstName, instructorLastName, instructorAge, startAge, startSalary);		
	}
	
	public static String acceptFirstName()
	{
		boolean firstNameOk = false;
		String firstName = null;
		Scanner readFirstName = new Scanner(System.in);
		//Accept value "instructorFirstName" from user via Terminal => loop until entered format of "instructorFirstName" is valid
		do
		{
			try
			{
				System.out.println("Please enter instructor first name: ");
				firstName = readFirstName.nextLine();
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
		
		readFirstName.close();
		return firstName;
	}
	
	public static String acceptLastName()
	{
		boolean lastNameOk = false;
		String lastName = null;
		Scanner readLastName = new Scanner(System.in);
		//Accept value "lastName" from user via Terminal => loop until entered format of "lastName" is valid
		do
		{
			try
			{
				System.out.println("Please enter instructor last name");
				lastName = readLastName.nextLine();
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
		
		readLastName.close();
		return lastName;		
	}
	
	public static int acceptAge()
	{
		boolean ageOk = false;
		int age = 0;
		Scanner readAge = new Scanner(System.in);
		//Accept value "age" from user via Terminal => loop until entered format of "age" is valid
		do
		{
			try
			{
				System.out.println("Please enter instructor age");
				age = Integer.parseInt(readAge.nextLine());
				ageOk = true;
			}
			catch (Exception expAge)
			{
				System.out.println("Age is not numeric. Please enter the age of the instructor in a correct format.");
			}
		} while (!ageOk);
		
		readAge.close();
		return age;
	}
		
	public static int acceptStartAge()
	{
		boolean startAgeOk = false;
		int startAge = 0;
		Scanner readStartAge = new Scanner(System.in);
		//Accept value "startAge" from user via Terminal => loop until entered format of "startAge" is valid
		do
		{
			try
			{
				System.out.println("Please enter instructor startAge");
				startAge = Integer.parseInt(readStartAge.nextLine());
				startAgeOk = true;
			}
			catch (Exception expStartAge)
			{
				System.out.println("Start age is not numeric. Please enter the start age of the instructor in a correct format.");
			}
		} while (!startAgeOk);
		
		readStartAge.close();
		return startAge;				
	}
	
	public static double acceptStartSalary()
	{
		boolean startSalaryOk = false;
		double startSalary = 0.0;
		Scanner readStartSalary = new Scanner(System.in);
		//Accept value "startSalary" from user via Terminal => loop until entered format of "startSalary" is valid
		do
		{
			try
			{
				System.out.println("Please enter instructor start salarty");
				startSalary = Double.parseDouble(readStartSalary.nextLine());
				startSalaryOk = true;
			}
			catch (Exception expStartSalary)
			{
				System.out.println("Start Salary is not numeric. Please enter the start salary of the instructor in a correct format.");
			}
		} while (!startSalaryOk);
		
		readStartSalary.close();
		return startSalary;		
	}
	
	public static void printSalaryHistory (String firstName, String lastName, int age, int startAge, double startSalary) 
	{
		try 
		{
			FileWriter mySalaryHistoryWriter = new FileWriter("salaryHistory.txt");;
				
			while (startAge <= age && (startSalary - startAge) <= 35)
			{
				mySalaryHistoryWriter.write("Salary of " + firstName + " at " + startAge + " is " + startSalary + "\n");
				startAge += 5;
				startSalary *= 1.03;
			}
			mySalaryHistoryWriter.write("Maximum Salary reached");				
			mySalaryHistoryWriter.close();			
		}
		catch(IOException expSalaryHistory) 
		{
			System.out.println("Error writing file salaryHistory.txt");
			System.out.println(expSalaryHistory.getMessage());			
		}	  
	} 
}