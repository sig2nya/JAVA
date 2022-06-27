package 인터페이스;

public class NoUseInterfaceA {
    private NoUseInterfaceB b;

    public NoUseInterfaceA(){
        b = new NoUseInterfaceB();
    }

    public void print() {
        int total = b.total();
        System.out.println("No Use Interface Total is " + total);
    }
}