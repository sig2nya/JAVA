package programmers;

public class 키패드누르기 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String right = "11", left = "10";
        String hands = "right";
        String answer = "";
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1 || nums[i] == 4 || nums[i] == 7){
                left = Integer.toString(nums[i]);
                answer += "L";
            } else if(nums[i] == 3 || nums[i] == 6 || nums[i] == 9){
                right = Integer.toString(nums[i]);
                answer += "R";
            } else if(Math.abs(nums[i] - Integer.parseInt(left)) > Math.abs(Integer.parseInt(right) - nums[i])){
                right = Integer.toString(nums[i]);
                answer += "R";
            } else if(Math.abs(nums[i] - Integer.parseInt(left)) < Math.abs(Integer.parseInt(right) - nums[i])){
                left = Integer.toString(nums[i]);
                answer += "L";
            } else if(Math.abs(nums[i] - Integer.parseInt(left)) == Math.abs(Integer.parseInt(right) - nums[i])){
                if(hands.equals("right")) {
                    right = Integer.toString(nums[i]);
                    answer += "R";
                } else {
                    left = Integer.toString(nums[i]);
                    answer += "L";
                }
            }
        }
        System.out.println(answer);
    }
}
