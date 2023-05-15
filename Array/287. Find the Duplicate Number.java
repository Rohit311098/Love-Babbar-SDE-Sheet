Approach 1: using Hashset just check which number repeates and return it.
  class Solution {
    public int findDuplicate(int[] nums) {

      HashSet<Integer> h=new HashSet<>();

      for(int i=0;i<nums.length;i++)
      {
         if(h.contains(new Integer(nums[i]))==false)
         {
            h.add(new Integer(nums[i]));
         }
         else
         {
           return nums[i];
         }
      }

      return 0;
        
    }
}


Approach 2: Using Index of element
