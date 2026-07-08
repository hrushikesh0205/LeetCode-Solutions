class Solution {
    public int maxArea(int[] height) {

    int left=0;
    int right=height.length-1;
    int Maxwater=0;
    while(left<right)
    {
        int currentwater=Math.min(height[left],height[right])*(right-left);
        Maxwater=Math.max(Maxwater,currentwater);
        if(height[left]<height[right])
        {
            left++;
        }
        else
        {
            right--;
        }
    }
    return Maxwater;
}
}
