import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
      /*  for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; 
                }
            }
        }
        return new int[] {};  */
     /*   HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<size; i++)
        {
            int need = target - nums[i];
            if(map.containsKey(need))
            {
                return new int[] {map.get(need),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {}; */
        int res[] = new int[2];
        for(int i=0; i<size; i++)
        {
            int sum = target - nums[i];
            for(int j=i+1; j<size; j++)
            {
                if(sum == nums[j])
                {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;


        
    }
}
