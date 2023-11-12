package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 대표값2_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg = avg / 5;

        Arrays.sort(arr);

        System.out.println(avg);
        System.out.println(arr[2]);
    }
}
