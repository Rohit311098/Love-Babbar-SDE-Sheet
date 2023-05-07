Approach 1: Count number of 0s,1s and 2's and at last just replace array with those numbers of 0s,1s,2s; 
    
TC-O(2N)  SC-0(1)


class Solution
{
    public static void sort012(int a[], int n)
    {
        int zero=0,ones=0,two=0;
        
        for(int i:a)
        {
            if(i==0)
            {
                zero++;
            }
            else if(i==1)
            {
                ones++;
            }
            else if(i==2)
            {
                two++;
            }
        }
        
        int k=0;
        while(zero>0)
        {
            a[k]=0;
            k++;
            zero--;
        }
        
        
        while(ones>0)
        {
            a[k]=1;
            k++;
            ones--;
        }
        
         while(two>0)
        {
            a[k]=2;
            k++;
            two--;
        }
    }
}
    
    
   

Approach 2:


class Solution
{
    public static void sort012(int a[], int n)
    {
        int i=0,j=0,k=a.length-1;
        
        while(i<=k)
        {
            if(a[i]==0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j++;
            }
            else if(a[i]==1)
            {
                i++;
            }
            else
            {
                int temp=a[i];
                a[i]=a[k];
                a[k]=temp;
                k--;
            }
        }
    }
}
