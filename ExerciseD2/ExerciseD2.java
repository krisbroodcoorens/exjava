import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExerciseD2
{
	public static void main(String[] args)
	{
		//Define variables
		String courseTitle;
		int numberDays =0 ;
		double priceDay = 0.0;
		boolean priorKnowledge = false;
		boolean formatNbrDaysOk = false;
		boolean formatPriceDayOk = false;
		List<String> courseInstructors = new ArrayList<String>();		
		String labelCourse;
		
		//Accept value "Course Title" from user via Terminal
		Scanner readInput = new Scanner(System.in);
		System.out.println("Please enter a Course Title");
		courseTitle    = readInput.next();

		//Accept value "numberDays" from user via Terminal => loop until entered format of "numberDays" is valid
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
			
		//Accept value "priceDay" from user via Terminal => loop until entered format of "priceDay" is valid
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
		
		//Accept value "priorKnowledge" from user via Terminal
		System.out.println("Please enter prior knowledge");
		priorKnowledge = Boolean.parseBoolean(readInput.next());
		
		//Read instructors from txt.file
		readSaveInstructorsFile(courseInstructors);	
				
		// Label the course based on the "priceDay"
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
		
		//Print course information
		printInfo(courseTitle, numberDays, priceDay, priorKnowledge, courseInstructors, labelCourse);

	}
	
	public static void printInfo(String title, int days, double price, boolean knowledge, List<String> instructors, String label)
	{
		try 
		{
			File myPrintInfoFile = new File("PrintInfo.txt");
			if (myPrintInfoFile.createNewFile())
			{
				FileWriter myPrintInfoWriter = new FileWriter("PrintInfo.txt");
			    myPrintInfoWriter.write("The course " +title+ " takes " +days+ " days for " +price+ " per day and prior knowledge is " +knowledge+ "." + "\r\n");
			    myPrintInfoWriter.write("The total price of this course is " +calculateTotal(days, price, knowledge)+ " euro." + "\r\n"); 
			    myPrintInfoWriter.write("The course is labeled as " +label + "\r\n"); 
			    myPrintInfoWriter.write("This course has " +instructors.size()+ " instructors." + "\r\n");
		        if (instructors.size() > 0) 
		        {
		        	myPrintInfoWriter.write("The instructors for this course are: " + "\r\n");
		        }
		        for (int i=0;i<instructors.size();i++)
				{
		        	myPrintInfoWriter.write(instructors.get(i) + "\r\n");
				}	 
			    myPrintInfoWriter.close();
			    System.out.println("File created successfully: " + myPrintInfoFile.getName());
		    } 
			else
			{
				System.out.println("File already exists.");
		    }
		} 
		catch (IOException expPrintInfoFile) 
		{
			System.out.println("An error occurred.");
			expPrintInfoFile.printStackTrace();
		}
				
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
	
	public static void readSaveInstructorsFile(List<String> myInstructorsArray)
	{
	    //Read file "instructors.txt". Count and display records in the file.
		try
	    {
	        File instructorFile = new File("instructors.txt");
	        Scanner myFileReader = new Scanner(instructorFile);
	        while (myFileReader.hasNextLine()) 
	        {
	        	myInstructorsArray.add(myFileReader.nextLine());	          
	        }
	        myFileReader.close();       	
	    } 
	    catch (FileNotFoundException expFile)
	    {
	    	System.out.println("!!! An error occurred during opening of instructor file !!!");	    	
	    }	    
	}
}	