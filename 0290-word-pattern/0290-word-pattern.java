class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> ab = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);

            boolean containsKey = ab.containsKey(ch);

            if (ab.containsValue(arr[i]) && !containsKey) {
                return false;
            }
            if (containsKey && !ab.get(ch).equals(arr[i])) {
                return false;
            }

            ab.put(ch, arr[i]);
        }

        return true;
    }
}