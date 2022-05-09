package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분해합_2231 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i = 1; i < N; i++) {
			int check = i;
			int sum = 0;
			while(check > 0) {
				sum += check % 10;
				check /= 10;
			}
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
