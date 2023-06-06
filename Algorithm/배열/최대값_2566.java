package 배열;

import java.util.Scanner;

public class 최대값_2566 {
    public static void main(String[] args) {
        int arr[][] = new int[9][9];
        int max = 0, row = 0, col = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    row = i; col = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(++row + " " + ++col);
    }
}
