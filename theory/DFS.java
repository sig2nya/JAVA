package theory;

import java.util.Scanner;

public class DFS {
	static int size = 0;
	static boolean[] visited;
	static int[][] graph;
	
	static void dfs(int startIdx) {
		visited[startIdx] = true;
		System.out.print(startIdx + 1 + " ");
		for(int i = 0; i < graph[startIdx].length; i++) {
			if(!visited[i]) dfs(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		visited = new boolean[size]; graph = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		
		dfs(0);
	}

}
/*
Test Case 1
5
0 1 1 0 0
1 0 0 0 1
1 0 0 1 0
0 0 1 0 1
0 1 0 1 0

Test Case 2
4
0 1 1 1
1 0 0 1
1 0 0 1
1 1 1 0
*/