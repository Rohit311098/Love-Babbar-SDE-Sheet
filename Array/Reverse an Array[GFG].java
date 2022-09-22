TC-O(N)   SC-O(1)
	
Scanner sc=new Scanner(System.in);
	   
	   int t=sc.nextInt();
	   
	   while(t-->0)
	   {
	       int n=sc.nextInt();
	       
	       int[] a=new int[n];
	       
	       for(int i=0;i<n;i++)
	       {
	           a[i]=sc.nextInt();
	       }
	       
	       for(int i=0,j=n-1;i<j;i++,j--)
	       {
	           int temp=a[i];
	           a[i]=a[j];
	           a[j]=temp;
	       }
	       
	       for(int i=0;i<n;i++)
	       {
	           System.out.print(a[i]+" ");
	       }
	       
	       System.out.println();
	   }
	   

