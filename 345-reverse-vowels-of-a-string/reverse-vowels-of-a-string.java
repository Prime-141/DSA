class Solution {
    public boolean isVowel(char ch)
    {
        return ch == 'a' || ch == 'A' || 
               ch == 'e' || ch == 'E' ||  
               ch == 'i' || ch == 'I' || 
               ch == 'o' || ch == 'O' || 
               ch == 'u' || ch == 'U';
    }
    public String reverseVowels(String s) {

        char [] arr = s.toCharArray();
        int l = s.length();
        int start=0;
        int end = l-1;

        while(start<=end)
        {
           if(!isVowel(arr[start]))
           {
            start++;
           }
           else if(!isVowel(arr[end]))
           {
            end--;
           }
           else
           {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
           }
        }

        return new String(arr);
    }
}