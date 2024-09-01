/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 class Solution {
    public boolean hasCycle(ListNode head) {
        //first method that comes to my mind is that i store the node that i visited 
        //and then when i travell to next node i will just search if that node is already prevent in my travelled data set 
        //ok then lets have hashMap for string the node       

        //another way is that i will start one fast and one slow runner 
        //if the list is linear then slow runner will never catch up with fast runner 
        //and fast runner will easily win the race by reaching the last node 
        //so incase slow and fast runner meets then linked list will be cyclic 

        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            return true;
        } 
        return false ;//if fast runner completes the race then list was linear  
    }
}
public class CheckingIfLinkedListIsCyclic {
    public static void main(String[] args) {
        
    }
}
