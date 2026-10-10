import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n1 = ransomNote.length();
        int n2 = magazine.length();
        if (n1 > n2) return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : magazine.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : ransomNote.toCharArray())
        {
            int count = map.getOrDefault(ch,0);
            if(count == 0) return false;
            map.put(ch,map.get(ch)-1);
        }
        return true;

    }
}