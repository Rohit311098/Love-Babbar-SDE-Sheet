class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Integer> queue=new ArrayDeque<>();
        
        boolean[] visited=new boolean[V];
        
        queue.add(0);
        visited[0]=true;
        while(queue.size()>0)
        {
            int top=queue.remove();
            result.add(top);
            for(Integer i:adj.get(top))
            {
                if(!visited[i])
                {
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
        
        return result;
    }
}
