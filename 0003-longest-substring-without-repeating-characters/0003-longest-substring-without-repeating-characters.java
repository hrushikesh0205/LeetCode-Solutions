class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left=0;
        int right=0;
        int Max=0;

        HashSet<Character>ab=new HashSet<>();
        
            while(right<s.length())
            {
                    if(ab.contains(s.charAt(right)))
                    {
                        ab.remove(s.charAt(left));
                        left++;
                    }
                    else
                    {
                        ab.add(s.charAt(right));
                        Max=Math.max(Max,right-left+1);
                        right++;
                    }
                }
            return Max;
            }
}
