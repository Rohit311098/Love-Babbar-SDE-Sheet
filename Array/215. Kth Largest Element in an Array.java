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
