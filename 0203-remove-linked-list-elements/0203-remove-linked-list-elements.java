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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val==val)
        {
            head=head.next;
        }
        if(head==null)
        {
            return head;
        }
        ListNode head1=new ListNode(head.val);
        ListNode temp=head.next;
        ListNode temp1=head1;
        while(temp!=null)
        {
            if(temp.val!=val)
            {
                temp1.next=temp;
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        temp1.next=null;
        return head1;
    }
}