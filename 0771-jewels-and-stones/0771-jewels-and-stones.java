class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        
        Set<Character>ab=new HashSet<>();

        for(char ch:jewels.toCharArray())
        {
            ab.add(ch);
        }
        for(char ch: stones.toCharArray())
        {
            if(ab.contains(ch))
            {
            count++;
            }
        }
        return count;
    }
}