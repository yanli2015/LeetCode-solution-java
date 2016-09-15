/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list 
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
        if (head == null || head.next == null || m > n) {
            return head;
        }
       
        
        ListNode bm = null;
        ListNode an = null;
        ListNode node1 = head;
        ListNode next = null;
        
        int len = 0;
        
        while (node1 != null) {
            len++;
            bm = len == m - 1 ? node1 : bm;
            an = len == n + 1 ? node1 : an;
            node1 = node1.next;
        }
        
        node1 = bm == null ? head : bm.next;
        ListNode node2 = node1.next;
        node1.next = an;
        
        while (node2 != an) {
            next = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = next;
            
        }
        
        if(bm != null) {
            bm.next = node1;
            return head;
        } else {
            return node1;
        }
        
        
        
    }
}