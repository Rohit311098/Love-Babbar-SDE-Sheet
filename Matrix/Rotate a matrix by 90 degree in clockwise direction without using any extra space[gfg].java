1. Brute Force Using Extra Space: TC-O(N2)  SC-O(N2)

class Solution {
    public void rotate(int[][] matrix) {

      int[][] modified_mat=new int[matrix.length][matrix.length];
      for(int i=0;i<matrix.length;i++)
      {
          for(int j=0;j<matrix.length;j++)
          {
              modified_mat[j][matrix.length-1-i]=matrix[i][j];
          }
      }

      for(int i=0;i<matrix.length;i++)
      {
          for(int j=0;j<matrix.length;j++)
          {
              matrix[i][j]=modified_mat[i][j];
          }
      }
        
    }
}


2. Optimised Approach : Using Constant Space TC-O(N2)  SC-O(1)
  
  class Solution {
    public void rotate(int[][] matrix) {
      
      int n=matrix.length;
      for(int i=0;i<n;i++)
      {
        for(int j=i;j<n;j++)
        {
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
      }

       for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }

      for(int i=0;i<n/2;i++)
      {
        for(int j=0;j<n;j++)
        {
           int temp=matrix[j][i];
           matrix[j][i]=matrix[j][n-i-1];
           matrix[j][n-i-1]=temp;
        }
      }
    }
}
