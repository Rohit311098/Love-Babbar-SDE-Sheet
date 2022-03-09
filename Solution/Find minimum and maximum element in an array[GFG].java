class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        long max=Long.MIN_VALUE,min=Long.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            
            
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        
        pair result=new pair(min,max);
        
        return result;
    }
}
