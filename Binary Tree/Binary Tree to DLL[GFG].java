class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node prev;
    
    void convert(Node root)
    {
        if(root==null)
        {
            return;
        }
        
        convert(root.left);
        
        root.left=prev;
        prev.right=root;
        prev=root;
        convert(root.right);
    }
    Node bToDLL(Node root)
    {
        Node dummy=new Node(-1);
        prev=dummy;
        
        convert(root);
        
        Node head=dummy.right;
        dummy=null;
        head.left=null;
        return head;
    }
}
