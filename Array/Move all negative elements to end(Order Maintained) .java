1. Using Extra Space- TC-O(N)  SC-O(N)
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
        
        for(int i=0;i<positive.size();i++)
        {
            arr[i]=positive.get(i);
        }
        
        int k=positive.size();
        
        for(int i=0;i<negative.size();i++,k++)
        {
            arr[k]=negative.get(i);
        }
        
    }
}


2. Without Using Extra Space
(If order is not maintained then Use Two pointer, Dutch National)
