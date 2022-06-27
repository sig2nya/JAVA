import 인터페이스.NoUseInterfaceA;
import 인터페이스.UseInterfaceA;
import 인터페이스.UseInterfaceB;

public class Main {
    public static void main(String[] args) {
        NoUseInterfaceA a = new NoUseInterfaceA(); // A와 B는 결합력이 매우 높다.
        a.print();

        UseInterfaceA aa = new UseInterfaceA();
        UseInterfaceB bb = new UseInterfaceB();
        aa.setX(bb);

        aa.print();
    }
}
