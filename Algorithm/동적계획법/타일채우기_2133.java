package 동적계획법;

import java.util.Scanner;

public class 타일채우기_2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dp[] = new int[N+1];

        int answer = 0;

        if(N % 2 == 1){
            answer = 0;
        } else {
            dp[0] = 1;
            dp[2] = 3;

            for(int i = 4; i <= N; i++){
                dp[i] = dp[i - 2] * dp[2];
                for(int j = i - 4; j >= 0; j -= 2){
                    dp[i] += dp[j] * 2;
                }
            }
            answer = dp[N];
        }
        System.out.println(answer);
    }
}
