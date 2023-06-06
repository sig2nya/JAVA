문자열 연산 메모리 문제
==================
* JAVA의 문자열 하면 String을 주로 사용한다. 문자열들끼리 덧셈을 할 때 간단하게 다음과 같은 방법을 쓴다.
* String끼리의 연산은 메모리의 할당과 해제를 반복한다. 따라서, 성능이 좋지 않다.
* JAVA에서 String 자료형은 변경 불가하다. 하나의 문자열과 다른 문자열을 연결할 때, 새로운 문자열이 생성이 된다.
```java
public class Main
{
    public static void main(String[] args)
    {
        String result2 = "프로그래밍 - ";
        String java = "자바";
        String android = "안드로이드";
        String result = java + android;
        result2 += java += android;
        System.out.println(result);
        System.out.println(result2);
    }

}
```

StringBuilder
=============
* String 객체는 변경 불가한 문자열을 생성하지만, StringBuilder를 통하면 쉽게 변경할 수 있는 문자열 생성이 가능하다.
```java
public class Main{
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    sb.append("문자열").append("연결");
    String str = sb.toString(); // StringBuilder에 담긴 String을 가져오려면, toString() Method를 이용하여 값을 가져온다.
    System.out.println(sb);
    System.out.println(str);
  }
}
```
