class Solution {
    public static int count1s(int n)
    {
        int c=0;
        while(n!=0)
        {
            if((n&1)==1)
            {
                c++;
                
            }
            n>>=1;
        }
        return c;
    }

    public static boolean isPrime(int n)
    {
        int c=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        return c==2;
    }
    public int countPrimeSetBits(int left, int right) {
        int ans=0;

        for(int i=left; i<=right; i++)
        {
            int n = count1s(i);
            if(isPrime(n))
            {
                ans++;
            }
        }
        return ans;
    }
}