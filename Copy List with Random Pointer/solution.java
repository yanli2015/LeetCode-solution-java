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
    
   
        RandomListNode nowNode = head;  
        while (nowNode != null){  
            RandomListNode copyNode = new RandomListNode(nowNode.label);  
            copyNode.random = nowNode.random;  
            copyNode.next = nowNode.next;  
            nowNode.next = copyNode;  
            nowNode = nowNode.next.next;  
        }  
          
       
        RandomListNode pHead = new RandomListNode(0);  
        pHead.next = head;  
        RandomListNode newlist = pHead;  
          
        nowNode = head;  
         while (nowNode.next != null){  
            pHead.next.next = nowNode.next.next;  
            
            pHead = pHead.next;  
            nowNode = nowNode.next;  
        }  
        return newlist.next;  
    }  
}  
