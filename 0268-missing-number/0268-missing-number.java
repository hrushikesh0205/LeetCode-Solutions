class Solution {
    public int missingNumber(int[] nums) {

        int count=0;

        for(int i=0; i<nums.length; i++)
        {
            count=count+nums[i];
        }

        int actualvalue=(nums.length*(nums.length+1))/2;
        int missing=actualvalue-count;
        return missing;

    }
}
