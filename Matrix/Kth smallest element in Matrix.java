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


3. Optimised Approach 3: TC-O(N*log(N+N))  SC-O(1)

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        if(n==1)
        {
          return matrix[0][0];
        }
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];

        while(low<=high)
        {
           int mid=(low+high)/2;
           if(count(matrix,n,mid)>=k)
           {
              high=mid-1;
           }
           else
           {
              low=mid+1;
           }
        }
        return low;
    }

    public int count(int[][] matrix,int n,int x)
    {
        int i=0;
        int j=n-1;
        int number_count=0;
        while(i<n && j>=0)
        {
           if(matrix[i][j]>x)
           {
              j--;
           }
           else
           {
              number_count+=(j+1);
              i++;
           }
        }
        return number_count;
    }
}
