class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int pref[] = new int[n];
        int suff[] = new int[n];
        for(int i=1; i<n; i++)
        {
            pref[i] = pref[i-1] + nums[i-1];
        }

        for(int j=n-2; j>=0; j--)
        {
            suff[j] = suff[j+1] + nums[j+1];
        }

        for(int i=0; i<n; i++)
        {
            if(pref[i] == suff[i])
            {
                return i;
            }
        }
        return -1;
    }
}