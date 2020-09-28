import javax.swing.JOptionPane;

public class ExerciseE2
{
	public static void main (String[] args)
	{
		Palindrome myWord = new Palindrome();
				
		if (myWord.isPalindrome(JOptionPane.showInputDialog("Please fill in word:")) == true)
		{
			JOptionPane.showMessageDialog(null, "This word is a palindrome!", "Check palindrome", JOptionPane.WARNING_MESSAGE);
		}	
		else
		{
			JOptionPane.showMessageDialog(null, "This word is NOT a palindrome!", "Check palindrome", JOptionPane.WARNING_MESSAGE);
		}

		System.exit(0);		
	}	
}