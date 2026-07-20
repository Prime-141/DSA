import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
     /*   int c=0;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(nums[i]==nums[j] && i<j)
                {
                    c++;
                }
            }
        }
        return c;  */
        HashMap<Integer,Integer> map = new HashMap<>();
        int c=0;
    /*    for(int num : nums)
        {
            c += map.getOrDefault(num,0);

            map.put(num,map.getOrDefault(num,0)+1);
        }
        return c; */
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
   // ncr =  
        int result = 0;
        for(Integer key : map.keySet())
        {
            int count = map.get(key);
            result = result + (count*(count-1))/2;
        }
        return result;


    }
}