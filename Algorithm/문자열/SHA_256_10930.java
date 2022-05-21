package 문자열;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA_256_10930 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(sha256(sc.next()));
    }

    public static String sha256(String msg) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(msg.getBytes());
        return bytesToHex(md.digest());
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b: bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }
}
