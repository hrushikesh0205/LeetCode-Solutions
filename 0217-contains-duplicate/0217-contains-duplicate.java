class Solution {
    public boolean containsDuplicate(int[] nums) {

    HashSet<Integer>ab= new HashSet<>();

    for(int num:nums)
    {
        if(ab.contains(num))
        {
            return true;
        }
        ab.add(num);
    }
    return false;
    }
}