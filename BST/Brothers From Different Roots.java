class Solution
{
    static int count;
    static HashSet<Integer> hm;
	public static int countPairs(Node root1, Node root2, int x)
	{
	    count=0;
	    hm=new HashSet<>();
	    fillvalues(root2);
	    dfs(root1,x);
	    return count;
		
	}
	
	public static void fillvalues(Node root)
	{
	    if(root==null)
	    {
	        return;
	    }
	    
	    hm.add(root.data);
	    
	    fillvalues(root.left);
	    fillvalues(root.right);
	}
	public static void dfs(Node root1, int x)
	{
	    if(root1==null)
		{
		    return;
		}
		
		if(hm.contains(x-root1.data))
		{
		    count++;
		}
	    
	    dfs(root1.left,x);
	    dfs(root1.right,x);
	}
}
