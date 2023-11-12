package 약수_배수와_소수;

import java.util.Scanner;

public class 소인수분해_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while (N > 1) {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    N /= i;
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
