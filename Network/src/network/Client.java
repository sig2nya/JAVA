package network;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        try{
            Socket socket = new Socket("127.0.0.1", 5050);
            System.out.println("서버와 접속이 되었습니다.");
        } catch(ConnectException e){
            System.out.println("연걸이 거절되었습니다.");
        }
    }
}
