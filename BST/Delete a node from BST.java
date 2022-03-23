class Tree {
    // Function to delete a node from BST.
     public static int getmax(Node root)
    {
        if(root.right==null)
        {
            return root.data;
        }
        
        return getmax(root.right);
    }
    public static Node deleteNode(Node root, int key) {
         if(root==null)
        {
            return null;
        }
        if(root.data>key)
        {
            root.left=deleteNode(root.left,key);
        }
        else if(root.data<key)
        {
            root.right=deleteNode(root.right,key); 
        }
        else
        {
            //If jo node delete karni hai vo leaf node hai
            if(root.left==null && root.right==null)
            {
                return null;
            }
            else if(root.left!=null && root.right==null)
            {
                //SSingle child node
                return root.left;
            }
            else if(root.left==null && root.right!=null)
            {
                //single child node
                return root.right;
            }
            else
            {
                // Both child exist
                int maxleft=getmax(root.left);
                root.data=maxleft;
                root.left=deleteNode(root.left,maxleft);
            }
            
        }
        
        return root;
       
    }
}
