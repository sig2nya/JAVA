package 재귀;

import java.util.Scanner;

public class 곱셈3_1769 {
    public static long cnt = 0;

    public static void solution(String N){
        char check[] = N.toCharArray();
        if(check.length == 1){
            if(Integer.parseInt(String.valueOf(check[0])) % 3 == 0) {
                System.out.println(cnt);
                System.out.println("YES");
                return;
            } else {
                System.out.println(cnt);
                System.out.println("NO");
                return;
            }
        }
        long sum = 0;
        for(int i = 0; i < check.length; i++) sum += Integer.parseInt(String.valueOf(check[i]));

        cnt++;
        solution(Long.toString(sum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        solution(N);
    }
}