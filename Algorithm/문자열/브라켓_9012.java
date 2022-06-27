package 문자열;

import java.util.Scanner;
import java.util.Stack;

public class 브라켓_9012 {
    public static boolean check(String str) {
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String bracket = sc.next();
            if (check(bracket)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}