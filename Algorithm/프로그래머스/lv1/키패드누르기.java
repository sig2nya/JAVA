package 프로그래머스.lv1;

public class 키패드누르기 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l = 0, r = 0;
        boolean check = check(hand);

        for (int i : numbers) {
            switch (numbers[i]){
                case 1, 4, 7:
                    answer += "L";
                    l = numbers[i];
                    break;
                case 3, 6, 9:
                    answer += "R";
                    r = numbers[i];
                    break;
                default:
                    if (Math.abs(numbers[i] - l) > Math.abs(numbers[i] - r)) {
                        answer += "R";
                        r = numbers[i];
                    }
                    else if (Math.abs(numbers[i] - l) < Math.abs(numbers[i] - r)) {
                        answer += "L";
                        l = numbers[i];
                    }

                    if (check) {
                        answer += "R";
                        r = numbers[i];
                    }
                    else {
                        answer += "L";
                        l = numbers[i];
                    }
                    break;
            }

        }

        return answer;
    }

    public boolean check(String hand) {
        if (hand.equals("right")) return true;
        return false;
    }
}
