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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        //brute force approach
    //   HashSet<ListNode>set=new HashSet<>();
    //   ListNode temp=head;
    //   int pos=-1;
    //   while(temp!=null&&!set.contains(temp)){
    //     set.add(temp);
    //     temp=temp.next;
    //     }
   ListNode fast=head;
   ListNode slow=head;
   while(fast!=null&&fast.next!=null){
      fast=fast.next.next;
      slow=slow.next;
  if(fast==slow){
    break;
  }
    }
    if(slow!=fast){
        return null;
    }
    ListNode p=head;
    while(p!=slow){
        p=p.next;
       slow=slow.next;

    }
    return slow;
}
}