1. Recusion Approach-> TC-O(N^N)  SC-O(N)  Recursion call stack.
  class Solution{
    static int minJumps(int[] arr){
       
       return RecursionminJumps(arr,0,arr.length-1);
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


2. DP Approach
  
