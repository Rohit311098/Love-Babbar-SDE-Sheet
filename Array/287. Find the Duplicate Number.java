Brute Force Approach-> Using Two loops just traverse and check if that element is present or not.
  TC-O(N2)   SC-O(1)

Approach 2: using Hashset just check which number repeates and return it  or you can use another array and place element with the help of index.

  TC-O(N)  SC-O(N)
  
  
  Using Hashset:
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

Using Extra Array:

class Solution {
    public int findDuplicate(int[] nums) {

        int[] dup=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
          if(dup[nums[i]-1]==0)
          {
            dup[nums[i]-1]=nums[i];
          }
          else
          {
            return nums[i];
          }
        }

        return -1;
    }
}
