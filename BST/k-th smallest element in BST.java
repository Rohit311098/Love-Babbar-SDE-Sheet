class Solution {
    // Return the Kth smallest element in the given BST
    int globalk;
    public int KthSmallestElement(Node root, int k) {
         globalk=k;
        return inorder(root);
    }
    public int inorder(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        
        int leftans=inorder(root.left);
        if(leftans!=-1)
        {
            return leftans;
        }
        globalk--;
        if(globalk==0)
        {
            return root.data;
        }
        
        return inorder(root.right);
    }
}
