class Solution {
    public boolean isEvenD(int n)
    {
        int c=0;
        while(n!=0)
        {
            
            c++;
            n=n/10;
        }
        if(c%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int findNumbers(int[] nums) {
        int c=0;

        for(int i=0; i<nums.length; i++)
        {
            if(isEvenD(nums[i]))
            {
                c++;
            }
        }
        return c;
    }
}