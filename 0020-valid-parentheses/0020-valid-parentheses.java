class Solution {
    public boolean isValid(String s) {
    
    Stack<Character>ab= new Stack<>();
    char[]val=s.toCharArray();
    for(int i=0; i<val.length; i++)
    {
        if(val[i]=='(' || val[i]=='[' || val[i]=='{')
        {
            ab.push(val[i]);
        }
        else
        {
            if(ab.isEmpty())
            {
                return false;
            }

            char top=ab.pop();
            if((val[i]==')' && top!='(') ||
                 (val[i]=='}' && top!='{') ||
                 (val[i]==']' && top!='['))
                 {
                    return false;
                 }
        }
        
    }
    return ab.isEmpty();
    }
}