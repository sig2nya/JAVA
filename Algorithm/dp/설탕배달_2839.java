package dp;

import java.util.Scanner;

public class 설탕배달_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        while(true){
            if(N % 5 == 0) {
                cnt += N / 5;
                System.out.println(cnt);
                break;
            }
            N -= 3;
            cnt++;
            if(N < 0) {
                cnt = -1;
                System.out.println(cnt);
                break;
            }
        }
    }
}