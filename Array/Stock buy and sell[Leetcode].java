We can buy and sell stock only once
1. Brutee Force: for each day check buy and sell in next day and find max
TC-O(N2)  SC-O(1)
  
2. Approach 2: Maintaing min in left side TC-O(N) and SC-O(1)
 class Solution {
    public int maxProfit(int[] prices) {

      int min=prices[0];
      int max_profit=0;

      for(int i=1;i<prices.length;i++)
      {
        int profit=0;
         if(prices[i]>min)
         {
             profit=prices[i]-min;
         }
         else
         {
           min=prices[i];
         }
         max_profit=max(max_profit,profit);

      }


      return max_profit;
        
    }
    int max(int a,int b)
    {
      return (a>b) ? a:b;
    }
}
