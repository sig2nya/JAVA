package 프로그래머스.lv1;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int sum = 0; boolean[] check = new boolean[10];
        for(int i = 0; i < numbers.length; i++){
            check[numbers[i]] = true;
        }

        for(int i = 0; i < check.length; i++){
            if(!check[i]) sum += i;
        }
        return sum;
    }
}
