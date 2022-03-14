class Solution{
    
    public int sum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int currsum=root.data;
        int left=sum(root.left);
        int right=sum(root.right);
        
        root.data=left+right;
        
        return currsum+right+left;
    }
    public void toSumTree(Node root){
         //add code here.
         
         sum(root);
    }
}
