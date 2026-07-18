
class Solution {
    public boolean isValid(String s) {

        Stack<Character> ab = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                ab.push(arr[i]);
            }
            else {
                if (ab.isEmpty()) {
                    return false;
                }
                char top = ab.pop();
                if ((arr[i] == ')' && top != '(') ||
                (arr[i] == ']' && top != '[') ||
                (arr[i] == '}' && top != '{')) 
                {
                    return false;
                }
            }
        }
        return ab.isEmpty();
    }
}