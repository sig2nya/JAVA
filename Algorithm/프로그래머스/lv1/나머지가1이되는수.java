package 프로그래머스.lv1;

public class 나머지가1이되는수 {
    public int solution(int n){
        int answer = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
