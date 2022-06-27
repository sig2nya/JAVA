package 인터페이스;

public class UseInterfaceA {
    private X x;

    public void setX(X x){
        this.x = x;
    }

    public void print(){
        int total = x.total();
        System.out.println("Use Interface Total is " + total);
    }
}
