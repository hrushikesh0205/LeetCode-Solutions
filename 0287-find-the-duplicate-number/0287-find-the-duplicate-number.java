class Solution {
    public int findDuplicate(int[] nums) {

    HashSet<Integer>ab= new HashSet<>();

    for(int num:nums)
    {
        if(ab.contains(num))
        {
            return num;
        }

        ab.add(num);
    }
    return -1;

    }
}