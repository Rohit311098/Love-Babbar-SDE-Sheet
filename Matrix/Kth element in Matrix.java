1. Brute Force Approach: Use extra space and sort it then return arr[k-1] element.
  
2. Optimised Approach: TC-O(N^2 LOGN)   SC-O(N)
  
  class Solution {
    public int kthSmallest(int[][] matrix, int k) {
      int n=matrix.length;
      Map<Integer,Integer> map=new TreeMap<>();

      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          map.put(matrix[i][j],map.getOrDefault(matrix[i][j],0)+1);
        }
      }

      for(int x:map.keySet())
      {
           k-=map.get(x);

           if(k<=0)
           {
             return x;
           }
      }

      return -1;
        
    }
}


3. Optimised Approach 3: 
