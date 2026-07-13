class Solution {
    public int missingNumber(int[] nums) {

      int count=0;
      for(int i=0; i<nums.length; i++)
      {
          count=count+nums[i];
      }
      int actual=(nums.length*(nums.length+1))/2;
      int result=actual-count;
      return result;
    }
}
