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
  
  
  
