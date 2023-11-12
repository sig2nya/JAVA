package 정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 커트라인_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, k;
        int result = 0;

        N = sc.nextInt(); k = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[arr.length - k]);
    }
}
