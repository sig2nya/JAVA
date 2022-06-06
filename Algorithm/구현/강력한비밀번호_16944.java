package 구현;

import java.util.Scanner;

public class 강력한비밀번호_16944 {
    public static boolean len(int len){
        boolean result = false;
        if(len > 5) result = true;
        return result;
    }

    public static boolean num(String id){
        boolean result = false;
        for(int i = 0; i < id.length(); i++){
            if(Character.isDigit(id.charAt(i))) result = true;
        }
        return result;
    }

    public static boolean lower(String id){
        boolean result = false;
        for(int i = 0; i < id.length(); i++){
            if(Character.isLowerCase(id.charAt(i))) result = true;
        }
        return result;
    }

    public static boolean upper(String id){
        boolean result = false;
        for(int i = 0; i < id.length(); i++){
            if(Character.isUpperCase(id.charAt(i))) result = true;
        }
        return result;
    }

    public static boolean special(String id){
        boolean result = false;
        String arr[] = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"};
        for(int i = 0; i < arr.length; i++){
            if(id.contains(arr[i])) result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); String id = sc.next();
        int result = 0;
        if(!len(N)) result++;
        if(!num(id)) result++;
        if(!upper(id)) result++;
        if(!lower(id)) result++;
        if(!special(id)) result++;
        System.out.println(result);
    }
}
