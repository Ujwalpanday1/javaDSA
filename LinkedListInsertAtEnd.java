class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        if(head==null)
        {
            Node temp=new Node(x);
            return temp;
        }
        Node mover=head;
        while(mover.next!=null){
            mover=mover.next;
        }
        Node temp=new Node(x);
        mover.next=temp;
        return head;
    }
}
public class LinkedListInsertAtEnd {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        Node head = null;
        head = sol.insertAtEnd(head, 1);
        // head = sol.insertAtEnd(head, 2);
        // head = sol.insertAtEnd(head, 3);
        
        // Print the list to verify
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
