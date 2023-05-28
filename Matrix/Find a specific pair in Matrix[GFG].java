1. Brute Force-> TC-O(N4)  SC-O(1)
  
2. Optmised Approach 1 -> TC-O(N2)  SC-O(N2)
  
  
3. Optimised Approach 2-> TC-O(N2)   SC-O(2N)
  
  import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findMaxValue(int mat[][], int n) {
        
        int[] temp1=new int[n];
        int[] temp2=new int[n];

        //Filling temp1 for Last Row
        temp1[n-1]=mat[n-1][n-1];
        for(int i=n-2;i>=0;i--)
        {
            temp1[i]=Math.max(mat[n-1][i], temp1[i+1]);
        }

        int max_Value=Integer.MIN_VALUE;

        for(int i=n-2;i>=0;i--)
        {
            temp2[n-1]=Math.max(mat[i][n-1],temp1[n-1]);

            for(int j=n-2;j>=0;j--)
            {
                max_Value=Math.max(max_Value,temp1[j+1]-mat[i][j]);

                temp2[j]=Math.max(mat[i][j],Math.max(temp1[j],temp2[j+1]));
            }

            temp1=temp2;
        }
        return max_Value;

    }
}
