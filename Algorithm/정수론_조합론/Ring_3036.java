package 정수론_조합론;

import java.util.Scanner;

public class Ring_3036 {
    public static int GCD(int x, int y){ // 유클리드 호제법
            if(y == 0) return x;
            else return GCD(y, x % y);
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int arr[] = new int[N];
            String result[] = new String[N-1];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 1; i < N; i++){
                result[i - 1] = (arr[0] / GCD(arr[0], arr[i])) + "/" + (arr[i] / GCD(arr[0], arr[i]));
            }

            for(int i = 0; i < N - 1; i++){
                System.out.println(result[i]);
            }

    }

}
