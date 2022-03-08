package programmers;

public class 소수만들기 {
    public static boolean check(int a, int b, int c){
        int cnt = 0;
        for(int i = 2; i < a + b + c; i++){
            if((a + b + c) % i == 0) cnt++;
        }
        if(cnt == 0) return true;
        else return false;
    }

    public static int solution(int[] nums){
        int solution = 0;
        int i = 0, j = 1, k = 2;
        for(; i < j; i++){
            for(j = i+1; j < k; j++){
                for(k = j+1; k < nums.length; k++){
                    if(check(nums[i], nums[j], nums[k])) solution++;
                }
            }
        }
        return solution;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(solution(nums));
    }
}
