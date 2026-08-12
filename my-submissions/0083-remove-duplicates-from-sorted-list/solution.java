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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode copyNode = head;
        if(head==null) return head;
        if(head.next==null){
                return copyNode;
        }
        ListNode nextNode = head.next;
        while(nextNode!=null){
            if(head.val==nextNode.val){
                if(nextNode.next==null){
                    head.next = null;
                    return copyNode;
                }
                nextNode = nextNode.next;
            }
            else{
                head.next = nextNode;
                head = head.next;
                nextNode = nextNode.next;
            }
        }
        return copyNode;
    }
}
