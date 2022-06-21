public class Main {
    static int arr[][];
    static boolean checked[];

    public static void main(String[] args) {
        System.out.println('3' - '1');
    }

    public void DFS(int N){
        checked[N] = true;
        for(int i = 0; i < arr.length; i++){
            if(!checked[i] && arr[N][i] == 1){
                DFS(i);
            }
        }
    }
}
