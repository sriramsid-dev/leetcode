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
    int x=0,f=0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null)
        {
            return null;
        }
        solve(head,n);
        if (x == n)
            return head.next;
        return head;
    }
    public void solve(ListNode head,int n)
    {
        if(head==null||f==1)
        {
            return;
        }
        solve(head.next,n);
        x++;
        if(x==n+1&&f==0)
        {
            f=1;
            head.next=head.next.next;
            return;
        }
    }
}