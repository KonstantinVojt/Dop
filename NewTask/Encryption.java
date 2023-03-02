package NewTask;

import java.util.Stack;

public class Encryption {

    private static String str;

    public static String massage(String massage) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < massage.length(); i++) {
            char element = massage.charAt(i);
            if (element != ' ') {
                stack.push(element);
            } else {
                while (!stack.isEmpty()) {
                    str = String.valueOf("");
                    str += String.valueOf(stack.pop());
                    System.out.print(str);
                }
                System.out.print(" ");
            }
            if ((i + 1) % 5 == 0) {
                while (!stack.isEmpty()) {
                    str = String.valueOf("");
                    str += String.valueOf(stack.pop());
                    System.out.print(str);
                }
            }
        }
        while (!stack.isEmpty()) {
            str = String.valueOf("");
            str += String.valueOf(stack.pop());
            System.out.print(str);
        }
        return massage;
    }
}

