import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
       // Arrays.sort(nums);
       /* for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false; */
     /*   for(int i=0; i<size-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false; */
   /*     HashMap<Integer,Integer> map = new HashMap<>();
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
        for(int num : nums)
        {
            if(map.get(num)>1)
            {
                return true;
            }
        }
        return false; */

        Set<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            set.add(num);
        }

        int n1 = set.size();
        if(n1!=n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}