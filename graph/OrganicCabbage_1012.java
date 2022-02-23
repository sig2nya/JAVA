package graph;

import java.io.*;
import java.util.StringTokenizer;

public class OrganicCabbage_1012 {
    static int M, N, K;
    static int [][] cabbage;
    static boolean[][] check;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static void DFS(int x, int y){
        check[x][y] = true;
        for(int i = 0; i < 4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];
            if(cx >= 0 && cy >= 0 && cx < M && cy < N){
                if(!check[cx][cy] && cabbage[cx][cy] == 1){
                    DFS(cx, cy);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken()); N = Integer.parseInt(st.nextToken()); K = Integer.parseInt(st.nextToken());
            cabbage = new int[M][N]; check = new boolean[M][N];
            for(int j = 0; j < K; j++){
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken()); int b = Integer.parseInt(st.nextToken());
                cabbage[a][b] = 1;
            }

            for(int x = 0; x < M; x++){
                for(int y = 0; y < N; y++){
                    if(cabbage[x][y] == 1 && !check[x][y]){
                        DFS(x, y);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
