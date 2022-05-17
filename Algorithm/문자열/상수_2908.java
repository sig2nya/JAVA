package 문자열;

import java.util.Scanner;

public class 상수_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); String b = sc.next();
		StringBuffer sb1 = new StringBuffer(a); StringBuffer sb2 = new StringBuffer(b);
		a = sb1.reverse().toString(); b = sb2.reverse().toString();
		if(Integer.parseInt(a) > Integer.parseInt(b)) System.out.println(a);
		else System.out.println(b);
	}

}
