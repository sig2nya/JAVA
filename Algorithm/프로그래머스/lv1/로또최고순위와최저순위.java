package 프로그래머스.lv1;

import java.util.Arrays;

public class 로또최고순위와최저순위 {
    public static int[] solution(int[] lottos, int[] win_nums){
        int[] answer = {6, 6};
        int cnt = 0;
        Arrays.sort(lottos); Arrays.sort(win_nums);

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == win_nums[i]) answer[1]--;
            if (lottos[i] == 0) cnt++;
        }

        answer[0] = Math.abs(answer[1] - cnt);
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        System.out.println(answer[0] + " " + answer[1]);
    }
}
