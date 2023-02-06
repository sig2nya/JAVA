package 현대차.lv1;

import java.util.Scanner;

public class 근무시간 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0, m = 0;

        for(int i = 0; i < 5; i++) {
            String t1[] = sc.next().split(":");
            String t2[] = sc.next().split(":");
            t += Integer.parseInt(t2[0]) - Integer.parseInt(t1[0]);
            if(Integer.parseInt(t2[1]) == Integer.parseInt(t1[1])) m += 0;
            else if(Integer.parseInt(t2[1]) > Integer.parseInt(t1[1])) {
                t--;
                m += 60 - Integer.parseInt(t1[1]) + Integer.parseInt(t2[1]);
            } else {
                m += Integer.parseInt(t2[1]) - Integer.parseInt(t1[1]);
            }
        }

        System.out.println((t * 60) + m);
    }
}
