class Solution{
    
    public int maxsum;
    public int maxlen;
    public void helper(Node root,int currlen,int currsum)
    {
        if(root==null)
        {
            return;
        }
        
        currsum+=root.data;
        if(root.left==null && root.right==null)
        {
            if(currlen>=maxlen)
            {
                maxlen=currlen;
                maxsum=Math.max(maxsum,currsum);
            }
           return;
        }
        
        helper(root.left,currlen+1,currsum);
        
        helper(root.right,currlen+1,currsum);
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        maxsum=0;
        maxlen=0;
        helper(root,0,0);
        return maxsum;
    }
}
