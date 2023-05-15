1. Recusion Approach-> TC-O(N^N)  SC-O(N)  Recursion call stack.
  class Solution{
    static int minJumps(int[] arr){
       
    int result=RecursionminJumps(arr,0,arr.length-1);
    
    if(result==Integer.MAX_VALUE)
    {
        return -1;
    }
    
    return result;
    }
    static int RecursionminJumps(int[] arr,int l,int h){
		
		//If we reach last index
		if(l==h)
		{
			return 0;
		}
		
		//If current value is 0 then we can't move forward
		if(arr[l]==0)
		{
			return Integer.MAX_VALUE;
		}
		
		int min_jumps=Integer.MAX_VALUE;
		
		//Run loop from next index and explore all index, untill we call index<=last index
		for(int i=l+1;i<=h && i<=l+arr[l];i++)
		{
			//Get jumps from all indexes
			int getjump=RecursionminJumps(arr,i,h);
			
			// check for smallest in all then choose it 
			if(getjump!=Integer.MAX_VALUE && getjump+1<min_jumps)
			{
				min_jumps=getjump+1;
			}
		}
		return min_jumps;
        
    }
}


2. DP Approach- TC-O(N^2)  SC-O(N)

class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        int[] jumps=new int[arr.length];
        
        jumps[n-1]=0;
        
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]==0)
            {
                jumps[i]=Integer.MAX_VALUE;
            }
            else if(arr[i]>=n-i-1)
            {
                jumps[i]=1;
            }
            else
            {
                int min_jump=Integer.MAX_VALUE;
                
                for(int j=i+1;j<n && j<=arr[i]+i;j++)
                {
                    int get_jump=jumps[j];
                    
                    if(get_jump!=Integer.MAX_VALUE && get_jump<min_jump)
                    {
                        min_jump=get_jump;
                    }
                }
                
                if(min_jump!=Integer.MAX_VALUE)
                {
                    jumps[i]=min_jump+1;
                }
                else
                {
                    jumps[i]=Integer.MAX_VALUE;
                }
            }

        }
        
        if(jumps[0]==Integer.MAX_VALUE)
        {
            return -1;
        }
        
        return jumps[0];
    }
}


3. Greedy Approach- TC-O(N)  SC-O(1)
	
class Solution {
    public int jump(int[] nums) {
	    
      //If we have zero or only 1 element in array
      if(nums.length<=1 )
      {
        return 0;
      }
     if (arr[0] == 0)
            return -1;
      
     //If first element is greater than or equal to length hence we can jump from first element only
      if(nums[0]>=nums.length-1)
      {
        return 1;
      }
      int maxReach=nums[0];
      int steps=nums[0];
      int jumps=1;

      for(int i=1;i<nums.length;i++)
      {

        if(i==nums.length-1)
        {
          return jumps;
        }

        if(i+nums[i]>=nums.length-1)
        {
          return jumps+1;
        }

       if(maxReach<i+nums[i])
       {
         maxReach=i+nums[i];
       }

        steps--;

        if(steps==0)
        {
           jumps++;
		
	  if (i >= maxReach)
                    return -1;

           steps=maxReach-i;
        }

      }

      return -1;
        
    }

}
	
	
  
