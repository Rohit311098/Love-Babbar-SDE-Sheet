class Solution
{
    int level=-1;
    boolean result=true;
    void levelcheck(Node root,int currlevel)
    {
        if(root==null)
        {
            return;
        }
        
        if(root.left==null && root.right==null)
        {
            
            if(level==-1)
            {
                level=currlevel;
            }
            else if(currlevel!=level)
            {
                result=false;
            }
            
            return;
        }
        
        levelcheck(root.left,currlevel+1);
        
        levelcheck(root.right,currlevel+1);
    }
    boolean check(Node root)
    {
        result=true;
        levelcheck(root,0);
        return result;
    }
}
