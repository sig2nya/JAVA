package devideconquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chicken_TOP_N_11582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) list.add(sc.nextInt());
        int K = sc.nextInt();
        for(int i = 0; i < K; i++) {
            for (int j = 0; j < list.size(); j += 2) {
                if (list.get(j) > list.get(j + 1)) {
                    int tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }
    }
}
