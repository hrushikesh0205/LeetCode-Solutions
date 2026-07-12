class Solution {
    public int lengthOfLastWord(String s) {
        
        int count=0;
        int end=s.length()-1;

        while(end>=0 && s.charAt(end)==' ')
        {
            end--;
        }
        while(end>=0 && s.charAt(end)!=' ')
        {
            count++;
            end--;
        }
        return count;
}
}