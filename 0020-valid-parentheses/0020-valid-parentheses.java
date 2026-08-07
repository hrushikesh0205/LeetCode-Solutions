class Solution {
    public boolean isValid(String s) {
    
    Stack<Character>ab=new Stack<>();
    char[]nums=s.toCharArray();
    for(int i=0; i<nums.length; i++)
    {
        if(nums[i]=='(' || nums[i]=='{'|| nums[i]=='[')
        {
            ab.push(nums[i]);
        }
        else
        {
            if(ab.isEmpty())
            {
                return false;
            }

        char top=ab.pop();
             if((nums[i]==')' && top!='(') ||
               (nums[i]=='}' && top!='{') ||
               (nums[i]==']' && top!='['))
               {
                return false;
               }
        }
    }
    return ab.isEmpty();
    }
}