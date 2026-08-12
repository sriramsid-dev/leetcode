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
    public ListNode reverseKGroup(ListNode head, int k) {
        int c=0;
        ListNode temp=head,head1=null;
        while(temp!=null)
        {
            c++;
            if(c==k)
            {
                head1=temp;
            }
            temp=temp.next;
        }
        if (c < k) {
            return head;
        }
        int t=c/k;
        ListNode prev=null,curr=head,next=head,prevlink=null;
        while(t>0&&curr!=null)
        {
            ListNode link=curr;
            int c1=k;
            while(c1>0)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                c1--;
            }
            if(prevlink!=null)
            {
                prevlink.next=prev;
            }
            prevlink=link;
            prev=null;
            link.next=curr;
            t--;
        }
        return head1;
    }
}