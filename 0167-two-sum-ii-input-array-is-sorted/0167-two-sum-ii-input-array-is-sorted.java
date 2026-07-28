class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left=0;
        int right=numbers.length-1;

        while(left<right)
        {
            int count=numbers[left]+numbers[right];
            if(count==target)
            {
                return  new int[]{left+1,right+1};
            }
            else if(count<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return new int[]{-1,-1};
}
}