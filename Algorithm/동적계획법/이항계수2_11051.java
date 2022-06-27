package 동적계획법;

import java.util.Scanner;

public class 이항계수2_11051 {
    public static int BC(int n, int r){
        if(n == r || r == 0) return 1;
        return BC(n - 1, r - 1) + BC(n - 1, r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int r = sc.nextInt();
        System.out.println(BC(n, r) % 10007);
    }
}
