class Solution {

    public void reverseString(char[] s) {
        int l = s.length;

        int start = 0;
        int end = l-1;

        while(start<end)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}