package 스택;

import java.util.Scanner;
import java.util.Stack;

public class ZERO_10773 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for(int i = 0; i < N; i++){
            int buf = sc.nextInt();
            if(buf == 0){
                stack.pop();
            } else {
                stack.push(buf);
            }
        }

        while(!stack.isEmpty()) result += stack.pop();

        System.out.println(result);
    }
}
