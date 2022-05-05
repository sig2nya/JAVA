package 문자열;

import java.util.Scanner;

public class Dial_5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int answer = 0;
		for(int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A' : answer += 3; break;
			case 'B' : answer += 3; break;
			case 'C' : answer += 3; break;
			case 'D' : answer += 4; break;
			case 'E' : answer += 4; break;
			case 'F' : answer += 4; break;
			case 'G' : answer += 5; break;
			case 'H' : answer += 5; break;
			case 'I' : answer += 5; break;
			case 'J' : answer += 6; break;
			case 'K' : answer += 6; break;
			case 'L' : answer += 6; break;
			case 'M' : answer += 7; break;
			case 'N' : answer += 7; break;
			case 'O' : answer += 7; break;
			case 'P' : answer += 8; break;
			case 'Q' : answer += 8; break;
			case 'R' : answer += 8; break;
			case 'S' : answer += 8; break;
			case 'T' : answer += 9; break;
			case 'U' : answer += 9; break;
			case 'V' : answer += 9; break;
			case 'W' : answer += 10; break;
			case 'X' : answer += 10; break;
			case 'Y' : answer += 10; break;
			case 'Z' : answer += 10; break;
			}
		}
		System.out.println(answer);
	}

}
