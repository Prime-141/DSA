import java.util.*;
class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        
        int l = sb.length();
        for(int i=0; i<l; i++)
        {
            if(sb.charAt(i)=='6')
            {
                sb.setCharAt(i,'9');
                break;
            }
        }

        return Integer.parseInt(sb.toString());

        
    }
}