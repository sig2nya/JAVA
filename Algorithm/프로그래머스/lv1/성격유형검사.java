package 프로그래머스.lv1;

public class 성격유형검사 {
    public static String solution(String survey[], int choices[]) {
        int R = 0, T = 0, C = 0, F = 0,
            J = 0, M = 0, A = 0, N = 0;

        String tp1 = "R", tp2 = "C", tp3 = "J", tp4 = "A";

        for (int i = 0; i < survey.length; i++) {
            String sur = survey[i];
            String type = survey[i].substring(0, 1);

            if (choices[i] > 4) type = sur.substring(1, 2);

            int score = Math.abs(choices[i] - 4);

            switch (type) {
                case "R" : R += score; break;
                case "T" : T += score; break;

                case "C" : C += score; break;
                case "F" : F += score; break;

                case "J" : J += score; break;
                case "M" : M += score; break;

                case "A" : A += score; break;
                case "N" : N += score; break;
            }
        }

        if (R < T) tp1 = "T";
        if (C < F) tp2 = "F";
        if (J < M) tp3 = "M";
        if (A < N) tp4 = "N";

        return tp1 + tp2 + tp3 + tp4;
    }

//    public static String solution(String survey[], int choices[]) {
//        int R = 0, T = 0, C = 0, F = 0,
//            J = 0, M = 0, A = 0, N = 0;
//
//        for (int i = 0; i < survey.length; i++) {
//            String sur = survey[i];
//
//            String type = sur.substring(0, 1);
//            if (choices[i] > 4) type = sur.substring(1, 2);
//
//            int score = Math.abs(choices[i] - 4);
//
//            switch (type) {
//                case "R" : R += score; break;
//                case "T" : T += score; break;
//
//                case "C" : C += score; break;
//                case "F" : F += score; break;
//
//                case "J" : J += score; break;
//                case "M" : M += score; break;
//
//                case "A" : A += score; break;
//                case "N" : N += score; break;
//            }
//        }
//
//        String tp1 = "R";
//        String tp2 = "C";
//        String tp3 = "J";
//        String tp4 = "A";
//
//        if (R < T) tp1 = "T";
//        if (C < F) tp2 = "F";
//        if (J < M) tp3 = "M";
//        if (A < N) tp4 = "N";
//
//        return tp1 + tp2 + tp3 + tp4;
//    }
}
