1. Kadane Algorithm.   TC-O(N)   SC-O(1)
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        long max_sum_so_far=Integer.MIN_VALUE;
        
        long current_sum=0;
        
        for(int i=0;i<n;i++)
        {
            current_sum=current_sum+arr[i];
      
            if(current_sum>max_sum_so_far)
            {
                max_sum_so_far=current_sum;
            }
            
            if(current_sum<0)
            {
                current_sum=0;
            }
        }
        
        return max_sum_so_far;
    }
