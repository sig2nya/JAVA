package 현대차.lv1;

import java.util.Scanner;

public class 주행거리비교하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println((a > b) ? "A" : (a < b) ? "B" : "same");
    }
}
