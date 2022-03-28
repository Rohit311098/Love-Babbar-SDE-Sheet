1. Brute Force-> We traverse Each row and take count which ever is max we take that row TC-O(R*C)  SC-O(1)
  
  Khud kar lena brute force
  
  
2. optimised Using Binary Search

class Solution {
    
    public int binarysearch(int[] arr,int n,int left,int right)
    {
       int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == 0){
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int ansrow=-1;
        int Noofones=0;
        int left=0,right=m-1;
        for(int i=0;i<n;i++)
        {
            int transpoint=binarysearch(arr[i],m,left,right);
            if(transpoint!=-1)
            {
                ansrow=i;
                Noofones=m-transpoint;
                right=transpoint-1;
            }
        }
        
        return ansrow;
    }
}
