package network.socket;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 5050); // Socket 생성 및 5050 port 연결 요청
        System.out.println("Connection Success");
    }
}
