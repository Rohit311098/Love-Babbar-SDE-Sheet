1. BFS Approach  TC-O(N)  SC-O(N)
  
  class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
         if(node==null)
        {
            return new ArrayList<>();
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Node> queue=new ArrayDeque<>();
        
        queue.add(node);
        
        while(queue.size()>0)
        {
            int length=queue.size();
            int rightviewele=length-1;
            for(int i=0;i<length;i++)
            {
                Node curr=queue.remove();
                if(i==rightviewele)
                {
                    result.add(curr.data);
                }
                if(curr.left!=null)
                {
                    queue.add(curr.left);
                }       
                if(curr.right!=null)
                {
                    queue.add(curr.right);
                }
            }
        }
        return result;
    }
}

2. DFS Approach  TC-O(N)   SC-O(1)
class Solution{
    //Function to return list containing elements of right view of binary tree.
    public void DFS(Node root,ArrayList<Integer> result,int level)
    {
        if(root==null)
        {
            return;
        }
        
        if(result.size()<level)
        {
            result.add(root.data);
        }
        else
        {
            result.set(level-1,root.data);
        }
        
        DFS(root.left,result,level+1);
        DFS(root.right,result,level+1);
    }
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        if(node==null)
        {
            return new ArrayList<>();
        }
        ArrayList<Integer> result=new ArrayList<>();
        DFS(node,result,1);
        return result;
    }
}
