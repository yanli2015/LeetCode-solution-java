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
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
       if (head == null) {
           return head;
       }
       ListNode preNode = null;
       ListNode nextNode = null;
       
       while(head != null) {
          nextNode = head.next;
          head.next = preNode;
          preNode = head;
          head = nextNode;
           
       }
       
       return preNode;
     
       
        
    }
}
