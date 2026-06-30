class Solution {
    public int fib(int n) {
        
        int first=0;
        int second=1;
        int next=0;

        for(int i=0; i<n; i++)
        {
            System.out.println(first+" ");
            next=first+second;
            first=second;
            second=next;
        }
        return first;
    }
}