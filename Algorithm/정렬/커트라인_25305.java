package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 커트라인_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), k = sc.nextInt();
        ArrayList list = new ArrayList();

        for (int i = 0; i < N; i++) list.add(sc.nextInt());
        Collections.sort(list);

        System.out.println(list.get(N - k));

    }
}
