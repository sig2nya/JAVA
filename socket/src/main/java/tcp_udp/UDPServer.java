package tcp_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket(9999);
            byte[] bf = new byte[30];
            DatagramPacket dp = new DatagramPacket(bf, bf.length);

            while(true){
                try{
                    socket.receive(dp);
                    String rs1 = new String(dp.getData());
                    String rs2 = new String(rs1.trim());
                    System.out.println("주소 : " + dp.getAddress() + " / 포트번호 : " + dp.getPort());
                    System.out.println("수신된 메시지 Client -> Server " + rs2);
                } catch (Exception e){}
            }
        } catch (IOException e){}
    }
}
