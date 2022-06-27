package 조건문;

import java.util.Scanner;

public class 알람시계_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(); int M = sc.nextInt();

        int dif = M - 45;

        if(dif >= 0){
            System.out.println(H + " " + dif);
        } else if(dif < 0){
            System.out.println(H - 1 + " ");
        }
    }
}
