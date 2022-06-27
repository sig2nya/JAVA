package 프로그래머스.lv1;

public class 음양더하기 {
    public static int main(int[] absolutes, boolean[] signs){
        int sum = 0;
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                sum += absolutes[i];
            } else {
                sum += absolutes[i] * (-1);
            }
        }
        return sum;
    }
}
