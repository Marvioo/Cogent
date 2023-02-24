package Set4;

import java.util.ArrayDeque;
import java.util.Deque;

public class IsValidParenthese {
    public boolean isValid(String s) {
        Deque<Character> stack  = new ArrayDeque<>();
        for(char c: s.toCharArray()) {
            if(c == '{') {
                stack.offerFirst('}');
            } else if (c == '(') {
                stack.offerFirst(')');
            }else if (c == '[') {
                stack.offerFirst(']');
            } else if(stack.isEmpty() || stack.pollFirst() != c ) {
                return false;
            }
        }
        return true;
    }
}
