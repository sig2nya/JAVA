package dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class Zero_10773 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        for(int i = 0; i < K; i++){
            int check = sc.nextInt();
            if(check == 0 && !stack.isEmpty()){
                stack.pop(); continue;
            }
            stack.push(check);
        }

        int sum = 0;
        while(!stack.isEmpty()) sum += stack.pop();
        System.out.println(sum);
    }
}
