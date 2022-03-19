1. Brute Force- O(N) Approach- Linear Search
class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> result=new ArrayList<>();
        Long first=-1L, last=-1L;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x && first==-1)
            {
                first=Long.valueOf(i);
                last=Long.valueOf(i);
            }
            
            if(arr[i]==x && first!=-1)
            {
                last=Long.valueOf(i);
            }
        }
        
        result.add(first);
        result.add(last);
        return result; 

    }
}

2. Binary Search Approach- O(logn) Approach

GFG Solution
class GFG
{
    Long getfirst(long[] arr,int left,int right,int x)
    {
        Long ans=-1L;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            
            if(arr[mid]==x)
            {
                ans=Long.valueOf(mid);
                right=mid-1;
            }
            else if(arr[mid]<x)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
            
        }
        
        return ans;
        
    }
    
    Long getlast(long[] arr,int left,int right,int x)
    {
        Long ans=-1L;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            
            if(arr[mid]==x)
            {
                ans=Long.valueOf(mid);
                left=mid+1;
            }
            else if(arr[mid]<x)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
            
        }
        
        return ans;
        
    }
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> result=new ArrayList<>();
        result.add(getfirst(arr,0,n-1,x));
        result.add(getlast(arr,0,n-1,x));
        return result;
    }
}


Leetcode Solution
class Solution {
    public int getfirstocc(int[] nums,int target)
    {
        int left=0,right=nums.length-1;
        int ans=-1;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            
            if(nums[mid]==target)
            {
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        
        return ans;
        
    }
    
    public int getlastocc(int[] nums,int target)
    {
        int left=0,right=nums.length-1;
        int ans=-1;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            
            if(nums[mid]==target)
            {
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        
        return ans;
        
    }
    public int[] searchRange(int[] nums, int target) {
        
            int[] a=new int[]{-1,-1};
            if(nums.length==0)
            {   
                return a;
            }
        
          a[0]=getfirstocc(nums,target);
         a[1]=getlastocc(nums,target);
        return a;
    }
}
