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
      HashSet<ListNode>set=new HashSet<>();
      ListNode temp=head;
      int pos=-1;
      while(temp!=null&&!set.contains(temp)){
        set.add(temp);
        temp=temp.next;
        }
        
      return temp;
    }
}