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
        ArrayList<ListNode>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        int low=0;
        int high=list.size()-1;
        while(low<high){
            list.get(low).next=list.get(high);
            low++;
            if(low==high){
                break;
            }
            list.get(high).next=list.get(low);
            high--;
        }
        list.get(high).next=null;
    }
}