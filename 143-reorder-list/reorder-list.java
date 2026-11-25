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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        //bruteForce 
        // ArrayList<ListNode>list=new ArrayList<>();
        ListNode temp=head;
        // while(temp!=null){
        //     list.add(temp);
        //     temp=temp.next;
        // }
        // int low=0;
        // int high=list.size()-1;
        // while(low<high){
        //     list.get(low).next=list.get(high);
        //     low++;
        //     if(low==high){
        //         break;
        //     }
        //     list.get(high).next=list.get(low);
        //     high--;
        // }
        // list.get(high).next=null;
        //optimized

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode p=slow.next;
        slow.next=null;
        while(p!=null){
            ListNode next=p.next;
            p.next=prev;
            prev=p;
            p=next;
        }
        slow.next=prev;
        slow.next=null;

while (prev != null) {

    ListNode next1 = temp.next;
    ListNode next2 = prev.next;

    temp.next = prev;
    prev.next = next1;

    temp = next1;
    prev = next2;
}
    }
}