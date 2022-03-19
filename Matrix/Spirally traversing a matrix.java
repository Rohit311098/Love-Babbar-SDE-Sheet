class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> result=new ArrayList<>();
        
        int fr=0, lr=r-1,fc=0,lc=c-1;
        
        int total=r*c;
        while(result.size()!=total)
        {
            //Top wall
            for(int i=fc;i<=lc && result.size()!=total;i++)
            {
                result.add(matrix[fr][i]);
            }
            
            fr++;
            
            //Right wall
            for(int i=fr;i<=lr && result.size()!=total;i++)
            {
                result.add(matrix[i][lc]);
            }
            
            lc--;
            
            //Bottom wall
            for(int i=lc;i>=fc && result.size()!=total;i--)
            {
                result.add(matrix[lr][i]);
            }
            
            lr--;
            
            //Left wall
            for(int i=lr;i>=fr && result.size()!=total;i--)
            {
                result.add(matrix[i][fc]);
            }
            
            fc++;
            
        }
        
        return result;
    }
}
