/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) { return head; }
        ListNode temp=head,start=head,end=null;
        int c=1;
        while(temp!=null)
        {
            if(c+1==left)
            {
                start=temp;
            }
            if(c==right)
            {
                end=temp;
                break;
            }
            c++;
            temp=temp.next;
        }
        if(left==1)
        {
            ListNode prev=null,curr=head,next=head,after=end.next;
            while(curr!=after)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head.next=curr;
            return prev;
        }
        ListNode prev=start,curr=start.next,next=curr,after=end.next;
        while(curr!=after)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        start.next.next=curr;
        start.next=prev;
        return head;
    }
}