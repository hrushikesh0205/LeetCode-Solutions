class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer>ab= new Stack<>();
        String operator="+-*/";

        for(String token:tokens)
        {
            if(operator.indexOf(token)!=-1)
            {
                int d2=ab.pop();
                int d1=ab.pop();
                int result=0;

                if(token.equals("+"))
                   result=d1+d2;
                if(token.equals("-"))
                   result=d1-d2;
                if(token.equals("*"))
                   result=d1*d2;
                if(token.equals("/"))
                   result=d1/d2;
                
                ab.push(result);
            }
            else
            {
                ab.push(Integer.parseInt(token));
            }
        }
        return ab.peek();
        
    }
}