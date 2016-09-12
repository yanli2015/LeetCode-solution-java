public class Queue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Queue() {
     stack1 = new Stack<Integer>();
     stack2 = new Stack<Integer>();
    }
    
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    public int pop() {
        // write your code here
        if (stack1.empty() && stack2.empty()){
            throw new RuntimeException("Your queue is empty.");
        } else if(stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.pop();
        
    }

    public int top() {
        // write your code here
         if (stack1.empty() && stack2.empty()){
            throw new RuntimeException("Your queue is empty.");
        } else if(stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.peek();
    }
}