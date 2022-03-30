    package string;

    import java.util.Scanner;

    public class Changyoung_3028 {
        public static void main(String[] args) {
            int[] check = {1, 0, 0};
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'A'){
                    int tmp = check[0];
                    check[0] = check[1];
                    check[1] = tmp;
                } else if(str.charAt(i) == 'B'){
                    int tmp = check[1];
                    check[1] = check[2];
                    check[2] = tmp;
                } else{
                    int tmp = check[0];
                    check[0] = check[2];
                    check[2] = tmp;
                }
            }

            for(int i = 0; i < check.length; i++){
                if(check[i] == 1) System.out.println(i + 1);
            }
        }
    }
