1. Using Extra Space- TC-O(2N) (Two traversal done)  SC-O(2N) (Two Array Created)

  class Solution {
    
    public void segregateElements(int arr[], int n)
    {
       ArrayList<Integer> positive=new ArrayList<>();
	        ArrayList<Integer> negative=new ArrayList<>();
	        
	        for(int i=0;i<n;i++)
	        {
	            if(arr[i]>0)
	            {
	                positive.add(arr[i]);
	            }
	            else
	            {
	                negative.add(arr[i]);
	            }
	        }
	        
	        int k=0;
	        
	        for(int i=0;i<positive.size();i++)
	        {
	        	arr[k]=positive.get(i);
	        	k++;
	        }
	        
	        for(int i=0;i<negative.size();i++)
	        {
	        	arr[k]=negative.get(i);
	        	k++;
	        }
        
        
    }
}


2. Without Using Extra Space
(If order is not maintained then Use Two pointer, Dutch National)
