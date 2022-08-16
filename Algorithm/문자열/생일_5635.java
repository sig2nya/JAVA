package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 생일_5635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /*User mickey = new User("Mickey", 1, 10, 1991);
        User alice = new User("Alice", 30, 12, 1990);
        User tom = new User("Tom", 15, 8, 1993);
        User jerry = new User("Jerry", 18, 9, 1990);
        User garfield = new User("Garfield", 20, 9, 1990);*/
        ArrayList<User> list = new ArrayList();

        for(int i = 0; i < N; i++){
            String str[] = sc.nextLine().split(" ");
            list.add(new User(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3])));
        }

        /*list.add(mickey);
        list.add(alice);
        list.add(tom);
        list.add(jerry);
        list.add(garfield);*/

        Collections.sort(list, new Comparator<User>() {
            public int compare(User user1, User user2) {
                if(user1.getYear() < user2.getYear()) return 1;
                else if(user1.getYear() > user2.getYear()) return -1;
                else {
                    if(user1.getMonth() < user2.getMonth()) return 1;
                    else if(user1.getMonth() > user2.getMonth()) return -1;
                    else {
                        if(user1.getDay() < user2.getDay()) return 1;
                        else if(user1.getDay() > user2.getDay()) return -1;
                        else return 0;
                    }
                }
            }
        });
        for(User user : list){
            System.out.println(user.getName());
        }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareTo(User o) {
        return this.year - o.year;
    }
}