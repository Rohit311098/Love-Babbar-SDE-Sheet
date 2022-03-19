1. GFG Solution
class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        if(root==null)
        {
            return new Node(Key);
        }
        
        if(root.data==Key)
        {
            return root;
        }
        if(root.data>Key)
        {
            root.left=insert(root.left,Key);
        }
        else
        {
            
            root.right=insert(root.right,Key);
        }
        
        return root;
    }
}


2. Leetcode 701
  
 class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        {
            return new TreeNode(val);
        }
        
        if(root.val>val)
        {
            root.left=insertIntoBST(root.left,val);
        }
        else
        {
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }
}
