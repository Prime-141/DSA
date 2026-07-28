class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int value = numbers[i]+numbers[j];
            if(value == target)
            {
                return new int[] {i+1,j+1};
            }
            else if(value < target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return new int[] {};
    }
}