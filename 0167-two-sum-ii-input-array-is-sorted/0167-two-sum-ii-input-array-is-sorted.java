class Solution {
    public int[] twoSum(int[] numbers, int target) {

     int left=0;
     int right=numbers.length-1;
     int ans=0;
     
     while(left<right)
     {
        ans=numbers[left]+numbers[right];

        if(ans==target)
        {
            return new int[]{left+1,right+1};
        }
        if(ans>target)
        {
            right--;
        }
        else
        {
            left++;
        }
     }
     return new int[]{-1,-1};   
}
}