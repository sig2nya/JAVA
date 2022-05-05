package 정렬;

public class QuickSort {
    public static int[] data = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
    public static int number = data.length;

    public static void show(){
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }

    public static void quickSort(int start, int end){
        if(start >= end) return;

        int key = start;
        int i = start + 1, j = end, tmp;
        while(i <= j){
            while(i <= end && data[i] <= data[key]){
                i++;
            }
            while(j > start && data[j] >= data[key]){
                j--;
            }
            if(i > j){
                tmp = data[j];
                data[j] = data[key];
                data[key] = tmp;
            } else {
                tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
            }
        }
        quickSort(start, j - 1);
        quickSort(j + 1, end);
    }

    public static void main(String[] args) {
        quickSort(0, number - 1);
        show();
    }
}
