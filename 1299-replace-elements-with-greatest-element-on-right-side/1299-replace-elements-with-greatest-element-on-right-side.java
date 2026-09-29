class Solution {
    public int[] replaceElements(int[] nums) {

        int maxRight = -1;

        for(int i = nums.length - 1; i >= 0; i--) {

            int current = nums[i];

            nums[i] = maxRight;

            maxRight = Math.max(maxRight, current);
        }

        return nums;
    }
}