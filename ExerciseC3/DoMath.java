public class DoMath 
{
	public static double calculateAverage(int[] numbersArray)
	{
		int total = 0;
		double average = 0.0;
	
		for (int i: numbersArray)
		{
			total += i;
		}
	
		average = total / numbersArray.length;
		return average;
	}
}