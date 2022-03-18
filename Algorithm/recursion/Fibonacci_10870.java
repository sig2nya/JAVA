package recursion;

import java.util.Scanner;

public class Fibonacci_10870 {
    public static int fibonacci(int N){
        if(N <= 2) return 1;
        return fibonacci(N - 2) + fibonacci(N - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N == 0) System.out.println(0);
        else System.out.println(fibonacci(N));
    }
}
