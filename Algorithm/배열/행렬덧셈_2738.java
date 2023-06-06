package 배열;

import java.util.Scanner;

public class 행렬덧셈_2738 {
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); M = sc.nextInt();

        int A[][] = new int[N][M];
        int B[][] = new int[N][M];
        int result[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++){
                  A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++){
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++){
                result[i][j] = A[i][j] + B[i][j];
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
