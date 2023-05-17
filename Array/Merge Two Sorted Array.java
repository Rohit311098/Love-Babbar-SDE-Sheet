Approach 1: Swap between two array and sort 2nd array
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        long[] arr3=new long[n+m];
        
        int i=0,j=0,k=0;
        
        while(i<n && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                arr3[k++]=arr2[j++];
            }
            else
            {
                arr3[k++]=arr1[i++];
            }
        }
        
        while(i<n)
        {
          arr3[k++]=arr1[i++];  
        }
        
        while(j<m)
        {
          arr3[k++]=arr2[j++];  
        }
        
        i=0;
        
        while(i<n+m)
        {
            if(i<n)
            {
                arr1[i]=arr3[i];
            }
            else
            {
                arr2[i-n]=arr3[i];
            }
            i++;
        }
    }
}


Optimised Approach 1 Striver Approachh:

TC-O(min(n,m))+O(NlogN)+O(MlogM)
SC-O(1)
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // Start Comparing last element of first array and first element of second array
       int i=n-1,j=0;
       
       while(i>=0 && j<m)
       {
           
           if(arr1[i]>arr2[j])
           {
               long temp=arr1[i];
               arr1[i]=arr2[j];
               arr2[j]=temp;
           }
           i--;
           j++;
       }
       
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       
    }
}


Optimal Approach 2:

TC-O(log2(N+M)*O(N+M))
sc-o(1)
  
class Solution
{
    
    public static void swapelement(long arr1[], long arr2[], int ind1, int ind2)
    {
        if(arr1[ind1]>arr2[ind2])
        {
            long t=arr1[ind1];
            arr1[ind1]=arr2[ind2];
            arr2[ind2]=t;
        }
    }
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int length=n+m;
        
        int gap=(length/2) + (length%2);
       
       while(gap>0)
       {
           int left=0;
           int right=left+gap;
           
           while(right<length)
           {
               //left is on first array and right is on second array
               if(left<n && right>=n)
               {
                   swapelement(arr1,arr2,left,right-n);
               }
               //both left and right are on second array side
               else if(left>=n)
               {
                   swapelement(arr2,arr2,left-n,right-n);
               }
               //both left and right are on first array side
               else
               {
                  swapelement(arr1,arr1,left,right);   
               }
              left++;
              right++;
           }
           
            if(gap==1) 
                 break;
                 
            gap=(gap/2) + (gap%2);
           
       }
    }
}

