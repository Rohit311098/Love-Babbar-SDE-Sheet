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

class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    public class Pair
    {
        Node node;
        char state;
        
        Pair(Node node)
        {
            this.node=node;
            this.state='l';
        }
    }
    ArrayList<Integer> inOrder(Node root) {
        
        if(root==null)
        {
            return new ArrayList<>();
        }
        
        ArrayList<Integer> result=new ArrayList<>();
         Stack<Pair> stk=new Stack<>();
        stk.push(new Pair(root));
        
        while(stk.size()!=0)
        {
            if(stk.peek().state=='l')
            {
                if(stk.peek().node.left!=null)
                {
                    Pair p=stk.pop();
                    p.state='i';
                    stk.push(p);
                    stk.push(new Pair(p.node.left));
                }
                else
                {
                    Pair p=stk.pop();
                    p.state='i';
                    stk.push(p);
                }
                
            }
            else if(stk.peek().state=='i')
            {
                result.add(stk.peek().node.data);
                stk.peek().state='r';
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























