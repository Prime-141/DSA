import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        HashMap<Integer,Integer> map2 = new HashMap<>();  // for storing the previous value and its occurance

        for(Integer key : map.keySet())
        {
            int freq = map.get(key);
         //   map2.put(freq,map2.getOrDefault(freq,0)+1);
            if(map2.containsKey(freq))
            {
                map2.put(freq,map2.get(freq)+1);
            }
            else
            {
                map2.put(freq,1);
            }
        }

        for(Integer key : map2.keySet())
        {
            if(map2.get(key)>1)
            {
                return false;
            }
        }
        return true; 
     
     //  using hash map

     /*   HashSet<Integer> set = new HashSet<>();
        for(int freq : map.values())
        {
            if(set.contains(freq))
            {
                return false;
            }
            set.add(freq);
        }
        return true; */
    }
}