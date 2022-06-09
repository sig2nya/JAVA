package 구현;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 오늘날짜_10699 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(today));
    }
}
