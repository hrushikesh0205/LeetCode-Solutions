class Solution {
    public ListNode reverseList(ListNode head) {

    ListNode start=head;
    ListNode end=null;
    
    while(start!=null)
    {
        ListNode temp=start.next;
        start.next=end;
        end=start;
        start=temp;
    }
    return end;
    }
}











