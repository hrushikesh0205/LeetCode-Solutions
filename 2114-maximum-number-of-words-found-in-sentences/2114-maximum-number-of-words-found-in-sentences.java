class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int count=0;
        for(int i=0; i<sentences.length; i++)
        {
            int temp=0;
            temp=sentences[i].split(" ").length;
            count=Math.max(count,temp);
        }
        return count;
    }
}