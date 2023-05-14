1. Using sorting and then traversing TC-O(NlogN)  SC-O(1)
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
         
        Arrays.sort(arr);
        int max_height=arr[n-1];
        int min_height=arr[0];
        
        int res=max_height-min_height;
        
        for(int i=1;i<n;i++)
        {
            /*The reason we don’t take a[i] for both minHeight and maxHeight is because it is possible that a[i] – k < arr[0] +k and at the same time a[i] +k > a[n-1] – k.
            In this scenario, we would be both increasing and decreasing the height of the tower which is not possible. */
          
        	max_height=Math.max(arr[i-1]+k,arr[n-1]-k);
        	min_height=Math.min(arr[i]-k,arr[0]+k);
        	res=Math.min(res,max_height-min_height);
        }
        
        return res;
    }
}


2. Using Greedy Method- 
  The idea behind this approach is to increase or decrease the heights of the towers in a way that moves the towers closer to the average height. 
  By doing this, we can minimize the difference between the maximum and minimum heights.
    
    public static int getMinDiff2(int[] arr, int n, int k) {
	        
	        int min_height=get_min(arr,n);
	        int max_height=get_max(arr,n);
	        
	        int old_diff=max_height-min_height;
	        
	        System.out.println("Initial difference"+old_diff);
	        
	        int avg=(max_height+min_height)/2;
	        System.out.println("Average height"+avg);
	        
	        for(int i=0;i<n;i++)
	        {
	            if(arr[i]>avg)
	            {
	                arr[i]-=k;
	            }
	            else
	            {
	                arr[i]+=k;
	            }
	        }
	        
	        System.out.println("Array after changing");
	        
	        for(int i=0;i<n;i++)
	        {
	           System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        int new_min_height=get_min(arr,n);
	        int new_max_height=get_max(arr,n);
	        
	        System.out.println("New Maximum of array"+new_max_height);
	        System.out.println("New Minimum of array"+new_min_height);
	        
	        int new_diff=new_max_height-new_min_height;
	        System.out.println("New difference"+new_diff);
	        
	        return (old_diff > new_diff)?new_diff:old_diff;
	     
	         
	    }
	    
	    public static int get_min(int[] arr,int n)
	    {
	        int min_element=Integer.MAX_VALUE;
	        
	        for(int i=0;i<n;i++)
	        {
	            if(min_element>arr[i])
	            {
	                min_element=arr[i];
	            }
	        }
	        System.out.println("Minimum element "+min_element);
	        return min_element;
	    }
	    
	    public static int get_max(int[] arr,int n)
	    {
	        int max_element=Integer.MIN_VALUE;
	        
	         for(int i=0;i<n;i++)
	        {
	            if(max_element<arr[i])
	            {
	                max_element=arr[i];
	            }
	        }
	         System.out.println("Maximum element "+max_element);
	        return max_element;
	    }
  
  
  
