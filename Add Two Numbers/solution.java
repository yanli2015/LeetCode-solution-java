/**
 * Definition for singly-linked list.
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
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null && l2 == null) {
            return l1;
        } else if(l1 == null) {
            return l2;
        } else if(l2 == null) {
            return l1;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int digit = 0;
        int ca = 0;
        
        while (l1 != null && l2 != null) {
            digit = (l1.val + l2.val + ca) % 10;
            ca = (l1.val + l2.val + ca) / 10;
            head.next = new ListNode(digit);
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
         while (l1 != null ) {
            digit = (l1.val + ca) % 10;
            ca = (l1.val + ca) / 10;
            head.next = new ListNode(digit);
            head = head.next;
            l1 = l1.next;
            
        }
        
         while (l2 != null ) {
            digit = (l2.val + ca) % 10;
            ca = (l2.val + ca) / 10;
            head.next = new ListNode(digit);
            head = head.next;
            l2 = l2.next;
            
        }
        
        if (ca != 0) {
            head.next = new ListNode(ca);
            head.next.next = null;
        }
        
        return dummy.next;
        
    }
}