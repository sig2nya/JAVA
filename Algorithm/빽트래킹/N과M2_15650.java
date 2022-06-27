package 빽트래킹;

import java.util.Scanner;

public class N과M2_15650 {
    public static int arr[];
    public static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); M = sc.nextInt();

        arr = new int[M];
        dfs(1, 0);
    }

    public static void dfs(int at, int depth){
        if(depth == M){
            for(int var : arr) System.out.println(var + " ");
            System.out.println();
            return;
        }

        for(int i = at; i <= M; i++){
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
