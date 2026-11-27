class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        for(int i=1; i<n; i++)
        {
            leftSum[i] = nums[i-1] + leftSum[i-1];
        }
        for(int j=n-2; j>=0; j--)
        {
            rightSum[j] = nums[j+1] + rightSum[j+1];
        }

        int result[] = new int[n];

        for(int i=0; i<n; i++)
        {
            result[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return result;
    }
}