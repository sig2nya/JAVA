package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Virus_2606 {
	static int[][] arr;
	static boolean[] checked;
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
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(V);
		checked[V] = true;
		while(!q.isEmpty()) {
			int tmp = q.poll();
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
		int com = sc.nextInt(); int con = sc.nextInt();
		arr = new int[com][com]; checked = new boolean[com];
		boolean checked[] = new boolean[com];
		for(int i = 0; i < con; i++) {
			int a = sc.nextInt() - 1; int b = sc.nextInt() - 1;
			arr[a][b] = arr[b][a] = 1;
		}
		
		int cnt = 0;
		for(int i = 0; i < com; i++) {
			if(Virus_2606.checked[i] == true) {
				cnt++;
				continue;
			}
			BFS(i);
		}
		System.out.println(cnt - 1);
	}
}
