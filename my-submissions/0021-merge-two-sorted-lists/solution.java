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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode copyNode = result;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                copyNode.next = list1;
                list1 = list1.next;
            }
            else{
                copyNode.next = list2;
                list2 = list2.next;
            }
            copyNode = copyNode.next;
        }
        if(list1!=null){
            copyNode.next=list1;
                
        }
        else{
            if(list2!=null){
                            copyNode.next=list2;
            }
        }
        return result.next;
    }
}
