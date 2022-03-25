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
