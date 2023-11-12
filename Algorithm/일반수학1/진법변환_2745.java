package 일반수학1;

import java.util.Scanner;

public class 진법변환_2745 {
    public static int convertToDecimal(String number, int base){
        int decimal = 0, power = 0;

        for (int i = number.length() - 1; i > -1; i--) {
            int digit = Character.digit(number.charAt(i), base);
            decimal += digit * Math.pow(base, power);
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int base = sc.nextInt();

        int result = convertToDecimal(number, base);
        System.out.println(result);
    }
}
