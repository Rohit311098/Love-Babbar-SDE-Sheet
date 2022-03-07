1. DFS Approach
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
    





