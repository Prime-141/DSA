class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map =  new HashMap<>();

        for(int num : nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int k=0;
        int res[]  = new int[nums1.length];

        for(int num : nums2)
        {
            if(map.containsKey(num) && map.get(num)>0)
            {
                res[k] = num;
                k++;
                map.put(num,map.get(num)-1);
            }
        }

        return Arrays.copyOfRange(res,0,k);
    }
}