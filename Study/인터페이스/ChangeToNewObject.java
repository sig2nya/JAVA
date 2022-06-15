package 인터페이스;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ChangeToNewObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        FileInputStream fis = new FileInputStream("인터페이스/setting.txt");
        Scanner sc = new Scanner(fis);

        String className = sc.nextLine();
        System.out.println(className);
        fis.close();
        sc.close();

        UseInterfaceA a = new UseInterfaceA();
        Class clazz = Class.forName(className); // "인터페이스/setting.txt"에 작성된 클래스를 읽어와, 해당 클래스의 인스턴스 생성.

        X x = (X) clazz.getDeclaredConstructor().newInstance();
        a.setX(x);
        a.print();
    }
}
