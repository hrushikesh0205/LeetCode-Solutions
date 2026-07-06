class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer>ab= new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int count=target-nums[i];
            if(ab.containsKey(count))
            {
                int []arr={ab.get(count),i};
                return arr;
            }
            ab.put(nums[i],i);
        }
        return null;
    }
}
