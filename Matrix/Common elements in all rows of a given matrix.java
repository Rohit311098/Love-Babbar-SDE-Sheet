1. Brute Force Approah: Traverse first row and search each element in all row. TC-O(N*(N*M))  SC-O(1)
  
  2. Optimised Approach:   TC-O(N*M)  SC-O(N)

public static int[] commonelement(int[][] matrix,int n)
{
   HashMap<Integer,Integer> hm=new HashMap<>();
  
  ArrayList<Integer> result=new ArrayList<>();
  for(int i=0;i<n;i++)
  {
    hm.put(matrix[0][i],1);
  }
  
  for(int i=1;i<n;i++)
  {
     for(int j=0;j<n;j++)
     {
       if(hm.get(matrix[i][j])!=null && hm.get(matrix[i][j])==i)
          {
            hm.put(matrix[i][j],hm.get(matrix[i][j]+1));
            if(i==n-1)
            {
               result.add(matrix[i][j]);
            }
                   
          }
     }
  }
  return result; 
}
