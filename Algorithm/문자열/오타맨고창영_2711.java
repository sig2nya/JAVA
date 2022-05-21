package 문자열;

import java.util.Scanner;

public class 오타맨고창영_2711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int M = sc.nextInt(); StringBuilder sb = new StringBuilder(sc.next());
            sb.deleteCharAt(M - 1);
            System.out.println(sb);
        }

    }
}
