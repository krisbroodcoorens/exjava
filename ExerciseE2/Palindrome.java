public class Palindrome 
{
	String inputWord;	
	
	public boolean isPalindrome(String checkWord)
	{
		int i = 0, j = checkWord.length() - 1; 
  
        while (i < j) { 
  
        	// If there is a mismatch 
            if (checkWord.charAt(i) != checkWord.charAt(j)) 
            {    
            	return false;   
            }	
            i++; 
            j--; 
        } 
  
        return true; 
    } 
}