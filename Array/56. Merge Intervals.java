1. Using Extra Space:   TC-O(nlogn)+O(n)  SC-O(N)

  class Solution {
  class Pair implements Comparable<Pair>
  {
     int start;
	     int end;

	     Pair(int start,int end)
	     {
	       this.start=start;
	       this.end=end;
	     }
	     
		public int compareTo(Pair o) {
			
	 
	        //  For Ascending order
	        return this.start - o.start;
		}
  }
    public int[][] merge(int[][] intervals) 
    {
      	
	      ArrayList<Pair> inter=new ArrayList<Pair>();
	       for(int i=0;i<intervals.length;i++)
	       {
	          Pair p=new Pair(intervals[i][0],intervals[i][1]);
	          inter.add(p);
	       }
	       
	       Collections.sort(inter);
	       
	       for(int i=0;i<inter.size();i++)
	       {
	    	   System.out.println(inter.get(i).start+" "+inter.get(i).end);
	       }
	       
	       Stack<Pair> stk=new Stack<>();
	       
	       stk.add(inter.get(0));
	       
	       for(int i=1;i<inter.size();i++)
	       {
	    	   Pair top=stk.peek();
	    	   
	    	   if(top.end>=inter.get(i).start)
	    	   {
	    		   Pair gettop=stk.pop();
	    		   stk.push(new Pair(gettop.start,max(gettop.end,inter.get(i).end)));
	    	   }
	    	   else
	    	   {
	    		   stk.push(new Pair(inter.get(i).start,inter.get(i).end));
	    	   }
	       }
	       
	       
	       int[][] result=new int[stk.size()][2];
	       int i=stk.size()-1;
	       
	       while(!stk.isEmpty())
	       {
	    	   Pair top=stk.pop();
	    	   result[i][0]=top.start;
		       result[i][1]=top.end;
		       i--;
	       }
	       
	       return result;
        
    }

    int max(int a,int b)
    {
      if(a>b)
      {
        return a;
      }
      return b;
    }
}


2. Using Inplace method- TC-O(NLOGN)+O(N)
  
