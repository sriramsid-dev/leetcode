class MyLinkedList {
    Node head;
    Node tail;
    public MyLinkedList() {
    }
    
    public int get(int index) {
        Node temp=head;
        int c=0;
        while(temp!=null)
        {
            if(c==index)
            {
                return temp.data;
            }
            c++;
            temp=temp.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node n=new Node(val);
        if(head==null)
        {
            head=tail=n;
            return;
        }
        n.next=head;
        head=n;
    }
    
    public void addAtTail(int val) {
        Node n=new Node(val);
        if(head==null)
        {
            head=tail=n;
            return;
        }
        tail.next=n;
        tail=n;

    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0) {
            return;
        }
        Node n=new Node(val);
        if(index==0)
        {
            addAtHead(val);
        }
        else
        {
            Node temp=head;
            int c=0;
            while(temp!=null)
            {
                if(c+1==index)
                {
                    n.next=temp.next;
                    temp.next=n;
                     if (n.next == null) {
                tail = n;
            }
                    break;
                }
                c++;
                temp=temp.next;
            }
        }
    }
    
    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }
        if(index==0)
        {
            head=head.next;
            return;
        }
        Node temp=head;
            int c=0;
            while(temp!=null&&temp.next!=null)
            {
                if(c+1==index)
                {
                    if (temp.next == tail) {
                    tail = temp;
                }
                    temp.next=temp.next.next;
                    break;
                }
                c++;
                temp=temp.next;
            }
    }
}
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        this.data=d;
    }
    Node(int d,Node next)
    {
        this.data=d;
        this.next=next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */