package 빽트래킹;

import java.util.Scanner;

public class N과M1_15649 {
    public static int[] arr;
    public static boolean[] visit;

    public static void dfs(int N, int M, int depth){
        if(M == depth){
            for(int var : arr) System.out.print(var + " ");
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();
        arr = new int[M]; visit = new boolean[N];

        dfs(N, M, 0);
    }
}
