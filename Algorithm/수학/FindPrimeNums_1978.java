package 수학;

import java.util.Scanner;

public class FindPrimeNums_1978 {
    public static boolean finding(int num){
        if(num == 1) return false;
        int check = 0;
        for(int i = 2; i <= num; i++){
            if(num % i == 0){
                check++;
            } else{
                continue;
            }
        }
        // System.out.println(check);
        if(check == 1) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for(int i = 0; i < N; i++){
            if(finding(arr[i]) == true){
                result++;
            }
        }

        System.out.println(result);
    }
}
