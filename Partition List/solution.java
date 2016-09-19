/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode 
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        
        if (head == null) {
            return head;
        }
        
        ListNode bigDummy = new ListNode(0);
        ListNode bigHead = bigDummy;
        ListNode smallDummy = new ListNode(0);
        ListNode smallHead = smallDummy;
        
        while(head != null){
            if(head.val < x){
                smallHead.next = head;
                smallHead= smallHead.next;
            } else{
                bigHead.next = head;
                bigHead = bigHead.next;
            }
            
            head = head.next;
        }
        
        smallHead.next = bigDummy.next;
        bigHead.next = null;
        
        return smallDummy.next;
        
    }
}
