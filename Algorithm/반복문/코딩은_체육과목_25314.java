package 반복문;

import java.util.Scanner;

public class 코딩은_체육과목_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N / 4; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
