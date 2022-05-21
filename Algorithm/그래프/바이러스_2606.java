package 그래프;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 바이러스_2606 {
    public static int result = 0;
    public static int arr[][];
    public static boolean check[];

    public static void DFS(int V){
       check[V] = true;
       System.out.println(V + " ");
       for(int i = 1; i < arr.length; i++){
           if(arr[V][i] == 1 && !check[i]){
               result++;
               DFS(i);
           }
       }
    }

    public static void BFS(int V) {
        Queue<Integer> q = new LinkedList();
        q.offer(V);
        check[V] = true;
        while(!q.isEmpty()){
            int tmp = q.poll();
            for(int i = 1; i < arr.length; i++){
                if(arr[tmp][i] == 1 && !check[i]){
                    q.offer(i);
                    check[i] = true;
                    result++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); int T = sc.nextInt();
        arr = new int[V+1][V+1];
        check = new boolean[V+1];
        for(int i = 0; i < T; i++){
            int a = sc.nextInt(); int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }
        // DFS(1);
        BFS(1);
        System.out.println(result);
    }
}
