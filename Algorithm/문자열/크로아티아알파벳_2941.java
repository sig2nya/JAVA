package 문자열;

import java.util.Scanner;

public class 크로아티아알파벳_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String check[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str = sc.next();
		for(int i = 0; i < str.length(); i++){
			if(str.contains(check[i])) str = str.replace(check[i], "!");
		}
		System.out.println(str.length());
	}
}
