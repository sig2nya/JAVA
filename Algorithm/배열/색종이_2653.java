package 배열;

import java.util.Scanner;

public class 색종이_2653 {
    public static void main(String[] args) {
        boolean arr[][] = new boolean[100][100];
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            for(int x = a; x < a + 10; x++){
                for(int y = b; y < b + 10; y++){
                    arr[x][y] = true;
                }
            }
        }


        int result = 0;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(arr[i][j]) result++;
            }
        }
        System.out.println(result);
    }
}
