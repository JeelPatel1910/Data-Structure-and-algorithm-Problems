//program to rotate array By n elements
class RotateArrayByN
{
	static void rotateLeft(int array[] , int d, int n)                       //function to rotate array by n numbers
	{
		for(int i= 0; i<d;i++)
		rotateByOne(array , n);
	}
	static void rotateByOne(int array[] , int n)                           //fuction to rotate array by 1 numbers
	{
	  	int i,tmp = array[0];
		for( i =0;i<n-1;i++)
			array[i] = array[i+1];
			array[i] = tmp;
	 }
	 static void printArray(int array [], int n)
	 {
		 for(int i = 0 ; i<n;i++)
		 {
		    System.out.print(array[i]+" ");	 
		 }
	 }
	public static void main(String args[])
   {
	  int array[]= {1,2,3,4,5,6,7};	
      int d= 2;
      int n=array.length;
      rotateLeft(array,d,n);
	  printArray(array,n);
	 }	
}
 
