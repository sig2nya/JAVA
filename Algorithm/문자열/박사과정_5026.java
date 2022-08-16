package 문자열;

import java.util.Scanner;

public class 박사과정_5026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            String input = sc.next();
            if(input.equals("P=NP")) System.out.println("skipped");
            else {
                String arr[] = input.split("\\+");
                System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
            }
        }
    }
}
