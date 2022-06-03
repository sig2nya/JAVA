package 이분탐색;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드_10815 {
    static int n, m;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++){
            int num = Integer.parseInt(st.nextToken());
            if(binarySearch(num)) bw.write("1 ");
            else bw.write("0 ");
        }

        bw.close();
        br.close();
    }

    public static boolean binarySearch(int num){
        int left = 0; int right = n - 1;

        while(left <= right){
            int midIndex = (left + right) / 2;
            int mid = arr[midIndex];

            if(num < mid) right = midIndex - 1;
            else if(num > mid) left = midIndex + 1;
            else return true;
        }
        return false;
    }

    /*
    public static boolean search(int num){
        int left = 0; int right = n - 1;

        while(left <= right){
            int midIndex = (left + right) / 2;
            int midValue = arr[midIndex];
            if(num < midValue) right = n - 1;
            else if(num > midValue) left = n + 1;
            else return true;
        }
        return false;
    }
     */
}
