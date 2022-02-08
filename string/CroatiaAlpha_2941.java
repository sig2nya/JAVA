package string;

import java.util.Scanner;

public class CroatiaAlpha_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String croa[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int answer = 0;
		for(int i = 0; i < input.length(); i++) {
			answer++;
			switch(input.charAt(i)){
			case 'c':
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == '=') {
						i++;
						break;
					}
					else if(input.charAt(i + 1) == '-') {
						i++;
						break;
					}
				}
			case 'd':
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == 'z' && input.charAt(i + 2) == '=') {
						i += 2;
						break;
					}
					else if(input.charAt(i + 1) == '-') {
						i++;
						break;
					}
				}
			case 'l':
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == 'j') {
						i++;
						break;
					}
				}
			case 'n':
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == 'j') {
						i++;
						break;
					}
				}
			case 's':
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == '=') {
						i++;
						break;
					}
				}
			case 'z':
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == '=') {
						i++;
						break;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
