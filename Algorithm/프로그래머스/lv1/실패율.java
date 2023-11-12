package 프로그래머스.lv1;

import java.util.HashMap;
import java.util.Map;

public class 실패율 {
    public static void main(String[] args) {
        solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        int members = stages.length;
        int stage = N, j = 1;
        HashMap<Float, Integer> map = new HashMap<>();

        while (j <= N){
            float cnt = 0;

            for (int i = 0; i < stages.length; i++) {
                if (stages[i] != 0 && stages[i] == j) {
                    cnt++;
                    stages[i] = 0;
                }
            }

            map.put(cnt / members, j);
            members -= cnt;
            j++;
        }

        for (Map.Entry<Float, Integer> entry : map.entrySet()) {
            float key = entry.getKey();
            int   value = entry.getValue();
            System.out.println("Key : " + key + " / Value : " + value);
        }

        return answer;
    }

}
