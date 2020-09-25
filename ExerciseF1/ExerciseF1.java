import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExerciseF1
{
	public static void main(String[] args)
	{
		//Define "myFirstCourse" instance
		Course myFirstCourse = new Course();
		boolean formatNbrDaysOk = false;
		boolean formatPriceDayOk = false;

		//Accept value "Course Title" from user via Terminal
		Scanner readInput = new Scanner(System.in);
		System.out.println("Please enter a Course Title");
		myFirstCourse.courseTitle = readInput.next();

		//Accept value "numberDays" from user via Terminal => loop until entered format of "numberDays" is valid
		do
		{
			try
			{
				System.out.println("Please enter number of days");
				myFirstCourse.courseDays = Integer.parseInt(readInput.next());
				formatNbrDaysOk = true;
			}
			catch (Exception expNumberDays)
			{
				System.out.println("Number of days not numeric. Please enter the number of days in a correct format.");
			}
		} while (!formatNbrDaysOk);
			
		//Accept value "priceDay" from user via Terminal => loop until entered format of "priceDay" is valid
		do
		{
			try
			{
				System.out.println("Please enter price per day");
				myFirstCourse.coursePriceDay = Double.parseDouble(readInput.next());
				formatPriceDayOk = true;
			}
			catch (Exception expNumberDays)
			{
				System.out.println("Price per day not numeric. Please enter the price of day in a correct format.");
			}
		} while (!formatPriceDayOk);
		//Accept value "priorKnowledge" from user via Terminal
		System.out.println("Please enter prior knowledge");
		myFirstCourse.coursePriorKnowledge = Boolean.parseBoolean(readInput.next());
		
		//Read instructors from txt.file
		//myFirstCourse.readSaveInstructorsFile(courseInstructors);	
		//Print course information
		myFirstCourse.printInfo();
		
		//Define "mySecondCourse" instance
		Course mySecondCourse = new Course("Java", 20, 500.00, false);		
		//Read instructors from txt.file
		//mySecondtCourse.readSaveInstructorsFile(courseInstructors);	
		//Print "mySecondCourse" information
		mySecondCourse.printInfo();
		
		//Define "myThirdCourse" instance
		Course myThirdCourse = new Course("ReactJS", 15, 650.00, true);		
		//Read instructors from txt.file
		//myThirdCourse.readSaveInstructorsFile(courseInstructors);	
		//Print "myThirdCourse" information
		myThirdCourse.printInfo();
	}
}	
