import java.util.*;
class Solution {
    public int mostFrequentEven(int[] nums) {
      /*  int n = nums.length;

        int c=0;
        for(int num : nums)
        {
            if(num%2==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            return -1;
        }
        int eves[] = new int[c];
        int j=0;
        for(int num : nums)
        {
            if(num%2==0)
            {
                eves[j] = num;
                j++;
            }
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : eves)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxF=0;
        for(int freq : map.values())
        {
            maxF = Math.max(maxF,freq);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(Integer key : map.keySet())
        {
            if(map.get(key) == maxF)
            {
                result.add(key);
            }

        }

        return Collections.min(result);  
        */
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            if(num%2==0)
            {
                 map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int maxF=0;
        int ans=-1;

        for(int key : map.keySet())
        {
            int freq = map.get(key);

            if(freq>maxF)
            {
                maxF = freq;
                ans=key;
            }
            else if(freq==maxF && key < ans)
            {
                ans= key;
            }
        }
        return ans;
        
    }
}