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
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        if(root==null)
        {
            ArrayList<Integer> ans=new ArrayList<Integer>();
            return ans;
        }
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Queue<Node> q=new ArrayDeque<Node>();
        
        q.add(root);
        
        while(q.size()>0)
        {
            Node top=q.remove();
            ans.add(top.data);
            
            if(top.left!=null)
            {
                q.add(top.left);
            }
            
            if(top.right!=null)
            {
                q.add(top.right);
            }
        }
        return ans;
    }
}
