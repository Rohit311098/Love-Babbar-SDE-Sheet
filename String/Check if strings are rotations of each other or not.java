1. Brute Force: TC-O(N2)  SC-O(N)


class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        
        ArrayList<Integer> index=new ArrayList<>();
        
        //We need to check for all indexes as their may be occurance of
        // first variable more than one
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(0)==s2.charAt(i))
            {
                index.add(i);
            }
        }
        for(int i=0;i<index.size();i++)
        {
            if(checkrot(s1,s2,index.get(i))==true)
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkrot(String s1,String s2,int index)
    {
        int n=s1.length();
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)!=s2.charAt((index+i)%n))
            {
                return false;
            }
        }
        return true;
    }
    
}



2. Optmised Approach: Concat first string and check if second is substring of that or not, we have one functioon indexOf(string) in string class which return 
    first index if string is present in string.
      
 class Solution {
    public boolean rotateString(String s, String goal) {

      if(s.length()!=goal.length())
      {
        return false;
      }
      s+=s;

      for(int i=0;i<s.length();i++)
      {
         if(s.charAt(i)==goal.charAt(0) && (s.length()-i)>=goal.length())
         {
           int flag=1;
           for(int j=1;j<goal.length() && i+j<s.length();j++)
           {
              if(s.charAt(i+j)!=goal.charAt(j))
              {
                flag=0;
                break;
              }
           }

           if(flag==1)
           {
             return true;
           }
         }
      }
      // if(s.indexOf(goal)!=-1)
      // {
      //   return true;
      // }  

      return false;
    }
}
