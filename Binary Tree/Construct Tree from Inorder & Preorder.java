class Solution
{
    static HashMap<Integer,Integer> hm;
    
    public static Node helper(int preorder[],int preidx,int inol,int inor)
    {
        if(inol>inor)
        {
            return null;
        }
        
        Node root=new Node(preorder[preidx]);
        
        int getidx=hm.get(preorder[preidx]);
        
        int noofele=getidx-inol;
        
        root.left=helper(preorder,preidx+1,inol,getidx-1);
        root.right=helper(preorder,preidx+noofele+1,getidx+1,inor);
        
        return root;
    }
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        hm=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            hm.put(inorder[i],i);
        }
        return helper(preorder,0,0,n-1);
    }
}
