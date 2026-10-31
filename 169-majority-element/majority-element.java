import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
     /*   int n = nums.length;
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
       

      /*      HashMap<Integer,Integer> map = new HashMap<>();

       for(int num : nums)
       {
        map.put(num,map.getOrDefault(num,0)+1);
       }

       for(Integer num : map.keySet())
       {
        if(map.get(num)>n/2)
        {
            return num;
        }
       }

       return -1; */

        int candidate =0;
        int count=0;
       for(int num : nums)
       {
            if(count==0)
            {
                candidate = num;
            }
            if(candidate == num)
            {
                count++;
            }
            else
            {
                count--;
            }
       }
       return candidate;
    }
}