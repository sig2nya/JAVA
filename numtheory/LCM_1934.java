package numtheory;

import java.util.Scanner;

public class LCM_1934 {
    public static int GCD(int x, int y){
        if(y == 0) return x;
        else return GCD(y, x % y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result[] = new int[T];
        for(int i = 0; i < T; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            result[i] = (x / GCD(y, x)) * (y / GCD(y, x)) * GCD(y, x);
        }
        for(int i = 0; i < T; i++){
            System.out.println(result[i]);
        }
    }
}
