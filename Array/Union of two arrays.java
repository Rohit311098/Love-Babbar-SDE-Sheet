1. Using ArrayList and checking elements in arraylist if they are present or not. If not present add them else leave them.
    TC-O(n*n+m*m)    SC-O(n+m)                                              
    
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
         int total=0;        
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<arr.size();j++)
            {
                if(arr.get(j)==a[i])
                {
                    flag=1;
                    break;
                }
            }
            
            if(flag==0)
            {
                arr.add(a[i]);
            }
        }
        
        for(int i=0;i<m;i++)
        {
            int flag=0;
            for(int j=0;j<arr.size();j++)
            {
                if(arr.get(j)==b[i])
                {
                    flag=1;
                    break;
                }
            }
            
            if(flag==0)
            {
                arr.add(b[i]);
            }
        }
        return arr.size();
    }
    
}




1. Using HashSet Extra Space   TC-O(N+M)   SC-O(N+M)
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
       HashSet<Integer> h=new HashSet<>();
       for(int i=0;i<n;i++)
       {
           h.add(a[i]);
       }
       for(int i=0;i<m;i++)
       {
           if(h.contains(b[i])) continue;
           h.add(b[i]);
       }
       
       return h.size();
    }
}
