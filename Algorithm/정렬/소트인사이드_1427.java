package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 소트인사이드_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split("");
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) System.out.print(list.get(i));
    }
}
