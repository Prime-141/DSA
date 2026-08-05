import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int l = result.length();
        int start = 0;
        int end = l-1;

        while(start < end)
        {
            if(result.charAt(start)== result.charAt(end))
            {
                start++;
                end--;
            }
            else{
               return false;
            }
            
        }
        return true;
    }
}