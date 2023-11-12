package 약수_배수와_소수;

import java.util.ArrayList;
import java.util.Scanner;

public class 약수들의합_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();

        while (true) {
            int N = sc.nextInt();
            int result = 0;

            if (N == -1) break;
            for (int i = 1; i < N; i++) {
                if (N % i == 0) list.add(i);
            }

            for(int i = 0; i < list.size(); i++) result += list.get(i);
            if(N == result) {
                System.out.print(result + " = ");
                print_result(list);
            } else {
                System.out.println(N + " is NOT perfect.");
            }
            list = new ArrayList<>();
        }
    }

    public static void print_result(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " + ");
        }
        System.out.println(list.get(list.size() - 1));
    }
}
