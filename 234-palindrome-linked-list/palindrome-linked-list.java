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
    public boolean isPalindrome(ListNode head) {
        ListNode prev;
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        ArrayList<Integer>list=new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
       dummy.next= reverseList(head);
       prev=dummy.next;
        for(int i=0;i<list.size()&&prev!=null;i++){
            if(prev.val!=list.get(i)){
                return false;
            }
            prev=prev.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
     ListNode temp=head;
     ListNode prev=null;
     while(temp!=null){
        ListNode next=temp.next;
        temp.next=prev;
        prev=temp;
        temp=next;
     } 
     head=prev;
     return head;  
    }
}