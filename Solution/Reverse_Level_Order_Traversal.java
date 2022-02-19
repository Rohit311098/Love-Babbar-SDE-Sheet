/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
        // code here
        if(root==null)
        {
            ArrayList<Integer> ans=new ArrayList<Integer>();
            return ans;
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        Queue<Node> queue=new LinkedList<Node>();
        Stack<Node> stk=new Stack<Node>();
        queue.add(root);
        
        while(queue.size()>0)
        {
            Node top=queue.remove();
             stk.push(top);
            if(top.right!=null)
            {
                queue.add(top.right);
            }
            
            if(top.left!=null)
            {
                queue.add(top.left);
            }
        }
        
        while(stk.size()>0)
        {
            ans.add(stk.pop().data);
        }
        
        return ans;
    }
}   
