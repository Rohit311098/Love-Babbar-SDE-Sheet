1. Using Directly  Sorting 

TC-O(NLOGN)  SC-O(1)
  
  
2. Using Priority Queue-  TC-O(logn)   SC-O(N)

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        for(int i=1;i<k;i++)
        {
            pq.remove();
        }
        return pq.peek();
    }
}

2. Using Priority Queue  TC-O(NLOGK)  SC-O(K)


private static int prioritymethod(int[] arr, int n, int k) {
		// In below priority queue max element has max priority and min have least priority
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	       
	       for(int i=0;i<n;i++)
	       {
	    	   System.out.println("Element adding into priority queue"+arr[i]);
	           pq.add(arr[i]);
	           if(pq.size()>k)
	           {
	        	   // We remove least element as it has min priority
	               System.out.println("Removing element "+pq.remove());
	           }
	           
	       }
	       
	       return pq.peek();
	}


3. Quick sort method   TC-O(N)-> Average Case, TC-O(N2) Worst case   SC-O(1)
  
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        return quicksortmethod(arr,l,r,nums.length-k);
    }
    private static int quicksortmethod(int[] arr, int l, int r, int k) {
		
		//only 1 element in the array
		if(l==r)
		{
			return arr[l];
		}
		
		int pos=partition(arr,l,r);
		if (pos == k) 
      return arr[k];
		else if (pos < k) 
			return quicksortmethod(arr, pos+1, r, k);
		
		return quicksortmethod(arr, l, pos-1, k);
		
	}
	private static int partition(int[] a, int l, int r) {
		int pivot=a[r];
		int i=l;	
		for(int j=l;j<=r-1;j++)
		{
			if(a[j]<=pivot)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}	
		}
		int temp=a[r];
		a[r]=a[i];
		a[i]=temp;
		return i;
	}
}
