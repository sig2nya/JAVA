package socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServer {
    public static void main(String[] args) throws IOException {
        int port = 5050;
        int number = Integer.parseInt(args[0]);
        String str = new String(args[1]);
        ServerSocket ssk = new ServerSocket(port); // ServerSocket 설정

        System.out.println("접속 대기중...");


        while(true){
            Socket socket = ssk.accept();
            System.out.println("사용자 접속 완료.");
            System.out.println("Client IP : " + socket.getInetAddress());

            OutputStream ous = socket.getOutputStream();
            DataOutputStream dous = new DataOutputStream(ous);

            dous.writeUTF(str);
            dous.writeInt(number);
            dous.flush();
            dous.close();
            socket.close();
        }
    }
}
