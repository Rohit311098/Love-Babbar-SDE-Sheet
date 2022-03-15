class Solution {
    
    static ArrayList<String> result;
        
    public static  void helper(int[][] m,int sr,int sc,int dr,int dc,String currpath)
    {
        if(sr<0 || sr>dr || sc<0 || sc>dc || m[sr][sc]==0 || m[sr][sc]==-1)
        {
            return;
        }
        
        if(sr==dr && sc==dc)
        {
            result.add(currpath);
            return;
        }
        
        m[sr][sc]=-1;
        
        //Upward call
        
        helper(m,sr-1,sc,dr,dc,currpath+'U');
        
        //Downward call
        
        helper(m,sr+1,sc,dr,dc,currpath+'D');
        
        //Left call
        helper(m,sr,sc-1,dr,dc,currpath+'L');
        
        //Right call
        helper(m,sr,sc+1,dr,dc,currpath+'R');
        
        m[sr][sc]=1;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        result=new ArrayList<>();
        helper(m,0,0,n-1,m[0].length-1,"");
        return result;
    }
}
