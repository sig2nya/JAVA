package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_1260 {
	static int arr[][];
	static boolean checked[];
	
	public static void DFS(int V) {
		checked[V] = true;
		System.out.print(V + 1 + " ");
		for(int i = 0; i < arr[V].length; i++) {
			if(!checked[i] && arr[V][i] == 1) DFS(i);
		}
	}
	
	// BFS는 QUEUE를 이용하여 구현
	public static void BFS(int V) {
		Queue<Integer> q = new LinkedList<Integer>(); // 자바의 QUEUE는 LinkedList 이용
		q.offer(V);
		checked[V] = true;
		while(!q.isEmpty()) {
			int tmp = q.poll();
			System.out.print(tmp + 1 + " ");
			for(int i = 0; i < arr[tmp].length; i++) {
				if(checked[i] == false && arr[tmp][i] == 1) {
					q.offer(i);
					checked[i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), V = sc.nextInt() - 1;
		arr = new int[N][N]; checked = new boolean[N];
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			arr[a - 1][b - 1] = arr[b - 1][a - 1] = 1;
		}
		DFS(V);
		System.out.println();
		for(int i = 0; i < checked.length; i++) checked[i] = false;
		BFS(V);
	}

}
