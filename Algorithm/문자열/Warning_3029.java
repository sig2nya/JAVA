package 문자열;

import java.util.Scanner;

public class Warning_3029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[]  = sc.nextLine().split(":");
        String b[] = sc.nextLine().split(":");
        int h = Integer.parseInt(b[0]) - Integer.parseInt(a[0]);
        int m = Integer.parseInt(b[1]) - Integer.parseInt(a[1]);
        int s = Integer.parseInt(b[2]) - Integer.parseInt(a[2]);

        if(s < 0){
            s += 60;
            m--;
        }

        if(m < 0){
            m += 60;
            h--;
        }

        if(h < 0){
            h += 24;
        }

        System.out.println(String.format("%02d", h) + ":" + String.format("%02d", m) + ":" + String.format("%02d", s));
    }
}
