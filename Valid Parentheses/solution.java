public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
       if (s == null || s.length() == 0 || ((s.length() % 2) != 0))
            return false;
        char[] ch = s.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < ch.length; i++){
            if (stack.isEmpty() == true)
                stack.push(ch[i]);
            else{
                if(isMatch(stack.peek().toString().charAt(0),ch[i])){
                    stack.pop();
                }
                else
                    stack.push(ch[i]);
                
            }
       
       } return stack.isEmpty();
       
    } 
       
       public boolean isMatch(char a, char b){
           switch (a){
               case '(':
                   if (b == ')')
                      return true;
                   else
                      return false;
                case '{':
                   if (b == '}')
                      return true;
                   else
                      return false;
                case '[':
                   if (b == ']')
                      return true;
                   else
                      return false;
                default:
                    return false;
                
           }
           
       }
        
    
}