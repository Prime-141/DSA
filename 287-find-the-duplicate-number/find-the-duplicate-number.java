import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
      /*  int size = nums.length;
        
        int c=0;
        for(int i=0; i<size; i++){
            c=c^nums[i];

        }
        if(c==0){
            return c;
        }
        return 0;  */
 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Integer key : map.keySet())
        {
            if(map.get(key)>=2)
            {
                return key;
            }
        }
        return -1;
        
    }
}