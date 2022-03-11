1. Using Global Variable Strategy  TC-O(N)  SC-O(1)
  
class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    
    boolean result;
    
    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int left=height(root.left);
        int right=height(root.right);
        
        if(Math.abs(left-right)>1)
        {
            result=false;
        }
        
        return Math.max(left,right)+1;
    }
    boolean isBalanced(Node root)
    {
        result=true;
        
        height(root);
        return result;
    }
}


2. Without using global variable , we are using Pair class TC-O(N)  SC-O(1)
  
  class Solution {
    public static class Pair
    {
        boolean isbalanced;
        int height;
        Pair()
        {
            isbalanced=true;
            height=0;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        Pair ans=helper(root);
        
        return ans.isbalanced;
    }
    
    public Pair helper(TreeNode root)
    {
        if(root==null)
        {
            Pair ans=new Pair();
            return ans;
        }
        
        //Left subtree ko check karo phele
        Pair leftsubtree=helper(root.left);
        //Left side wala phele se hi unbalanced hua toh aage right mai jaane ki jarurat nhi hai directly false karte hue return kar de
        if(leftsubtree.isbalanced==false)
        {
            Pair ans=new Pair();
            ans.isbalanced=false;
            return ans;
        }
        
        Pair rightsubtree=helper(root.right);
        //Right side wala ager unbalanced hua toh aage current check karne ki jarurat nhi hai directly false karte hue return kar de
         if(rightsubtree.isbalanced==false)
        {
            Pair ans=new Pair();
             ans.isbalanced=false;
            return ans;
        }
        
        //Ager left subtree and right subtree balanced hue toh current node k liye check karo
        
        Pair current=new Pair();
        current.height=1+Math.max(leftsubtree.height,rightsubtree.height);
        int height=Math.abs(leftsubtree.height-rightsubtree.height);
        if(height>1)
        {
            current.isbalanced=false;
        }
        return current;
    }
}
