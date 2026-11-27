import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
       /* int c=0;
        int n = nums.length;
        for(int s=0; s<n; s++)
        {
            for(int e=s; e<n; e++)
            {
                int sum=0;
                for(int i=s; i<=e; i++)
                {
                    sum += nums[i];
                }
                if(sum==k)
                {
                    c++;
                }
            }
        }
        return c; */

        HashMap<Integer,Integer> map  = new HashMap<>();
        int n = nums.length;

        int sum=0;
        map.put(0,1);
        int c=0;
        for(int i=0; i<n; i++)
        {
            sum = sum+nums[i];
            int r = sum-k;
            if(map.containsKey(r))
            {
                c += map.get(r);
                
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            
        }
        return c;

    }
}