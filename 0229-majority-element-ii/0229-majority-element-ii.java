class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> ab = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (ab.containsKey(nums[i])) {
                ab.put(nums[i], ab.get(nums[i]) + 1);
            }
            else {
                ab.put(nums[i], 1);
            }
        }

        for (int key : ab.keySet()) {

            if (ab.get(key) > nums.length / 3) {
                ans.add(key);
            }
        }

        return ans;
    }
}