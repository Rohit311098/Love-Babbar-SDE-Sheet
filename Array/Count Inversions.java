1. Approach 1: Using Two Loops

2. Approach 2: Using Merge sort logic
class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        long[] temp=new long[(int)N];
		long result=mergesort(arr,temp,0,(int) (N-1));
		return result;
    }
  
    static long mergesort(long[] arr,long[] temp,int left,int right)
	{
		long inv_count=0;
		if(right > left)
		{
			int mid=(right+left)/2;
			inv_count+=mergesort(arr,temp,left,mid);
			inv_count+=mergesort(arr,temp,mid+1,right);
			inv_count+=merge(arr,temp,left,mid+1,right);
		}
		return inv_count;
	}
  
  
   private static long merge(long[] arr,long[] temp, int left,int mid, int right) {
		
		long inv_count=0;
		int i=left;
		int j=mid;
		int k=left;
		while((i<=(mid-1)) && (j<=right))
		{
			if(arr[i]<=arr[j])
			{
				temp[k++]=arr[i++];
			}
			else
			{
				temp[k++]=arr[j++];
				inv_count=inv_count+(mid-i);
			}
		}

		while(i<=mid-1)
		{
			temp[k++]=arr[i++];
		}
		
		while(j<=right)
		{
			temp[k++]=arr[j++];
		}
		
		for(i=left;i<=right;i++)
		{
			arr[i]=temp[i];
		}
		return inv_count;
	}
}
