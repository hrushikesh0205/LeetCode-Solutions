class Solution {
    public int maxArea(int[] height) {

    int left=0;
    int right=height.length-1;
    int maxwater=0;

    while(left<right)
    {
        int currentwater=Math.min(height[left],height[right])*(right-left);
        maxwater=Math.max(maxwater,currentwater);
        if(height[left]<height[right])
        {
            left++;
        }
        else
        {
            right--;
        }
    }
    return maxwater;
}
}
