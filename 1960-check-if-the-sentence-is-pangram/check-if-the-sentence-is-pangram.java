import java.util.*;
class Solution {
    public boolean checkIfPangram(String sentence) {
     /*   HashMap<Character,Integer> map = new HashMap<>();
        for(char ch ='a'; ch <='z' ; ch++)
        {
            map.put(ch,0);
        }
        for(char ch : sentence.toCharArray())
        {
            map.put(ch,map.get(ch)+1);
        }
        for(Character key : map.keySet())
        {
            if(map.get(key)==0)
            {
                return false;
            }
        }
        return true; */

        int ans[] = new int[26];

        for(char ch : sentence.toCharArray())
        {
            int index = ch - 'a';
            ans[index]++;
        }

        for(int i=0; i<26; i++)
        {
            if(ans[i] == 0)
            {
                return false;
              
            }
        }
        return true;
    }
}