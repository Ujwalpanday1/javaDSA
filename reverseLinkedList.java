
 
  class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode reverseLink(ListNode curr,ListNode prev){

        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        if(next==null)
        return curr;
        return reverseLink(next,prev);

    }
    public ListNode reverseList(ListNode head) {
        //using a loop 
        // ListNode mover=head;
        // ListNode prev=null;
        // while(mover!=null){
        //     ListNode next=mover.next;
        //     mover.next=prev;
        //     prev=mover;
        //     mover=next;
        // }
        // return prev;

        //using recursion 
        return reverseLink(head,null);
    }
}
public class reverseLinkedList {
    public static void main(String[] args) {
        
    }
}
