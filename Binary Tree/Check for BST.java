public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    Node prev=null;
    boolean isBST(Node root)
    {
        if(root==null)
        {
            return true;
        }
        
        boolean leftans=isBST(root.left);
        
        if(prev!=null && prev.data>root.data)
        {
            return false;
        }
        
        prev=root;
        
        boolean rightans=isBST(root.right);
        
        return leftans && rightans;
       
    }
}
