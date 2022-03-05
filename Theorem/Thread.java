

public class Thread extends java.lang.Thread {
    int seq;
    public Thread(int seq){
        this.seq = seq;
    }

    public void run(){
        System.out.println(this.seq + " Thread start");
        try{
            Thread.sleep(1000); // 1초
        } catch (Exception e) {

        }
        System.out.println(seq + "Thread is ended");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Thread t = new Thread(i);
            t.start();
        }
        System.out.println("Main ended");
    }
}

// Main이 종료되었음에도 불구하고, Thread가 이후게 종료되거나 시작된다.
