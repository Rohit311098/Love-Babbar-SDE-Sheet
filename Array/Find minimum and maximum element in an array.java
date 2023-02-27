TC-O(N)   SC-O(1)
public static class Pair
	{
		 public int min,max;
		 public Pair(int min,int max)
		 {
			 this.min=min;
			 this.max=max;
		 }
	}

	private static Pair  method2(int[] a,int n)
	{
		Pair ans=new Pair(Integer.MAX_VALUE,Integer.MIN_VALUE);
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>ans.max)
			{
				ans.max=a[i];
			}
			if(a[i]<ans.min)
			{
				ans.min=a[i];
			}
		}
		
		return ans;
	}
