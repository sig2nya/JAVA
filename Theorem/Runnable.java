import java.util.ArrayList;

public class Runnable implements java.lang.Runnable {
    int seq;

    public Runnable(int seq){
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + " thread starts");
        try{
            Thread.sleep(1000);
        } catch (Exception e){

        }
        System.out.println(this.seq + " thread ended");
    }

    public static void main(String[] args) {
        ArrayList<java.lang.Thread> threads = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            java.lang.Thread t = new java.lang.Thread(new Runnable(i));
            t.start();
            threads.add(t);
        }

        for(int i =0; i < threads.size(); i++){
            java.lang.Thread t = threads.get(i);
            try{
                t.join();
            } catch (Exception e){

            }
            System.out.println("main ended");
        }
    }
}
