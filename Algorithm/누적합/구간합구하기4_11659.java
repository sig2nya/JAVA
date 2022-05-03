package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 맞왜틀

public class 구간합구하기4_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] input = sc.readLine().split(" ");

        int N = Integer.parseInt(input[0]); int M = Integer.parseInt(input[1]);
        int arr[] = Arrays.stream(sc.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sol[] = new int[M];

        for(int i = 0; i < M; i++){
            input = sc.readLine().split(" ");
            int a = Integer.parseInt(input[0]); int b = Integer.parseInt(input[1]);
            int result = 0;
            for(int j = a - 1; j < b; j++){
                result += arr[j];
            }
            sol[i] = result;
        }
        for(int i = 0; i < M; i++){
            System.out.println(sol[i]);
        }
    }
}
