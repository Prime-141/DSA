class Solution {
    public int findLeftMost(int nums[], int target, int n)
    {
        int l=0, r=n-1;

        int left=-1;
        while(l<=r)
        {
            int mid = l + (r-l)/2;

            if(nums[mid] == target)
            {
                left = mid; // possibly the ans
                r = mid-1; // check more on left
            }
            else if(nums[mid]<target)
            {
                l = mid+1;
            }
            else 
            {
                r = mid-1;
            }
        }
        return left;
    }
    public int findRightMost(int arr[], int target, int n)
    {
        int l=0, r=n-1;
        int right=-1;

        while(l<=r)
        {
            int mid = l + (r-l)/2;
            if(arr[mid]==target)
            {
                right=mid;
                l= mid+1;
            }
            else if(arr[mid]<target)
            {
                l = mid+1;
            }
            else 
            {
                r= mid-1;
            }
        }
        return right;
    }
    public int[] searchRange(int[] nums, int target) {
       /* int n= nums.length;
        int first = -1;
        int last = -1;

        for(int i=0; i<n; i++){
            if(nums[i]==target){
                first=i;
                break;
            }
        }
        for(int j=n-1; j>=0; j--){
            if(nums[j]==target){
                last = j;
                break;
            }
        }
        return new int[]{first,last};
        */

        int n = nums.length;

        int left = findLeftMost(nums,target,n);
        int right = findRightMost(nums,target,n);

        return new int[]{left,right};




    
    }
}