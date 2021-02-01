//program to check wether it's palindrome or not
class PalindromeString
{
   static boolean isPalindrome(String string)
   {
	   int i =0 ,  j =string.length()-1;
	   while(i<j)
	   {
		  if(string.charAt(i)!=string.charAt(j))
          {
			  return false;
		  }
			  i++;
			  j--;
	    }
		return true;
   }
   public static void main(String args[])
   {
	   String string = "mom asa mom";
       
	   if(isPalindrome(string))
	       System.out.println("String is palindrome");
	  else
           System.out.println("String is not palindrome");	  
   }   
 }
