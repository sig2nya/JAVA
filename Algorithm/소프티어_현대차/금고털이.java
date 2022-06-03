package 소프티어_현대차;

import java.util.Scanner;

public class 금고털이 {
    public static int[] result;
    public static void check(int W, int arr[], int check[][]){
        for(int i = 0; i < result.length; i++){
            if(result[i] + W >= W) continue;
            else result[i] += check[i][0];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(); int N = sc.nextInt();
        int arr[] = new int[N];
        int check[][] = new int[N][2];
        result = new int[N];

        for(int i = 0; i < N; i++){
            check(W, arr, check);
        }
    }
}
