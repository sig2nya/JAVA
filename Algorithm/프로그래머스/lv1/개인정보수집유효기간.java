package 프로그래머스.lv1;

import java.util.HashMap;

public class 개인정보수집유효기간 {
    public static void main(String[] args) {
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies =  {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        int test[] = solution(today, terms, privacies);
        for(int i : test) System.out.println(i);
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[privacies.length];
        String[] tmp = today.split("\\.");
        HashMap<String, Integer> map = new HashMap<>();

        int t_year = Integer.parseInt(tmp[0]);
        int t_month = Integer.parseInt(tmp[1]);
        int t_day = Integer.parseInt(tmp[2]);

        for (int i = 0; i < terms.length; i++) {
            String[] type = terms[i].split(" ");
            map.put(type[0], Integer.parseInt(type[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String privacy_tmp[] = privacies[i].split(" ");
            String date[] = privacy_tmp[0].split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            int days = 28 * map.get(privacy_tmp[1]);

            do {
                if (month > 12) {
                    year++;
                    month = 1;
                    continue;
                }
                if (day > 28) {
                    month++;
                    day = 1;
                    continue;
                }
                days--;
                day++;
            } while (days > 1);

            if (day == 29) {
                day = 1;
                month++;
            }

            if (month == 13) {
                month = 1;
                year++;
            }


            if (t_year <= year) {
                if (t_month <= month) {
                    if (t_day <= day) {
                        answer[i] = i + 1;
                    }
                }
            }
        }

        return answer;
    }
}