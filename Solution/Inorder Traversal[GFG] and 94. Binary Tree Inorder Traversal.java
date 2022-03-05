1. Inorder Traversal[GFG] -> Recursive Approach

class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        
        if(root==null)
        {
            return new ArrayList<>();
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        ArrayList<Integer> left=inOrder(root.left);
        ArrayList<Integer> right=inOrder(root.right);
        
        for(Integer i:left)
        {
            result.add(i);
        }
        
        result.add(root.data);
        
        for(Integer i:right)
        {
            result.add(i);
        }
        
        return result;
    }
}


2. Iterative Approach
