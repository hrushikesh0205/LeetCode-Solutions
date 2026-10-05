class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        int[] ans = new int[nums.length];
        int left = 0;

        while (left < nums.length) {

            for (int right = 1; right <= 100; right++) {

                if (freq[right] > 0) {

                    ans[left] = right;
                    left++;
                    freq[right]--;
                }
            }
        }

        return ans;
    }
}