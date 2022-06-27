package socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        try{
            Socket socket = new Socket("127.0.0.1", 5050);
            System.out.println("서버와 접속이 되었습니다.");

            InputStream ins = socket.getInputStream();
            DataInputStream dins = new DataInputStream(ins);
            String str= dins.readUTF();
            int number = dins.readInt(); // 정수형형태로 데이터를 읽어오기 위한 메소드
            System.out.println("서버에서 전송된 값 : " + number  );
            System.out.println("서버에서 전송된 문자 : " + str  );

            dins.close();
            ins.close();
            socket.close();
        } catch(ConnectException e){
            System.out.println("연걸이 거절되었습니다.");
        }
    }
}
