import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseC5
{
	public static void main(String[] args)
	{
		String courseTitle;
		int numberDays =0 ;
		double priceDay = 0.0;
		boolean priorKnowledge = false;
		boolean formatNbrDaysOk = false;
		boolean formatPriceDayOk = false;
		List<String> courseInstructors = new ArrayList<String>();		
		String labelCourse;
		
		//accept values from user
		Scanner readInput = new Scanner(System.in);
		System.out.println("Please enter a Course Title");
		courseTitle    = readInput.next();


		//loop until entered format of numberDays is valid
		do
		{
			try
			{
				System.out.println("Please enter number of days");
				numberDays     = Integer.parseInt(readInput.next());
				formatNbrDaysOk = true;
			}
			catch (Exception expNumberDays)
			{
				System.out.println("Number of days not numeric. Please enter the number of days in a correct format.");
			}
		} while (!formatNbrDaysOk);
			
		//loop until entered value of price per day is valid
		do
		{
			try
			{
				System.out.println("Please enter price per day");
				priceDay       = Double.parseDouble(readInput.next());
				formatPriceDayOk = true;
			}
			catch (Exception expNumberDays)
			{
				System.out.println("Price per day not numeric. Please enter the price of day in a correct format.");
			}
		} while (!formatPriceDayOk);
		System.out.println("Please enter prior knowledge");
		priorKnowledge = Boolean.parseBoolean(readInput.next());
		
		//print course information
		printInfo(courseTitle, numberDays, priceDay, priorKnowledge);
		
		//add instructors
		courseInstructors.add("Sandy");
		courseInstructors.add("Guy");
		//print number of instructors
		System.out.println("This course has " +courseInstructors.size()+ " instructors.");
				
		// Label the course based on the price per day
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
		
		System.out.println("The course is labeled as " +labelCourse);
	}
	
	public static void printInfo(String title, int days, double price, boolean knowledge)
	{
		System.out.println("The course " +title+ " takes " +days+ " days for " +price+ " per day and prior knowledge is " +knowledge+ ".");		
		System.out.println("The total price of this course is " +calculateTotal(days, price, knowledge)+ " euro.");
	}
	
	public static double calculateTotal(int days, double price, boolean knowledge)
	{
		double total = 0.0;
		// If a course takes more than 3 days and no prior knowledge is required, you don't need to pay VAT.
		if (days > 3 && knowledge == true)
			{
			total = (days * price);
			}
		else
			{
			total = ((days * price) * 1.21);
			}
		return total;
	}
}