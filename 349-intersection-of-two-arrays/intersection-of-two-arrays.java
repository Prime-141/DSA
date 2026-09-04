import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : set1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : set2)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> resultList = new ArrayList<>();

        for(Integer key : map.keySet())
        {
            if(map.get(key)==2)
            {
                resultList.add(key);
            }
        }


        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}