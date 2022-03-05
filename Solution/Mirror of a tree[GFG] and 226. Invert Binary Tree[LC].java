1. Mirror Tree [GFG]-  Without return tye
class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node root) {
        // Your code here
         if(root==null)
        {
            return ;
        }
        Node temp=root.right;
        root.right=root.left;
        root.left=temp;
        mirror(root.left);
        mirror(root.right);
    }
}


2. Leetcode Solution Question 226  Invert Binary Tree - With Return type
class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null)
        {
            return null;
        }
        
        TreeNode rootkaleft=invertTree(root.left);
        TreeNode rootkaright=invertTree(root.right);
        TreeNode temp=rootkaright;
        root.right=rootkaleft;
        root.left=temp;
        
        return root;
    }
}
