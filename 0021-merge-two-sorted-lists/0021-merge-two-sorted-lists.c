/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode* temp=list1;
    if(temp==NULL&&list2==NULL)
    {
        return list1;
    }
    if(list1==NULL&&list2!=NULL)
    {
        return list2;
    }
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=list2;
    struct ListNode* temp1=list1;
    while(temp1!=NULL)
    {
        struct ListNode* temp2=temp1->next;
        while(temp2!=NULL)
        {
            if(temp1->val>temp2->val)
            {
                int t=temp1->val;
                temp1->val=temp2->val;
                temp2->val=t;
            }
            temp2=temp2->next;
        }
        temp1=temp1->next;
    }
    return list1;
}