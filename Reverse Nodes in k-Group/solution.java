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
     * @param k an integer
     * @return a ListNode
     */
    
    private ListNode cur = null;
    private ListNode start = null;
    private ListNode end = null;
    private ListNode pre = null;
    private ListNode next = null;
    private int count = 1;
    
    public ListNode reverseKGroup(ListNode head, int k) {
        // Write your code here
        
        if (k < 2 || head == null) {
            return head;
        }
        cur = head;
        while (cur != null) {
            next = cur.next;
            if (count == k) {
                start = pre == null ? head : pre.next;
                head = pre == null ? cur : head;
                helper(pre,start,cur,next);
                pre = start;
                count = 0;
            }
            count++;
            cur = next;
        }
        
        return head;
    }
    
    private void helper(ListNode left, ListNode start, ListNode end, ListNode right){
        pre = start;
        cur = start.next;
        
        
        while (cur != right) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        
        if (left != null) {
            left.next = end;
        }
        
        start.next = right;
    }
}