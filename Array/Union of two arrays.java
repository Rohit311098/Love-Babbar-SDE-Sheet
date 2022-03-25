1. Using HashSet Extra Space
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        
        Arrays.sort(a);
        Arrays.sort(b);
        
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
