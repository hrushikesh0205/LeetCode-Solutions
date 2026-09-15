class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currentsum = 0;
        int low = 0;
        int minLenwindow = Integer.MAX_VALUE;

        for (int high = 0; high < nums.length; high++) {
            currentsum += nums[high];

            while (currentsum >= target) {
                int currentwindow = high - low + 1;
                minLenwindow = Math.min(minLenwindow, currentwindow);
                currentsum -= nums[low];
                low++;
            }
        }

        return (minLenwindow == Integer.MAX_VALUE) ? 0 : minLenwindow;
    }
}
