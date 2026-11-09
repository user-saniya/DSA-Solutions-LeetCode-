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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode temp2=head;
        ListNode prev=head;
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count==n){
            return head.next;
        }
        for(int i=1;i<count-n;i++){
        temp2=temp2.next;
        }
        temp2.next=temp2.next.next;

     return head;
    }
}