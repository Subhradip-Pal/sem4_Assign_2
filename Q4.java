package Assignment2A;

import java.util.Stack;

public class Q4 {

	public static void main(String[] args) {
		String exp="2 8 + 9 10 / 8 * - 4 +";
		Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == ' ')
                continue;
            else if (Character.isDigit(c)) {
                int n = 0;
                while (Character.isDigit(c)) {
                    n = n * 10 + (int)(c - '0');//into digit
                    i++;
                    c = exp.charAt(i);
                }
                i--;
                stack.push(n);
            }
            else {
                int no1 = stack.pop();
                int no2 = stack.pop();
 
                switch (c) {
                case '+':
                    stack.push(no2 + no1);
                    break;
                case '-':
                    stack.push(no2 - no1);
                    break;
                case '/':
                    stack.push(no2 / no1);
                    break;
                case '*':
                    stack.push(no2 * no1);
                    break;
                }
            }
        }
        System.out.println(stack.pop());

	}

}
