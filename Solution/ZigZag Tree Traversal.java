1. USine Two stack Approach  TC-O(N)   SC-O(N)
  
  class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    if(root==null)
        {
            return new ArrayList<>();
        }
        
        int level=0;
        ArrayList<Integer> result=new ArrayList<>();
        
        Stack<Node> even=new Stack<>();
        Stack<Node> odd=new Stack<>();
        
        even.push(root);
        
        while(even.size()>0 || odd.size()>0)
        {
           if(level%2==0)
           {
               while(even.size()>0)
               {
                   Node ele=even.pop();
                    result.add(ele.data);
                   if(ele.left!=null)
                   {
                       odd.push(ele.left);
                   }
                   if(ele.right!=null)
                   {
                       odd.push(ele.right);
                   }
               }
           }
            else
            {
                while(odd.size()>0)
               {
                   Node ele=odd.pop();
                  
                   result.add(ele.data);
                   if(ele.right!=null)
                   {
                       even.push(ele.right);
                   }
                   if(ele.left!=null)
                   {
                       even.push(ele.left);
                   }
               }
            }
            level++;
        }
        return result;  
	}
}
