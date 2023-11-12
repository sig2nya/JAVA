package 프로그래머스.lv1;

import java.util.*;

public class Test {
    public static String solution(String survey[], int choices[]) {
        String answer = "";
        int R = 0, T = 0,
            C = 0, F = 0,
            J = 0, M = 0,
            A = 0, N = 0;

        String tp1 = "R", tp2 = "C", tp3 = "J", tp4 = "A";

        for (int i = 0; i < survey.length; i++) {
            String tmp = survey[i].substring(0, 1);

            if (choices[i] > 4) tmp = survey[i].substring(1, 2);

            int score = Math.abs(choices[i] - 4);

            switch (tmp) {
                case "R" : R += score; break;
                case "T" : T += score; break;
            }
        }

        if (T > 4) tp1 = "T";
        if (F > 4) tp1 = "F";
        if (M > 4) tp1 = "M";
        if (N > 4) tp1 = "N";

        answer = tp1 + tp2 + tp3 + tp4;
        return answer;
    }
    public static void main(String[] args) {

    }
}
