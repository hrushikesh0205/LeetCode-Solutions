class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>>ab= new HashMap<>();

        for(String str:strs)
        {
            int[]count= new int[26];

            for(char ch: str.toCharArray())
            {
                count[ch-'a']++;
            }

            String key= Arrays.toString(count);

            if(!ab.containsKey(key))
            {
                ab.put(key, new ArrayList<>());
            }
            ab.get(key).add(str);
        }
        return new ArrayList<>(ab.values());
    }
}