package function;

import java.util.Scanner;

public class Hansu_1065 {
	public static boolean f(int N) {
		int a, b, c;
		a = N / 100;
		b = (N / 10) % 10;
		c = N % 10;
		if((a - b) == (b - c)) {
			return true;			
		} else { return false; }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		if(N < 100) {
			System.out.println(N);
		} else if(N < 1000){
			cnt = 99;
			for(int i = 100; i <= N; i++) {
				if(f(i)) { cnt++; }
			}
			System.out.println(cnt);
		} else { System.out.println(144); }
	}

}
