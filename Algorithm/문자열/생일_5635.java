package 문자열;

import java.util.Scanner;

public class 생일_5635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User Mickey = new User("Mickey", 1, 10, 1991);
        User Alice = new User("Alice", 30, 12, 1990);

        int test = Alice.compareTo(Mickey);
        System.out.println(test);
    }
}

class User implements Comparable<User>{
    private String name;
    private int day, month, year;
    User(String name, int day, int month, int year){
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int compareTo(User o) {
        return this.year - o.year;
    }
}