package org.serjmaks.algo.legacy;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int run(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                int result = n2 + n1;
                stack.push(result);
            } else if (token.equals("-")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                int result = n2 - n1;
                stack.push(result);
            } else if (token.equals("*")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                int result = n2 * n1;
                stack.push(result);
            } else if (token.equals("/")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                int result = n2 / n1;
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));

            }
        }

        return stack.pop();
    }
}
