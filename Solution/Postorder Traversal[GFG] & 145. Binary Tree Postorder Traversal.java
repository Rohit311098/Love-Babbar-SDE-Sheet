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
class Solution {
    
    public class Pair
    {
        TreeNode node;
        char state;
        
        Pair(TreeNode node)
        {
            this.node=node;
            this.state='l';
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root==null)
        {
            return new ArrayList<>();
        }
        
        List<Integer> result=new ArrayList<>();
        Stack<Pair> stk=new Stack<>();
        stk.push(new Pair(root));
        
        while(stk.size()>0)
        {
            Pair top=stk.peek();
            if(top.state=='l')
            {
                if(top.node.left!=null)
                {
                    top.state='r';
                    stk.push(new Pair(top.node.left));
                }
                else
                {
                    top.state='r';
                }
            }
            else if(stk.peek().state=='r')
            {
                if(top.node.right!=null)
                {
                    top.state='p';
                    stk.push(new Pair(top.node.right));
                }
                else
                {
                    top.state='p';
                }
            }
            else
            {
                result.add(top.node.val);
                stk.pop();
            }
        }
        return result;
    }
}

