TC-O(N)   SC-O(1)
class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        pair p=new pair(Long.MAX_VALUE,Long.MIN_VALUE);
        
        for(int i=0;i<n;i++)
        {
            if(p.first>a[i])
            {
                p.first=a[i];
            }
            
            if(p.second<a[i])
            {
                p.second=a[i];
            }
        }
        
        return p;
    }
}
