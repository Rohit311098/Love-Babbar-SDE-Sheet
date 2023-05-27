Approach 1: Brute Force: Conside each rectangle and check max possible rectangle with that height. TC-O(N2)  SC-O(1)

class Solution {
    public int largestRectangleArea(int[] heights) {
      int max_area=0;
      for(int i=0;i<heights.length;i++)
      {
         int left=i;
         int right=i;
        while(left>0 && heights[left-1]>=heights[i])
        {
          left--;
        }
        while(right<heights.length-1 && heights[right+1]>=heights[i])
        {
          right++;
        }
        
        int curr_area=(right-left+1)*heights[i];
        max_area=Math.max(curr_area,max_area);
      }
      return max_area;
    }
}


Approach 2: Using left smaller and right smaller apporach of stack

class Solution {
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
