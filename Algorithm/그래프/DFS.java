package 그래프;

import java.util.Scanner;

public class DFS {
    static boolean check[];
    static int arr[][];

    public static void dfs(int N){
        if(check[N]) return;
        check[N] = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i][N] == 1 && !check[i]){
                System.out.println(i);
                dfs(i);
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N + 1][N + 1]; check = new boolean[N + 1];
        for(int i = 0; i < N - 1; i++){
            int a = sc.nextInt(); int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }
        dfs(7);
    }
}
