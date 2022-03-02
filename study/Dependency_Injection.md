Dependency Injection(DI)와 @Autowired
=====================================
<h3>1. 의존성 주입</h3>

```java
class A{
  private B b; // A가 B를 가짐. B를 부품으로써 가진다. 이 부품을 Dependency라고 한다. A는 B에 종속된다. 일체형이다. 즉, 결합도가 높아진다.
  public A(){
    b = new B();
  }
}
```
```java
class A{
  private B b; // 
  public void setB(B b){ // Setter를 통하여 원하는 부품을 조립하기 쉽게 만들어준다. 즉, 일체형보다 결합도가 더 낮아진다(느슨한 결합).
    this.b = b;
  }
}

B b = new B(); // Dependency
A a = new A();
a.setB(b); // Dependency Injection. 어떤 객체에 대한 필요한 부품을 갈아 끼우기 유연하다. 원하는대로 조립이 가능해진다. 프로그램이 더 유연해진다.
// 조립을 할 때, Setter와 Constructor를 통하여 Injection이 가능하다.
```
