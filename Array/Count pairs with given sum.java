Approach 1: Using 2Loops TC-O(N2)  SC-O(1)
  
  
Approach 2: Using Hashmap  TC-O(N)   SC-O(N)
  
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        if(arr.length==0 || arr.length==1)
        {
            return 0;
        }
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        int pair=0;
        
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(k-arr[i]))
            {
                pair+=hm.get(k-arr[i]);
            }
            
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        
        return pair;
    }
}
