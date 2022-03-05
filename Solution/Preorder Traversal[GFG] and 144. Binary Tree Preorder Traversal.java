1. Recursive Method
class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        if(root==null)
        {
            return new ArrayList<>();
        }
        
         ArrayList<Integer> result=new ArrayList<>();
         
        ArrayList<Integer> left=preorder(root.left);
        ArrayList<Integer> right=preorder(root.right);
        
        result.add(root.data);
        for(Integer i:left)
        {
            result.add(i);
        }
        
        for(Integer i:right)
        {
            result.add(i);
        }
        
        return result;
    }

}

2. Iterative Method
class Solution {
    
    public class Pair
    {
        TreeNode node;
        char state;
        
        Pair(TreeNode node)
        {
            this.node=node;
            this.state='i';
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root==null)
        {
            return new ArrayList<>();
        }
        List<Integer> result=new ArrayList<>();
        
        Stack<Pair> stk=new Stack<>();
        stk.push(new Pair(root));
        
        while(stk.size()>0)
        {
            if(stk.peek().state=='i')
            {
                result.add(stk.peek().node.val);
                stk.peek().state='l';
            }
            else if(stk.peek().state=='l')
            {
                stk.peek().state='r';
                if(stk.peek().node.left!=null)
                {
                    stk.push(new Pair(stk.peek().node.left));
                }
            }
            else
            {
                Pair top=stk.pop();
                if(top.node.right!=null)
                {
                    stk.push(new Pair(top.node.right));
                }
            }
        }
        return result;
    }
}


3. Morris Traversal
