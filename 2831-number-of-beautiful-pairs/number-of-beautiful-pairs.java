class Solution {
    public static int reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int d = num%10;
            rev = (rev*10) + d;
            num =num/10;
        }
        return rev;
    }

    public static int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
    public int countBeautifulPairs(int[] nums) {
        int c = 0;
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int f = (reverse(nums[i])) % 10;
                int l = (nums[j])%10;
                if(gcd(f,l) == 1)
                {
                    c++;
                }
            }
        }
        return c;
    }
}