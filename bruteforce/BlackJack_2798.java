package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BlackJack_2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		int helper = 100000;
		int result[] = new int[3];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int i = 0, j = 1, k = 2;
		
		for(; i < j; i++) {
			for(j = i + 1; j < k; j++) {
				for(k = j + 1; k < N; k++) {
					if((Math.abs(M - (arr[i] + arr[j] + arr[k])) <= helper)) {
						helper = Math.abs(M - (arr[i] + arr[j] + arr[k]));
						result[0] = i; result[1] = j; result[2] = k;
					}
				}
			}
			
		}
		System.out.println(arr[result[0]] + arr[result[1]] + arr[result[2]]);
		/*	if(arr[i] + arr[j] + arr[k] <= M) {
				result = M - (arr[i] + arr[j] + arr[k]);
			} else {
				result = (arr[i] + arr[j] + arr[k]) - M;
			}
		if(세 수를 더해서 M과의 차이가 0에 가까운 것) */
	}

}
// 실패 