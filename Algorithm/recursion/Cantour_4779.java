package recursion;

import java.util.Scanner;

public class Cantour_4779 {
    static int N;
    static int size;
    static char arr[];

    public static void left(int N){
        if(N == 0) return;
        size = (int)Math.pow(3, N);
        int limit = size / 3;
        for(int i = 0; i < limit; i++){
            arr[i] = '-';
        }

        for(int i = limit; i < limit * 2; i++){
            arr[i] = ' ';
        }

        for(int i = limit * 2; i < size; i++){
            arr[i] = '-';
        }
        left(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        size = (int) Math.pow(3, N);
        arr = new char[size];
        left(N);
        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + "");
    }
}
