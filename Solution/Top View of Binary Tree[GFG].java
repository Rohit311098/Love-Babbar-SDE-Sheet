1. DFS Approach Using TreeMap and Pair Class-> TC-O(Nlogn)     SC-O(N)

Note: We can reduce TC by taking hashmap instead of TreeMap and by taking max and min variable for adding into result in sorted order
It can reduce to TC-O(N)  SC-O(N)

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    
  public static class Pair
    {
        int row;
        int data;
        
        Pair(int row,int data)
        {
            this.row=row;
            this.data=data;
        }
    }
    
    public static void DFS(Node root,TreeMap<Integer,Pair> topview,int row,int col)
    {
        if(root==null)
        {
            return ;
        }
        
        if(topview.containsKey(col)==false)
        {
            topview.put(col,new Pair(row,root.data));
        }
        else if(topview.get(col).row>row)
        {
            topview.get(col).row=row;
            topview.get(col).data=root.data;
        }
        
        DFS(root.left,topview,row+1,col-1);
        DFS(root.right,topview,row+1,col+1);
        
    }
    static ArrayList<Integer> topView(Node root)
    {
        if(root==null)
        {
            return new  ArrayList<>();
        }
        
        TreeMap<Integer,Pair> topview=new TreeMap<>();

        DFS(root,topview,0,0);
        
        ArrayList<Integer> result=new ArrayList<>();
        for(Integer curr:topview.keySet())
        {
            result.add(topview.get(curr).data);
        }
        return result;
    }
}
