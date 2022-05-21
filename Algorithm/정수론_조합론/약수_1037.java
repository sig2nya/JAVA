package 정수론_조합론;

import java.util.Arrays;
import java.util.Scanner;

public class 약수_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int arr[] = new int[cnt];
        for(int i = 0; i < cnt; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[cnt - 1] * 2);
    }
}
