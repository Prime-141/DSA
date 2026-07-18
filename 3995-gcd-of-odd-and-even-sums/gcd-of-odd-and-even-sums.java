class Solution {
    public static int gcd(int a,int b)
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
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*n;
        int sumEven=n*(n+1);

      /*  int c=0;

        while(sumOdd!=sumEven){
           if(sumOdd>sumEven){
               sumOdd=sumOdd-sumEven;
           }else{
               sumEven = sumEven-sumOdd;
           }
        }
        return sumOdd; */
        return gcd(sumOdd,sumEven);
        
    }
}