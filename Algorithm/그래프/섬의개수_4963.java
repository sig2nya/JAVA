package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 섬의개수_4963 {
    public static int arr[][];
    public static boolean check[][];
    public static int dx[] = {1, -1, 0, 0, 1, -1, 1, -1};
    public static int dy[] = {1, -1, 1, -1, -1, 1, 0, 0};
    public static int a, b;
    public static int count = 0;

    public static void DFS(int x, int y){
        check[x][y] = true;
        for(int i = 0; i < 8; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];
            if(cx >= 0 && cy >= 0 && cx < a && cy < b){
                if(arr[cx][cy] == 1 && !check[cx][cy]) {
                    DFS(cx, cy);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            b = Integer.parseInt(st.nextToken()); a = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0) break;
            arr = new int[a][b]; check = new boolean[a][b];
            for(int i = 0; i < a; i++){
                st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0; j < b; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int i = 0; i < a; i++){
                for(int j = 0; j < b; j++){
                    if(arr[i][j] == 1 && !check[i][j]) {
                        DFS(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
