import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int start =0;
        int end =n-1;

     /*   int currA = (Math.min(height[start],height[end])) * (end-start);

        while(start < end)
        {
            int areaA = (Math.min(height[start],height[end])) * (end-start);

            currA = Math.max(areaA,currA);

            if(height[start] < height[end])
            {
                start++;
            }
            else if(height[start] > height[end])
            {
                end--;
            }
            
        }
        return currA; */

        int maxWater = 0;
        while(start < end)
        {
            int w = end - start;

            int h = Math.min(height[start],height[end]);

            int area = w*h;
            maxWater = Math.max(maxWater,area);

            if(height[start] < height[end])
            {
                start++;
            }
            else{
                end--;
            }



        }

        return maxWater;
    }
}