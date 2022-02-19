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

class Solution {
    //Function to find the height of a binary tree.
    int height(Node root) 
    {
        // code here 
        if(root==null)
        {
            return 0;
        }
        
        int curr_height=1;
        
        int  left_height=height(root.left);
        
        int right_height=height(root.right);
        
        int max_height=Math.max(left_height,right_height);
        
        curr_height=max_height+1;
        return curr_height;
    }
}
