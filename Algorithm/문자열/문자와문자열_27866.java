package 문자열;

import java.util.Scanner;

public class 문자와문자열_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr = sc.nextLine();
        int i = sc.nextInt();
        System.out.println(arr.charAt(i - 1));
    }
}
