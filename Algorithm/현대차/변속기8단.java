package 현대차;

import java.util.Scanner;

public class 변속기8단 {
    public static boolean ascending(int arr[]){
        boolean result = true;
        for(int i = 1; i < 8; i++){
            if(arr[i - 1] < arr[i]) continue;
            else result = false;
        }
        return result;
    }

    public static boolean descending(int arr[]){
        boolean result = true;
        for(int i = 1; i < 8; i++){
            if(arr[i - 1] > arr[i]) continue;
            else result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        if(ascending(arr)) System.out.println("ascending");
        else if(descending(arr)) System.out.println("descending");
        else System.out.println("mixed");
    }
}
