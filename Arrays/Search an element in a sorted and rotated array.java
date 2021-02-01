//Search an element in a sorted and rotated array
class SearchInRotatedArray
{
	static int search(int array[], int low , int high , int key)
	{
		if(low>high)
		return -1;
		
		int mid = (low+ high)/2;
		if(array[mid]==key)
		return mid;
		
		if(array[low]<=array[mid])
		{
		   if(array[low]<=key && key<=array[mid])
           return search(array ,low,mid-1,key);
 
           return search(array,mid+1,high,key);
        }
		 
		  if(array[mid]<=key && key <=array[high])
		  return search(array,mid+1,high,key );
		  
		 return search(array , low, mid-1,key);
	  }
  public static void main(String args[])
  {
	 int array[] = {4,5,6,7,8,9,1,2,3};
     int n = array.length;
	 int key = 6;
     int i =search(array,0,n-1,key);
	 if(i!=-1)
	 System.out.println("index :"+i);
	 else
	 System.out.println("key not found ");
  }
 } 
