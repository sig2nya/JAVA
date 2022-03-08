package math;

import java.util.Scanner;

public class OXQuiz_8958 {
	public static int sol(String args) {
		int result = 0;
		int cnt = 0;
		for(int i = 0; i < args.length(); i++) {
			if(args.charAt(i) != 'X') result += ++cnt;
			else cnt = 0;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result[] = new int[num];
		for(int i = 0; i < num; i++) {
			String OX = sc.next();
			result[i] = sol(OX);
		}
		for(int i = 0; i < result.length; i++) System.out.println(result[i]);
	}

}
