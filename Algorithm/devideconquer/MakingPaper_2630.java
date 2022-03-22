package devideconquer;

import java.util.Scanner;

public class MakingPaper_2630 {
    public static int map[][];
    public static int white = 0, black = 0;

    public static void solution(int xstart, int xend, int ystart,int yend){
        int check = 0;
        for(int i = xstart; i < xend; i++){
            for(int j = ystart; j < yend; j++){
                check += map[i][j];
            }
        }

        if(check == (xend - xstart) * (yend - ystart)) {
            black++;
            return;
        }
        if(check == 0) {
            white++;
            return;
        }
        solution(xstart, (xstart + xend) / 2, ystart, (ystart + yend) / 2);
        solution((xstart + xend) / 2, xend, ystart, (ystart + yend) / 2);
        solution(xstart, (xstart + xend) / 2, (ystart + yend) / 2, yend);
        solution((xstart + xend) / 2, xend, (ystart + yend) / 2, yend);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                map[i][j] = sc.nextInt();
            }
        }

        solution(0, N, 0, N);
        System.out.println(white);
        System.out.println(black);
    }
}
