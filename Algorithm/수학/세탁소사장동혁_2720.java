package 수학;

import java.util.Scanner;

public class 세탁소사장동혁_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result[][] = new int[T][4];

        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            result[i][0] = C / 25;
            C %= 25;
            result[i][1] = C / 10;
            C %= 10;
            result[i][2] = C / 5;
            C %= 5;
            result[i][3] = C / 1;
        }

        for(int i = 0; i < T; i ++) {
            System.out.println(result[i][0] + " " + result[i][1] + " " + result[i][2] + " " + result[i][3]);
        }
    }
}
