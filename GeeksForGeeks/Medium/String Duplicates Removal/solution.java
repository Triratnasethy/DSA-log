public class Solution   {
    
    
    public static String removeDuplicates(String s) {
        String dup="";
        for(char ch:s.toCharArray())
        {
            if(dup.indexOf(ch) == -1)
            dup+=ch;
        }
        return dup;
        
    }
}