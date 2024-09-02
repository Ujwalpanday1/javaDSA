
class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //if the numbers are small then we can extract the numbers and then add and then create a linked list 
        //below is that approach 
        // int num1=0;
        // int i=1;
        // while(l1!=null){
        //     num1+=i*l1.val;
        //     l1=l1.next;
        //     i=i*10;
        // }
        // i=1;
        // int num2=0;
        // while(l2!=null){
        //     num2+=i*l2.val;
        //     l2=l2.next;
        //     i=i*10;
        // }

        // int sum=num1+num2;
        // ListNode head=new ListNode(sum%10);
        // ListNode prev=head;
        // sum=sum/10;
        // while(sum!=0){
        //     ListNode temp=new ListNode(sum%10);
        //     prev.next=temp;
        //     prev=temp;
        //     sum=sum/10;
        // }

        // return head;
        

        //but list can have 100 of nubmer so 
        //we cannot add by extracting the numbers it will cause overflow 
        //but we can create a linked list by creating each node while traveling in the list 
        int carry=0;
        if(l1==null)
        return l2;
        if(l2==null)
        return l1;
        int digi=l1.val+l2.val;
        if(digi/10!=0)
        carry=1;
        ListNode head=new ListNode(digi%10);
        ListNode prev=head;
        l1=l1.next;
        l2=l2.next;
        while(l1!=null&&l2!=null){
            int currentDigit=l1.val+l2.val+carry;
            if(currentDigit/10!=0)
            carry=1;
            else
            carry=0;
            ListNode temp=new ListNode(currentDigit%10);
            prev.next=temp;
            prev=temp;
            l1=l1.next;
            l2=l2.next;
        }
        //remaing from l1 if l2 is exhauted 
        while(l1!=null){
            int currentDigit=l1.val+carry;
            if(currentDigit/10!=0)
            carry=1;
            else
            carry=0;
            ListNode temp=new ListNode(currentDigit%10);
            prev.next=temp;
            prev=temp;
            l1=l1.next;

        }
        while(l2!=null){
            int currentDigit=l2.val+carry;
            if(currentDigit/10!=0)
            carry=1;
            else
            carry=0;
            ListNode temp=new ListNode(currentDigit%10);
            prev.next=temp;
            prev=temp;
            l2=l2.next;
        }
        //if still carry is remaining write it here 
        if(carry==1)
        {
            ListNode temp= new ListNode(1);
            prev.next=temp;
        }
        return head;
    }
}
public class additionList {
    public static void main(String[] args) {
       
                // Create first linked list: 9
                ListNode l1 = new ListNode(9);
                
                // Create second linked list: 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 1
                ListNode l2 = new ListNode(9);
                l2.next = new ListNode(9);
                l2.next.next = new ListNode(9);
                l2.next.next.next = new ListNode(9);
                l2.next.next.next.next = new ListNode(9);
                l2.next.next.next.next.next = new ListNode(9);
                l2.next.next.next.next.next.next = new ListNode(9);
                l2.next.next.next.next.next.next.next = new ListNode(9);
                l2.next.next.next.next.next.next.next.next = new ListNode(9);
                l2.next.next.next.next.next.next.next.next.next = new ListNode(1);
        
                // Add the two numbers
                Solution solution = new Solution();
                ListNode result = solution.addTwoNumbers(l1, l2);
        
                // Print the result
                while (result != null) {
                    System.out.print(result.val);
                    if (result.next != null) {
                        System.out.print(" -> ");
                    }
                    result = result.next;
                }
                System.out.println();
            }
        }
