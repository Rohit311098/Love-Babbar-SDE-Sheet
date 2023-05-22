1. Using Three Loops TC-O(N3)  SC-O(1)
 
2. Using Binary search TC-
  

3. Using Hashing Approach-> TC-O(min(n1,n2,n3))+O(2*(n1,n2,n3))   SC-O(2n)

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> result=new ArrayList<>();
        
        int minele=Math.min(n1,Math.min(n2,n3));
        
        
        if(minele==n1)
        {
           HashSet<Integer> s2 = new HashSet<>();
            HashSet<Integer> s3 = new HashSet<>();
            
            for(int i=0;i<n2;i++)
            {
                if(s2.contains(B[i])==false)
                {
                    s2.add(B[i]);
                }
            }
            
            
            for(int i=0;i<n3;i++)
            {
                if(s3.contains(C[i])==false)
                {
                    s3.add(C[i]);
                }
            }
            
            for(int i=0;i<n1;i++)
            {
                if(s2.contains(A[i]) && s3.contains(A[i]))
                {
                    result.add(A[i]);
                    s2.remove(A[i]);
                    s3.remove(A[i]);
                }
            }
            
            return result;
        }
        else if(minele==n2)
        {
            HashSet<Integer> s1 = new HashSet<>();
            HashSet<Integer> s3 = new HashSet<>();
            
            for(int i=0;i<n1;i++)
            {
                if(s1.contains(A[i])==false)
                {
                     s1.add(A[i]);
                }
            }
            
            
            for(int i=0;i<n3;i++)
            {
                if(s3.contains(C[i])==false)
                {
                    s3.add(C[i]);
                }
            }
            
            for(int i=0;i<n2;i++)
            {
                if(s1.contains(B[i]) && s3.contains(B[i]))
                {
                    result.add(B[i]);
                    s1.remove(B[i]);
                    s3.remove(B[i]);
                }
            }
            return result;
        }
        
        
            HashSet<Integer> s1 = new HashSet<>();
            HashSet<Integer> s2 = new HashSet<>();
            
            for(int i=0;i<n1;i++)
            {
                if( s1.contains(A[i])==false)
                {
                     s1.add(A[i]);
                }
            }
            
            for(int i=0;i<n2;i++)
            {
                if(s2.contains(B[i])==false)
                {
                    s2.add(B[i]);
                }
            }
            
            for(int i=0;i<n3;i++)
            {
                if(s1.contains(C[i]) && s2.contains(C[i]))
                {
                    result.add(C[i]);
                     s1.remove(C[i]);
                    s2.remove(C[i]);
                }
            }
            return result;
    }
}
