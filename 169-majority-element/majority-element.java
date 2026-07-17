import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int target = (n/2);
     /*   for(int i=0 ; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                
            }
            if(count>target)
            return nums[i];
        }
        return -1; */
       HashMap<Integer,Integer> map = new HashMap<>();
   /*    for(int i=0; i<n; i++)
       {
        if(map.containsKey(nums[i]))
        {
            map.put(nums[i],map.get(nums[i])+1);
        }
        else
        {
            map.put(nums[i],1);
        }
       } */
       for(int num : nums)
       {
           map.put(num,map.getOrDefault(num,0)+1);
       }
       for(int key : map.keySet())
       {
          if(map.get(key)>target)
          {
            return key;
          }
       }
       return -1;
    }
}