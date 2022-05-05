package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JAVAByteCode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String result = "";
        String str = br.readLine();
        for(int i = 0; i < T; i++){
            if(str.charAt(i) == 'A' || str.charAt(i) == 'J' || str.charAt(i) == 'V') continue;
            result += str.charAt(i);
        }

        if(result.length() == 0){
            System.out.println("nojava");
        }else{
            System.out.println(result);
        }
    }
}
