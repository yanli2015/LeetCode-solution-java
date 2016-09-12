public class MinStack {
    Stack<Integer> stackData;
    Stack<Integer> stackMin;
    public MinStack() {
        
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    public void push(int number) {
        
        if (stackMin.isEmpty() || min() >= number) {
            stackMin.push(number);
        }
        
        stackData.push(number);
    }

    public int pop() {
        
        if (stackData.isEmpty()){
            throw new RuntimeException("Your stack is tempty");
        }
        int val = stackData.pop();
        if (min() >= val ){
            stackMin.pop();
        }
        return val;
    }

    public int min() {
        
        if(stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        return stackMin.peek();
    }
}
