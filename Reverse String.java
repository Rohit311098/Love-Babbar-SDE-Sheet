1. GFG Solution
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String ans="";
        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            ans+=str.charAt(i);
        }
        
        return ans;
    }
}

2. Leetcode solution
class Solution {
    public void reverseString(char[] s) {
        
        int n=s.length;
        for(int i=0;i<n/2;i++)
        {
            char temp=s[i];
            
            s[i]=s[n-i-1];
            
            s[n-i-1]=temp;
        }
    }
}
