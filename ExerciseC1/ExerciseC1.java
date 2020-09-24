import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseC1
{
	public static void main(String[] args)
	{
		String courseTitle;
		int numberDays;
		double priceDay;
		boolean priorKnowledge;
		List<String> courseInstructors = new ArrayList<String>();
		double totalPrice;
		String labelCourse;
		
		//accept values from user
		Scanner readInput = new Scanner(System.in);
		System.out.println("Please enter a Course Title");
		courseTitle    = readInput.next();
		System.out.println("Please enter number of days");
		numberDays     = Integer.parseInt(readInput.next());
		System.out.println("Please enter price per day");
		priceDay       = Double.parseDouble(readInput.next());
		System.out.println("Please enter prior knowledge");
		priorKnowledge = Boolean.parseBoolean(readInput.next());
		
		//print course information
		printInfo(courseTitle, numberDays, priceDay, priorKnowledge);
		
		//add instructors
		courseInstructors.add("Sandy");
		courseInstructors.add("Guy");
		//print number of instructors
		System.out.println("This course has " +courseInstructors.size()+ " instructors.");
				
		// If a course takes more than 3 days and no prior knowledge is required, you don't need to pay VAT.
		if (priceDay < 500.00)
		{
			labelCourse = "Cheap";
		}
		else if (priceDay >= 500.00 && priceDay <= 1500.00)
		{
			labelCourse = "Ok";
		}
		else
		{
			labelCourse = "Expensive";
		}
		
		// If a course takes more than 3 days and no prior knowledge is required, you don't need to pay VAT.
		if (numberDays > 3 && priorKnowledge == true)
			{
			totalPrice = (numberDays * priceDay);
			}
		else
			{
			totalPrice = ((numberDays * priceDay) * 1.21);
			}
		
		System.out.println("The total price of this course is " +totalPrice+ " euro. The course is labeled as " +labelCourse);
	}
	
	public static void printInfo(String title, int days, double price, boolean knowledge)
	{
		System.out.println("The course " +title+ " takes " +days+ " days for " +price+ " per day and prior knowledge is " +knowledge+ ".");		
	}	
}