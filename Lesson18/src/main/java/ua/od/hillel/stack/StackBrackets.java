package ua.od.hillel.stack;

import java.util.Stack;

public class StackBrackets {

    public boolean stackBrackets(String o) {
        Stack<Character> stack = new Stack();

        for (int i = 0; i < o.length(); i++) {
            if (o.charAt(i) == '(' || o.charAt(i) == '[' || o.charAt(i) == '{') {
                stack.push(o.charAt(i));
            } else {
                if (o.charAt(i) - 1 == stack.peek() || o.charAt(i) - 2 == stack.peek()) {
                    stack.pop();
                } else return false;
            }
        }
        return true;
    }
}

