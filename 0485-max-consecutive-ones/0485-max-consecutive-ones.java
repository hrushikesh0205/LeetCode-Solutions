class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int left=0;
        int maxcount=0;
        int currentcount=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                currentcount++;
            }
            else
            {
                maxcount=Math.max(currentcount,maxcount);
                currentcount=0;
            }
        }
        return Math.max(currentcount,maxcount);
        
    }
}