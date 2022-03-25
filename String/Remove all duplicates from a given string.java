
class Solution {
    String removeDuplicates(String str) {
        String result="";
        
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            if(set.contains(str.charAt(i))==false)
            {
                result+=str.charAt(i);
                set.add(str.charAt(i));
            }
        }
        
        return  result;
    }
}
