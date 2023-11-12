package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 좌표정렬하기_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Coordination> coordinations = new ArrayList<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            coordinations.add(new Coordination(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(coordinations, new Comparation());
    }
}

class Coordination {
    int x, y;

    public Coordination(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Comparation implements Comparator<Coordination> {
    public int compare(Coordination o1, Coordination o2) {
        if (o1.x == o2.x) {
            return Integer.compare(o1.y, o2.y);
        }
        return Integer.compare(o1.x, o2.x);
    }
}