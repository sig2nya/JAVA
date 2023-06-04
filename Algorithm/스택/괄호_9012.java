package 스택;

import java.util.Scanner;
import java.util.Stack;

public class 괄호_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            String bracket = sc.next();
            if(check(bracket)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean check(String bracket){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < bracket.length(); i++){
            for(int j = 0; i < bracket.length(); j++){
                if(bracket.charAt(j) == '('){
                    stack.push(bracket.charAt(j));
                } else {
                    if(!stack.isEmpty()){
                        stack.pop();
                    } else return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
