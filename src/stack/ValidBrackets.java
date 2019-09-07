package stack;

import java.util.Stack;

/**
 * 判断括号是否合法，只有括号的情况
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/9/7 12:54
 */
public class ValidBrackets {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (Character ch : arr) {
            switch (ch) {
                case '(':
                    stack.push(ch);
                    break;
                case '[':
                    stack.push(ch);
                    break;
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }

        }
        return stack.isEmpty() ? true : false;
    }
}
