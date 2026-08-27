class Solution {

    public int crossSum(int a[], int l, int mid, int r)
    {
        int sum1=0;
        int leftMax=Integer.MIN_VALUE;
        for(int i=mid; i>=l; i--)
        {
            sum1 += a[i];
            leftMax = Math.max(sum1,leftMax);
        }
        int sum2=0;
        int rightMax=Integer.MIN_VALUE;
        for(int i=mid+1; i<=r; i++)
        {
            sum2 += a[i];
            rightMax = Math.max(sum2,rightMax);
        }
        return leftMax+rightMax;
    }
    public int maxSub(int a[],int l, int r)
    {
        if(l==r)
           return a[l];
        
            int mid=(l+r)/2;
            int m1 = Math.max(maxSub(a,l,mid),maxSub(a,mid+1,r));
            return Math.max(m1,crossSum(a,l,mid,r));
    }
    public int maxSubArray(int[] nums) {
      //  int n = maxSub(nums,0,nums.length-1);
      //  return n;
      int n = nums.length;
      int currSum = nums[0];
      int maxSum = nums[0];

      for(int i=1; i<n; i++)
      {
        currSum = Math.max(currSum + nums[i] , nums[i]);
        maxSum = Math.max(currSum,maxSum);
      }
      return maxSum;
    }
}