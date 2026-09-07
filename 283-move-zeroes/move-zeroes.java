class Solution {
    public void moveZeroes(int[] nums) {
     /*   int size= nums.length;
        int index=0;

        for(int i=0; i<size; i++){
            if(nums[i]!=0){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        for(int i=0; i<size; i++){
            System.out.println(" "+nums[i]);
        } */

        int n = nums.length;
        int j=0;

        for(int i=0; i<n; i++)
        {
            if(nums[i]!=0)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        while(j<n)
        {
            nums[j] = 0;
            j++;
        }
    }
}