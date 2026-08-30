class Solution {
    public int removeDuplicates(int[] nums) {

        int size = nums.length;
     /*   Arrays.sort(nums);

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(nums[i]==nums[j]){
                    for(int k=j; k<size-1; k++){
                        nums[k]=nums[k+1];
                    }
                    size--;
                    j--;
                }
            }
        }
        return size; */

        int k=1;
        for(int j=1; j<size; j++)
        {
            if(nums[j] != nums[j-1])
            {
                nums[k] = nums[j];
                k++;
            }
        }
        return k;
    }
}