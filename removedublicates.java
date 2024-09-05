

  class ListNode {
    int val;
   ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        return head;
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        ListNode mover=head;
        while(mover!=null){
            if (mover.next != null && mover.val == mover.next.val) {
                while(mover!=null&&mover.next!=null&&mover.val==mover.next.val){
                    mover=mover.next;
                }
                mover=mover.next;
            }
            else{
                System.out.println(mover.val);
                prev.next=mover;
                prev=prev.next;
                mover=mover.next;
            }
        }
        prev.next=null;
        return dummy.next;
    }
}


public class removedublicates {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode mover=new ListNode(2);
        head.next=mover;
        ListNode temp=new ListNode(2);
        mover.next=temp;
        mover=temp;
        // temp=new ListNode(3);
        // mover.next=temp;
        // mover=temp;
        // temp=new ListNode(3);
        // mover.next=temp;
        // mover=temp;
        // temp=new ListNode(4);
        // mover.next=temp;
        // mover=temp;
        // temp=new ListNode(4);
        // mover.next=temp;
        // mover=temp;
        // temp=new ListNode(5);
        // mover.next=temp;
        // mover=temp;

        
        Solution sol=new Solution();
        ListNode newHead= sol.deleteDuplicates(head);
        mover=newHead;
        System.out.println();
        while (mover!=null) {
            System.out.print(mover.val);
            mover=mover.next;
        }
        System.out.println();
    }
}
