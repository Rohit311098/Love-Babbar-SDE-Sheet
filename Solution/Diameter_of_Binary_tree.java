//Diameter in terms of eedges hai
class Solution {
    int dia;
    int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        
        int currdia=lh+rh+1;
        dia=Math.max(currdia,dia);
        return Math.max(rh,lh)+1;
    }
    int diameter(Node root) {
        // Your code here
        if(root==null)
        {
            return 0;
        }
         if(root.left==null && root.right==null)
        {
            return 1;
        }
        dia=0;
        height(root);
        return dia;
    }
}
