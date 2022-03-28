1. Brute Force- Using Sorting->  TC-O(R*C LOG(R*C))   SC-O(R*C)
  
class Solution {
    int median(int matrix[][], int r, int c) {
       int[] arr=new int[r*c];
       
       int k=0;
       for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
           {
               arr[k++]=matrix[i][j];
           }
       }
       Arrays.sort(arr);
       return arr[r*c/2];
    }
}

2. optimised Approach-> TC-(32*R LOG(C))  SC-O(1)

class Solution {

    int median(int matrix[][], int r, int c) {
        
        int low=0;
        int high=2000;
        
        int n=r*c;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            int ans=0;
            
            for(int i=0;i<r;i++)
            {
                int l=0,h=c-1;
                
                while(l<=h)
                {
                    int m=(l+h)/2;
                    if(matrix[i][m]<=mid)
                    {
                        l=m+1;
                    }
                    else
                    {
                        h=m-1;
                    }
                }
                ans+=l;
            }
            
            if(ans>n/2)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            
        }
        
        return low;
    }
}
