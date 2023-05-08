1. Two pointer Algorithm
  TC-O(N)  SC-O(1)

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
       
        int i=0,k=n-1;
        
        while(i<=k)
        {
            if(arr[i]<0)
            {
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k--;
            }
            else
            {
                i++;
            }
        }
        
    }
}
