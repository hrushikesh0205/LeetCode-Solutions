class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        long windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        long maxAns = 0;

        if (map.size() == k)
            maxAns = windowSum;

        for (int j = k; j < n; j++) {

            windowSum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            windowSum -= nums[j - k];

            map.put(nums[j - k], map.get(nums[j - k]) - 1);

            if (map.get(nums[j - k]) == 0)
                map.remove(nums[j - k]);

            if (map.size() == k)
                maxAns = Math.max(maxAns, windowSum);
        }

        return maxAns;
    }
}