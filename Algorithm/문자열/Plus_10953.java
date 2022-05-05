package 문자열;

import java.util.Scanner;

public class Plus_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            String a[] = sc.next().split(",");
            System.out.println(Integer.parseInt(a[0]) + Integer.parseInt(a[1]));
        }

    }
}
