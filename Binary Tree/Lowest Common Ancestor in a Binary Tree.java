class Solution
{
    //Function to return the lowest common ancestor in a Binary Tree.
    
    boolean find(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        
        if(root.data==key)
        {
            return true;
        }
        
        return find(root.left,key) || find(root.right,key);
    }
	Node lca(Node root, int n1,int n2)
	{
		boolean first=find(root,n1);
		boolean second=find(root,n2);
		
		if(first==false && second==false)
		{
		    return new Node(-1);
		}
		
		return getlca(root,n1,n2);
	}
	
	Node getlca(Node root,int n1,int n2)
	{
	    if(root==null)
	    {
	        return null;
	    }
	    
	    if(root.data==n1 || root.data==n2)
	    {
	        return root;
	    }
	    
	    Node leftside=getlca(root.left,n1,n2);
	    Node rightside=getlca(root.right,n1,n2);
	    
	    if(leftside!=null && rightside!=null)
	    {
	        return root;
	    }
	    
	    return (leftside==null)? rightside:leftside;
	}
}
