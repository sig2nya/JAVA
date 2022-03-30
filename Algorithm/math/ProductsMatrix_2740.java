package math;

import java.util.Scanner;

public class ProductsMatrix_2740 {
    public static int[][] solution(int A[][], int B[][]){
        int result[][] = new int[A.length][A.length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                result[i][j] = A[i][j] * B[j][i] + A[j][i] * B[i][j];
                for(int a = 0; a < result.length; a++){
                    for(int b = 0; b < result.length; b++){
                        System.out.print(result[a][b] + " ");
                    }
                    System.out.println();
                }
            }
        }


        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();
        int A[][] = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                A[i][j] = sc.nextInt();
            }
        }

        N = sc.nextInt(); M = sc.nextInt();
        int B[][] = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                B[i][j] = sc.nextInt();
            }
        }
        int result[][] = solution(A, B);
    }
}
