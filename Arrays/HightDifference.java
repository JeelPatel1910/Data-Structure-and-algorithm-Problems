//Minimise the maximum difference between heights
/*
Input  : arr[] = {1, 15, 10}, k = 6
Output :  Maximum difference is 5.
Explanation : We change 1 to 6, 15 to 
9 and 10 to 4. Maximum difference is 5
(between 4 and 9). We can't get a lower
difference.

Input : arr[] = {1, 5, 15, 10} 
        k = 3   
Output : Maximum difference is 8
arr[] = {4, 8, 12, 7}

*/
import java.util.*;
class HightDifference
{
	static int getMinDiff(int array[] , int n, int k)
	{
		if(n==1)
		return 0;
		
		Arrays.sort(array);
		int ans = array[n-1]-array[0];
		int small = array[0]+k;
		int big = array[n-1] - k;
		int tmp = 0;
		
		if(big<small)
	    {
		  tmp = big;
          big = small;
          small = tmp;		  
		 }
		 for(int i=1;i<n-1;i++)
		 {
			 int add = array[i]+k;
			 int sub = array[i]-k;
			 if(add<=big || small<=sub  )
			 continue;
			 
			 if (big - sub <= add - small) 
                small = sub; 
            else
                big = add; 
           } 
        return Math.min(ans, big - small); 
		 }
public static void main(String args[])
{
	int arr[] = {1,10,14,14,15};
	int n = arr.length;
	int k = 6;
	System.out.println("minimum difference between class is:"+getMinDiff(arr,n,k));
}
 }
