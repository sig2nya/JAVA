package 그래프;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_1260 {
	public static int[][] arr;
	public static boolean[] check;
	public int V;

	public static void DFS(int V){
		check[V] = true;
		System.out.print(V + " ");
		for(int i = 1; i < arr[V].length; i++){
			if(arr[V][i] == 1 && !check[i]){
				DFS(i);
			}
		}
	}

	public static void BFS(int V){ // 재귀로 구현하지 않는다.
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(V); // 큐에 값 넣기.
		check[V] = true;
		while(!queue.isEmpty()){
			int tmp = queue.poll(); // 큐에 담긴 값 꺼내기.
			System.out.print(tmp + " ");
			for(int i = 1; i < arr[V].length; i++){
				if(arr[tmp][i] == 1 && !check[i]){
					queue.offer(i);
					check[i] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		arr = new int[V+1][V+1];
		check = new boolean[V+1];
		for(int i = 1; i <= V; i++){
			int a = sc.nextInt(); int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		DFS(1);
		for(int i = 0; i < check.length; i++) check[i] = false;
		System.out.println();
		BFS(1);
	}
}
