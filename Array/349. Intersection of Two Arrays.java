Approach 1: Using ArrayList Approach
class Solution {
    public int[] intersection(int[] a1, int[] a2) {
        ArrayList<Integer> arr=new ArrayList<>();
	        ArrayList<Integer> result=new ArrayList<>();
	        for(int i=0;i<a1.length;i++)
	        {
	            int flag=0;
	            for(int j=0;j<arr.size();j++)
	            {
	                if(arr.get(j)==a1[i])
	                {
	                    flag=1;
	                    break;
	                }
	            }
	            if(flag==0)
	            {
	                arr.add(a1[i]);
	            }
	        }
	        
	        for(int i=0;i<a2.length;i++)
	        {
	            int flag=0;
	            for(int j=0;j<arr.size();j++)
	            {
	                if(arr.get(j)==a2[i])
	                {
	                   result.add(a2[i]);
	                   arr.remove(arr.get(j));
	                }
	            }
	        }
	        int[] res = new int[result.size()];
	        for(int i=0;i<res.length;i++)
	        {
	        	res[i]=result.get(i);
	        	
	        }
		 return res;
    }
}



Approach 2: HashSet Approach

class Solution {
    public int[] intersection(int[] a, int[] b) {
      HashSet<Integer> h=new HashSet<>();
		 ArrayList<Integer> result=new ArrayList<>();
	       for(int i=0;i<a.length;i++)
	       {
	           h.add(a[i]);
	       }
	       for(int i=0;i<b.length;i++)
	       {
	           if(h.contains(b[i]))
	           {
	        	 result.add(b[i]); 
	        	 h.remove(b[i]);
	           }
	       }
	        
	       int[] res = new int[result.size()];
	        for(int i=0;i<res.length;i++)
	        {
	        	res[i]=result.get(i);
	        	
	        }      
		 return res;
        
    }
}
