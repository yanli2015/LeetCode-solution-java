/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        if (head == null) {
            return head;
        }
        
        RandomListNode cur = head;
        RandomListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = new RandomListNode(cur.label);
            cur.next.next = next;
            cur = next;
            
        }
        
        cur = head;
        RandomListNode copy = null;
        
        while (cur != null) {
            copy = cur.next;
            next = cur.next.next;
            copy.random = cur.random != null ? cur.random: null;
            cur = next;
        }
        
        RandomListNode res = head.next;
        cur = head;
        
        while (cur != null) {
            next = cur.next.next;
            copy = cur.next;
            cur.next = next;
            copy.next = next != null ? next.next : null;
            cur = next;
        }
        
        return res;
    }
}