package 문자열;

import java.util.Scanner;

public class 대소문자바꾸기_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                System.out.print(Character.toUpperCase(str.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            }
        }
    }
}
