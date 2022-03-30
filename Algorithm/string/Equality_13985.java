package string;

import java.util.Scanner;

public class Equality_13985 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Character.getNumericValue(str.charAt(0));
        int b = Character.getNumericValue(str.charAt(4));
        int c = Character.getNumericValue(str.charAt(8));
        System.out.println(a + " " + b + " " + c);
        if(a + b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
