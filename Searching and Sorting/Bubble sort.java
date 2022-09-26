1. TC- O(N2)  SC-O(1)
  class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int a[], int n)
    {
        //code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}

2. Optimised approach
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int a[], int n)
    {
        //code here
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    flag=true;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            
            if(flag==false)
            {
                return;
            }
        }
    }
}
