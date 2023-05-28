1. Approach 1: Using Binary Search
class Sol
{
     public static boolean binarysearch(int[] arr,int left,int right,int target)
    {
        if(left>right)
        {
            return false;
        }
        
        int mid=left+(right-left)/2;
        
        if(arr[mid]==target)
        {
            return true;
        }
        else if(arr[mid]>target)
        {
            return binarysearch(arr,left,mid-1,target);
        }
            return binarysearch(arr,mid+1,right,target);
    } 
    
    public static int matSearch(int matrix[][], int n, int m, int target)
    {
        for(int i=0;i<n;i++)
        {
            int left=matrix[i][0];
            int right=matrix[i][m-1];
            
            if(left<=target && target<=right)
            {
                if(binarysearch(matrix[i],0,m-1,target))
                {
                    return 1;
                }
            }
        }
        
        return 0;
        
    }
}


2. Optimised Approach:  TC-O(N+N)   SC-O(1)


class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int i=0,j=M-1;
        
        while(i<N && j>=0)
        {
            if(mat[i][j]==X)
            {
                return 1;
            }
            
            if(mat[i][j]<X)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        
        return 0;
    }
}
