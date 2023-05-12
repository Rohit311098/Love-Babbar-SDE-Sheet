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
    
   
2. Print Index or to print element of largest continuous subarray
    
static void maxSubArraySum(int a[], int size)
    {
        int max_so_far = Integer.MIN_VALUE,
            max_ending_here = 0, start = 0, end = 0, s = 0;
 
        for (int i = 0; i < size; i++) {
            max_ending_here += a[i];
 
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
 
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is "
                           + max_so_far);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }
 
        
        
