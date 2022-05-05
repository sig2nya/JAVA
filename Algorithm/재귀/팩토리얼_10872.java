package 재귀;

import java.util.Scanner;

public class 팩토리얼_10872 {
    public static int fact(int N){
        if(N == 1 | N == 0) return 1;
        return N * fact(N - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fact(N));
    }
}
