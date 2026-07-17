import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
       /* int n=nums.length;
       
        int c=0;
        for(int i=0; i<n; i++){
            c=c^nums[i];
        }
        return c; */
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Integer key : map.keySet())
        {
            if(map.get(key)==1)
            {
                return key;
            }
        }
        return -1;
    }
}