package tcp_udp;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UDPClient {
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket();
            InetAddress ia = InetAddress.getByName("localhost");
            byte[] bf = args[0].getBytes();
            DatagramPacket dp = new DatagramPacket(bf, bf.length, ia, 9999);

            socket.send(dp);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
