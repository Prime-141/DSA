class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int res[] = heights.clone();
        Arrays.sort(res);
        int c=0;
        for(int i=0; i<n; i++)
        {
            if(heights[i] != res[i])
            {
                c++;
            }
        }
        return c;
    }
}