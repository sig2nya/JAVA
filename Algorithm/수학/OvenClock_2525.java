package 수학;


import java.util.Scanner;

public class OvenClock_2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); int m = sc.nextInt();
        int C = sc.nextInt();
        h += C / 60;
        m += C % 60;
        if(h >= 24) h = h - 24;
        if(m >= 60) {
            h++; if(h == 24) h = 0;
            m %= 60;
        }
        System.out.println(h + " " + m);
    }
}
