package recursion;

import java.util.Scanner;

public class Factorial_10872 {
    public static int factorial(int N){
        if(N <= 1) return 1;
        return N * factorial(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(factorial(N));
    }
}
