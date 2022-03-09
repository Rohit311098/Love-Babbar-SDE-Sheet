1. BFS Approach
 TC-O(N)  SC-O(N)
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        if(root==null)
        {
            return new ArrayList<>();
        }
      ArrayList<Integer> result=new ArrayList<>();
      Queue<Node> queue=new ArrayDeque<>();
      queue.add(root);
      while(queue.size()>0)
      {
          result.add(queue.peek().data);
          int length=queue.size();
          while(length-->0)
          {
              Node curr=queue.remove();
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




2. DFS Approach
TC-O(N)   SC-O(1)

class Tree
{
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
        
        DFS(root.left,result,level+1);
        DFS(root.right,result,level+1);
        
    }
    ArrayList<Integer> leftView(Node root)
    {
        if(root==null)
        {
           return new ArrayList<>(); 
        }
      ArrayList<Integer> result=new ArrayList<>();
      
      DFS(root,result,1);
      
      return result;
    }
}

2. BFS Approach  TC-O(N) SC-O(N)
    





