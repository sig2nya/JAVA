package 스택;

import java.util.Scanner;
import java.util.Stack;

public class 균형잡힌세상_4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String text = sc.nextLine();
            if(text.equals(".")) break;
        }
    }

    static boolean check1(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; i < str.length(); j++){
                if(str.charAt(j) == '('){
                    stack.push(str.charAt(j));
                } else {
                    if(!stack.isEmpty()){
                        stack.pop();
                    } else return false;
                }
            }
        }
        return true;
    }

    static boolean check2(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; i < str.length(); j++){
                if(str.charAt(j) == '['){
                    stack.push(str.charAt(j));
                } else {
                    if(!stack.isEmpty()){
                        stack.pop();
                    } else return false;
                }
            }
        }
        return true;
    }
}
