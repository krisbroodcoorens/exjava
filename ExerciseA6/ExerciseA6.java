import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerciseA6
{
	public static void main(String[] args)
	{
		String inputMonth;
		int inputDay;
		Map<String, Integer> myCalendar = new HashMap<String, Integer>();
		
		myCalendar.put("January", 31);
		myCalendar.put("February", 28);
		myCalendar.put("March", 31);
		myCalendar.put("April", 30);
		myCalendar.put("May", 31);
		myCalendar.put("June", 30);
		myCalendar.put("July", 31);
		myCalendar.put("August", 31);
		myCalendar.put("September", 30);
		myCalendar.put("October", 31);
		myCalendar.put("November", 30);
		myCalendar.put("December", 31);
		
		Scanner myInput = new Scanner(System.in);
		System.out.println("Please enter the month name:");
		inputMonth = myInput.next();
		System.out.println("Please enter the day:");
		inputDay = Integer.parseInt(myInput.next());
		
		int nbrDaysLeft = myCalendar.get(inputMonth) - inputDay;
				
		System.out.println("There are still " +nbrDaysLeft+ " days to go in " +inputMonth);
		
	}	
}