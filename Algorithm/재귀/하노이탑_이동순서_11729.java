package 재귀;

import java.util.Scanner;

public class 하노이탑_이동순서_11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void Hanoi(int N, int start, int mid, int end){
        if (N == 1){
            sb.append(start + " " + end + "\n");
            return;
        }

        Hanoi(N - 1, start, end, mid);

        sb.append(start + " " + end + "\n");

        Hanoi(N - 1, mid, start, end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sb.append((int) (Math.pow(2, N) - 1)).append('\n');
        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }
}
