public class ExerciseB3
{
	public static void main(String[] args)
	{

		int[] myIntegerArray = new int[]{55,60,102,85,80,12,35,45,65,100};
		int i;
		int total = 0;
		double average = 0.0;
		
		for (i=0;i<myIntegerArray.length;i++)
		{
			total = total + myIntegerArray[i];
		}
		
		average = total / myIntegerArray.length;		
		System.out.println("The average of this array of numbers is " +average);
		
	}	
}