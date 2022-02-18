package dp;

import java.io.*;

public class Fibonacci_1003 {
    public static int zero = 0, one = 0;
    public static int fibonacci(int n) {
        if (n == 0) {
            zero++;
            return 0;
        } else if (n == 1) {
            one++;
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] numbs = new int[T];
        int result[][] = new int[T][2];
        for(int i = 0; i < T; i++){
            numbs[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < T; i++){
            fibonacci(numbs[i]);
            result[i][0] = zero; result[i][1] = one;
            zero = 0; one = 0;
        }

        for(int i = 0; i < T; i++){
            bw.write(result[i][0] + " " + result[i][1] + "\n");
        }
    }
}
