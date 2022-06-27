package 클래스;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aaa");

        System.out.println(sb.append("bbb"));
        System.out.println(sb.append(4));

        System.out.println(sb.insert(2, "ccc"));

        System.out.println(sb.replace(3, 5, "ye"));

        System.out.println(sb.substring(5));
        System.out.println(sb.substring(3, 7));

        System.out.println(sb.deleteCharAt(3));

        System.out.println(sb.delete(3, sb.length()));

        System.out.println(sb.toString());

        System.out.println(sb.reverse());

        sb.setCharAt(1, 'b');
        System.out.println(sb);

        sb.setLength(2);
        System.out.println(sb);
    }
}

// StringBuilder를 사용하는 이유는 String Method를 사용하는 것 보다 효율이 좋다.
// 또한, 복잡한 자바의 스트링을 더 쉽게 다룰 수 있게 해주는 것 같다.
// 약간 Python의 문자열 다루는 느낌이랑 비슷하다.