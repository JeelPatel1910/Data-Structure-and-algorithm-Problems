//program to reverse a String
class ReverseString
{
	public static void main(String args[])
	{
		String str = "welcome to String class";
		char arr[]= str.toCharArray();
		int n= arr.length;
        for(int i =n-1;0<=i;i--)
        {
			System.out.print(arr[i]);
		}		
		
	}
}
