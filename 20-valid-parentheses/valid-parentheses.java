
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character>result=new Stack<>();
        for(char ch:s.toCharArray()){
      if((ch=='(')||(ch=='{')||(ch=='[')){
        result.push(ch);
      }
      else {
      if(result.isEmpty()){
            return false;
           }
           char top=result.pop();
          if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
        }
        }
        return result.isEmpty();
    }
}