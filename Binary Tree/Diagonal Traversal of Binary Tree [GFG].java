1. Using level order type of approach TC-O(N)  SC-O(N)
  
  Push left child of current node into stack and you move to right child
  
  class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
          ArrayList<Integer> result=new ArrayList<>();
          
          Queue<Node> queue=new ArrayDeque<>();
          
          Node curr=null;
          queue.add(root);
          while(curr!=null || queue.size()>0)
          {
              curr=queue.remove();
              
              while(curr!=null)
              {
                  result.add(curr.data);
                  if(curr.left!=null)
                  {
                      queue.add(curr.left);
                  }
                  
                  curr=curr.right;
              }
          }
          
          return result;
      }
}
  
