import java.util.ArrayList;
import java.util.List;

public class ExerciseA4
{
	public static void main(String[] args)
	{
		String courseTitle = args[0];
		int numberDays = Integer.parseInt(args[1]);
		double priceDay = Double.parseDouble(args[2]);
		boolean priorKnowledge = Boolean.parseBoolean(args[3]);
		List<String> courseInstructors = new ArrayList<String>();
		
		courseInstructors.add("Sandy");
		courseInstructors.add("Guy");
		System.out.println("The course " +courseTitle+ " takes " +numberDays+ " days for " +priceDay+ " per day and prior knowledge is " +priorKnowledge+ ".");
		System.out.println("This course hase " +courseInstructors.size()+ " instructors.");

		double totalPrice = ((numberDays * priceDay) * 1.21);
		System.out.println("The total price of this course is " +totalPrice+ " euro.");
	}	
}