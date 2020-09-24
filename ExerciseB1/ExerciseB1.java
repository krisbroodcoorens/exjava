import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseB1
{
	public static void main(String[] args)
	{
		String courseTitle;
		int numberDays;
		double priceDay;
		boolean priorKnowledge;
		List<String> courseInstructors = new ArrayList<String>();
		double totalPrice;
		
		Scanner readInput = new Scanner(System.in);
		System.out.println("Please enter a Course Title, Number of Days, Price per Day and Prior Knowledge.");
		courseTitle    = readInput.next();
		numberDays     = Integer.parseInt(readInput.next());
		priceDay       = Double.parseDouble(readInput.next());
		priorKnowledge = Boolean.parseBoolean(readInput.next());
		
		courseInstructors.add("Sandy");
		courseInstructors.add("Guy");
		
		System.out.println("The course " +courseTitle+ " takes " +numberDays+ " days for " +priceDay+ " per day and prior knowledge is " +priorKnowledge+ ".");
		System.out.println("This course hase " +courseInstructors.size()+ " instructors.");
		
		if (numberDays > 3 && priorKnowledge == true)
		{
			totalPrice = (numberDays * priceDay);
		}
		else
		{
			totalPrice = ((numberDays * priceDay) * 1.21);
		}
		
		System.out.println("The total price of this course is " +totalPrice+ " euro.");
	}	
}