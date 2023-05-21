1. Approach 1 -> Using Recursion they will not ask you to code

2. Approach 2-> Using swapping . TC-O(2N)   SC-O(1)
  class Solution{
    static List<Integer> nextPermutation(int n, int arr[]){
        int prev_small_idx=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                prev_small_idx=i;
                break;
            }
        }
        
        //If given permutation is last permutation
        if(prev_small_idx==-1)
        {
           reverse(arr,prev_small_idx+1,n); 
           List<Integer> result=new ArrayList<>();
           
           for(int i=0;i<n;i++)
           {
           	result.add(arr[i]);
           }
           
           return result;
        }
        int next_big_index=prev_small_idx+1;
        for(int i=prev_small_idx+2;i<n;i++)
        {
        	if(arr[prev_small_idx]<arr[i] && arr[next_big_index]>=arr[i])
        	{
        		next_big_index=i;
        	}
        }
        swap(arr,prev_small_idx,next_big_index);
        reverse(arr,prev_small_idx+1,n);
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
        	result.add(arr[i]);
        }
        
        return result;
    }
    private static void reverse(int[] arr, int idx, int n) {
	
	for(int i=idx,j=n-1;i<j;i++,j--)
	{
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
}
private static void swap(int[] arr, int prev_small_idx, int next_big_index) {
	
	int temp=arr[prev_small_idx];
	arr[prev_small_idx]=arr[next_big_index];
	arr[next_big_index]=temp;
}
}
