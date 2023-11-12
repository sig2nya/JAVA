package 수학;

import java.util.Scanner;

public class 중앙이동알고리즘_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println((int) Math.pow(Math.pow(2, N) + 1, 2));
    }
}
