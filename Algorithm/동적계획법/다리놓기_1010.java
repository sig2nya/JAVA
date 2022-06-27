package 동적계획법;

import java.util.Scanner;

public class 다리놓기_1010 {
    public static int BC(int n, int r) {
        if(n == r || r == 0) return 1;
        return BC(n - 1, r - 1) + BC(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int r = sc.nextInt(); int n = sc.nextInt();
            System.out.println(BC(n, r));
        }


    }
}
