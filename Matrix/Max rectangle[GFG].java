
class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] updated_matrix=new int[n][m];

        for(int i=0;i<n;i++)
        {
          for(int j=0;j<m;j++)
          {
             if(i==0)
             {
               if(matrix[i][j]=='1')
               {
                  updated_matrix[i][j]=1;
               }
               else
               {
                 updated_matrix[i][j]=0;
               }
             }
             else
             {
                if(matrix[i][j]=='1')
               {
                  updated_matrix[i][j]=1+updated_matrix[i-1][j];
               }
               else
               {
                 updated_matrix[i][j]=0;
               }
             }
          }
        }

        int max_rectangle=0;
        for(int i=0;i<n;i++)
        {
           int getmaxrectangle=largestRectangleArea(updated_matrix[i]);
           max_rectangle=Math.max(max_rectangle,getmaxrectangle);
        }
        return max_rectangle;
    }
    public int largestRectangleArea(int[] heights) {

      int[] left_smaller=new int[heights.length];
      int[] right_smaller=new int[heights.length];

      left_smaller=getleftsmaller(heights);
      right_smaller=getrightsmaller(heights);

      int max_area=0;

      for(int i=0;i<heights.length;i++)
      {
        max_area=Math.max(max_area,(right_smaller[i]-left_smaller[i]+1)*heights[i]);
      }

      return max_area;
        
    }

    int[] getleftsmaller(int[] heights)
    {
      int[] left_smaller=new int[heights.length];
      Stack<Integer> stk=new Stack<Integer>();
      for(int i=0;i<heights.length;i++)
      {
         if(i==0)
         {
           left_smaller[i]=i;
           stk.push(i);
           continue;
         }

         while(stk.size()>0 && heights[stk.peek()]>=heights[i])
         {
              stk.pop();
         }

         if(stk.size()==0)
         {
            left_smaller[i]=0;
            stk.push(i);
         }
         else
         {
           left_smaller[i]=stk.peek()+1;
           stk.push(i);
         }
      }
      return left_smaller;
    }

    int[] getrightsmaller(int[] heights)
    {
       int[] right_smaller=new int[heights.length];
      Stack<Integer> stk=new Stack<Integer>();
      for(int i=heights.length-1;i>=0;i--)
      {
         if(i==heights.length-1)
         {
           right_smaller[i]=i;
           stk.push(i);
           continue;
         }

         while(stk.size()>0 && heights[stk.peek()]>=heights[i])
         {
              stk.pop();
         }

         if(stk.size()==0)
         {
            right_smaller[i]=heights.length-1;
            stk.push(i);
         }
         else
         {
           right_smaller[i]=stk.peek()-1;
           stk.push(i);
         }
      }
      return right_smaller;
    }
}
