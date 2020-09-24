public class ExerciseA3
{
	public static void main(String[] args)
	{
		String courseTitle = "Java Reskilling";
		int numberDays = 30;
		double priceDay = 1000.00;
		boolean priorKnowledge = false;
		List<String> courseInstructors = new ArrayList<String>();
		
		courseInstructors.add("Sandy");
		courseInstructors.add("Guy");
		System.out.println("The course " +courseTitle+ " takes " +numberDays+ " days for " +priceDay+ " per day and prior knowledge is " +priorKnowledge+ ".");
		System.out.println("This course hase " +courseInstructors.size()+ " instructors.");

		double totalPrice = ((numberDays * priceDay) + ((numberDays * priceDay) * 0.21));
		System.out.println("The total price of this course is €" +totalPrice+ ".");
	}	
}