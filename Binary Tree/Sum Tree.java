class Solution
{
    boolean result;
    
    public int dfs(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        if(root.left==null && root.right==null)
        {
            return root.data;
        }
        
        int leftsum=dfs(root.left);
        
        int rightsum=dfs(root.right);
        
        if(root.data!=leftsum+rightsum )
        {
            result=false;
        }
        
        return root.data+leftsum+rightsum;
    }
	boolean isSumTree(Node root)
	{
	    
        result=true;
        dfs(root);
        return result;
	}
}
