package string;

import java.util.Scanner;

public class CountsOfAlpha_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[26];
        String a = sc.nextLine();
        for(int i = 0; i < a.length(); i++){
            arr[(int)a.charAt(i) - 97]++;
        }
        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
