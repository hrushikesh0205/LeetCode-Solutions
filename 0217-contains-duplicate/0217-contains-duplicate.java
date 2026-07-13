class Solution {
    public boolean containsDuplicate(int[] nums) {

    HashMap<Integer,Integer>ab= new HashMap<>();

    for(int num:nums)
    {
        if(ab.containsKey(num))
        {
            return true;
        }
        ab.put(num,1);
    }
    return false;
    }
}