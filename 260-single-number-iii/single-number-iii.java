

class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[] = new int[2];
        int sum=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            sum = sum ^ nums[i]; 
        }
        
        int rightMost = (sum & -sum);
        int sum1=0;
        int sum2=0;

        for(int i=0; i<nums.length; i++)
        {
            if(((nums[i])& rightMost) == 0)
            {
                sum1 = sum1 ^ nums[i];
            }
            else if(((nums[i])&rightMost) != 0)
            {
                sum2 = sum2 ^ nums[i];
            }
        }
        ans[0] = sum1;
        ans[1] = sum2;

        return ans;


    }
}