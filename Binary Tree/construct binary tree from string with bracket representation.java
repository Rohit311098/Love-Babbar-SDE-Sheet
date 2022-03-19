1. GFG Solution
static Node constructTree(String s)
    {
       
        // First character is the root of the tree
        Node root = new Node(s.charAt(0) - '0');
       
        // Stack used to store the
        // previous root elements
        Stack<Node> stk = new Stack<Node>();
       
        // Iterate over remaining characters
        for (int i = 1; i < s.length(); i++) {
       
            // If current character is '('
            if (s.charAt(i) == '(') {
       
                // Push root into stack
                stk.push(root);
            }
       
            // If current character is ')'
            else if (s.charAt(i) == ')') {
       
                // Make root the top most
                // element in the stack
                root = stk.peek();
       
                // Remove the top node
                stk.pop();
            }
       
            // If current character is a number
            else {
       
                // If left is null, then put the new
                // node to the left and move to the
                // left of the root
                if (root.left == null) {
       
                    Node left = new Node(s.charAt(i) - '0');
                    root.left = left;
                    root = root.left;
                }
       
                // Otherwise, if right is null, then
                // put the new node to the right and
                // move to the right of the root
                else if (root.right == null) {
       
                    Node right = new Node(s.charAt(i) - '0');
                    root.right = right;
                    root = root.right;
                }
            }
        }
       
        // Return the root
        return root;
    }









2. Leetcode solution- In leetcode question we have given a tree we have to return string for that tree

class Solution {
    public String tree2str(TreeNode root) {
        
        if(root==null)
        {
            return "";
        }
        
        
        String ans=""+root.val;
        if(root.left==null && root.right==null)
        {
            return ans;
        }
        
      
        ans+="("+tree2str(root.left)+")";
       
        if(root.right!=null)
            ans+="("+tree2str(root.right)+")";
        
        return ans;
        
    }
}
