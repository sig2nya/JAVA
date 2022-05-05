package 그래프;

import java.util.Scanner;

public class ConnectedComponents_11724 {
    public static int[][] arr;
    public static boolean[] check;

    public static void DFS(int V){
        check[V] = true;
        // System.out.print(V + " ");
        for(int i = 1; i < arr.length; i++){
            if(arr[V][i] == 1 && !check[i]){
                DFS(i);
            }
        }
    }

    public static void main(String[] args) {
        int result = 0;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();
        arr = new int[N+1][N+1];
        check = new boolean[N+1];
        for(int i = 0; i < M; i++){
            int a = sc.nextInt(); int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }
        for(int i = 1; i < N; i++){
            if(!check[i]) {
                DFS(i);
                result++;
            }
        }

        System.out.println(result);
    }
}
