package 문자열;

import java.util.Scanner;

public class Ten_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            if(i > 0 && i % 10 == 0) System.out.println();
            System.out.print(str.charAt(i));
        }

    }
}
