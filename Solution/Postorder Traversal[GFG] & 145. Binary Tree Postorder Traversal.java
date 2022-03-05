1. Recursive Approach
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
        {
            List<Integer> a=new ArrayList<Integer>();
            return a;
        }
        
        //result for our answer
        List<Integer> result=new ArrayList<Integer>();
        
        //Left child traversal
        List<Integer> leftlist=postorderTraversal(root.left);
        
        for(Integer i:leftlist)
        {
            result.add(i);
        }
        
        //Right child traversal
        List<Integer> rightlist=postorderTraversal(root.right);
        
        for(Integer i:rightlist)
        {
            result.add(i);
        }
        
        //Adding our current node
        result.add(root.val);
        
        return result;
        
    }
}

2. Iterative Method
