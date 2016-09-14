/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @return a boolean
     */
    public boolean isPalindrome(ListNode head) {
        // Write your code here
        if (head == null || head.next == null) {
            return true;
        }
        
        ListNode node1 = head;
        ListNode node2 = head;
        ListNode node3 = head;
        
        while (node2.next != null  && node2.next.next != null) {
            node1 = node1.next;
            node2 = node2.next.next;
        }
        node2 = node1.next; 
        node1.next = null;
        
        while (node2 != null) {
            node3 = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = node3;
        }
        
        node2 = head;
        node3 = node1;
        boolean res = true;
        while ( node1 != null && node2 != null) {
            if (node1.val != node2.val) {
                res = false;
                break;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        
        node1 = node3.next;
        node3.next = null;
        
        while (node1!= null) {
            node2 = node1.next;
            node1.next = node3;
			node3 = node1;
            node1 = node2;
             
            
        }
        return res;
        
    }
}