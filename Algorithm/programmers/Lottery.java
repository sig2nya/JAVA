package programmers;

public class Lottery {
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int win = 0;
		int un = 0;
		for(int i = 0; i < 6; i++) {
			if(lottos[i] == 0) un++;
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(lottos[i] == win_nums[j]) win++;
			}
		}
		if(un+win == 6) answer[0] = 1;
		else if(un+win == 5) answer[0] = 2;
		else if(un+win == 4) answer[0] = 3;
		else if(un+win == 3) answer[0] = 4;
		else if(un+win == 2) answer[0] = 5;
		else answer[0] = 6;
		
		if(win == 6) answer[1] = 1;
		else if(win == 5) answer[1] = 2;
		else if(win == 4) answer[1] = 3;
		else if(win == 3) answer[1] = 4;
		else if(win == 2) answer[1] = 5;
		else answer[1] = 6;
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		int[] answer = solution(lottos, win_nums);
		System.out.println(answer[0] + " " + answer[1]);
	}

}
