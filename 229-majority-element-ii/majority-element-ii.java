import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int target = (n/3);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int key : map.keySet())
        {
            if(map.get(key)>target)
            {
                ans.add(key);
            }
        }
        return ans;
    }
}