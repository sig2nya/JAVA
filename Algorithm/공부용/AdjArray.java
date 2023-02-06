package 공부용;

import java.util.Scanner;

public class AdjArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Nodes Cnt : ");
        int nodes = sc.nextInt();
        System.out.println("Input Lines Cnt : ");
        int lines = sc.nextInt();

        boolean arr[][] = new boolean[nodes][nodes];
        for(int i = 0; i < lines; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a - 1][b - 1] = arr[b - 1][a - 1] = true;
        }

        for(int i = 0; i < nodes; i++){
            for(int j = 0; j < nodes; j++) System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
