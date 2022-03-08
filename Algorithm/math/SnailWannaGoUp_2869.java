package math;

import java.util.Scanner;

public class SnailWannaGoUp_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int distance = sc.nextInt();
        int day = (distance - b) / (a - b);

        if ((distance - b) % (a - b) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
