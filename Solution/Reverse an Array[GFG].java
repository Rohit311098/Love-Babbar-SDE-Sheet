   TC-O(N)   SC-O(1)
	   int t=sc.nextInt();
	   while(t-->0)
	   {
	       int n=sc.nextInt();
	       
	       int[] a=new int[n];
	       
	       for(int i=n-1;i>=0;i--)
	       {
	           a[i]=sc.nextInt();
	       }
	       
	       
	       for(int i=0;i<n;i++)
	       {
	           System.out.print(a[i]+" ");
	       }
	       
	       System.out.println();
	   }
