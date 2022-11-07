package 반복문;

import java.io.*;

public class 영수증_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0; i < cnt; i++){
            String arr[] = br.readLine().split(" ");
            result += Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        }

        System.out.println(result == total ? "Yes" : "No");
    }
}
