public class Test {
    public static int check(String bin){
        int cnt = 0;
        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) == '1') cnt++;
        }
        return cnt;
    }
    public static int solution(int n){
        int answer = 0;
        int ncnt = check(Integer.toBinaryString(n)); int cnt = 0;
        n++;

        while(true){
            if(ncnt == check(Integer.toBinaryString(++n))){
                answer = n;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(78));
    }
}
