## 1. IoC(Inversion Of Control) - 제어의 역전
 : Spring IoC Container가 관리하는 객체를 Bean이라고 한다. Bean을 알아보기 전에, IoC에 대해 알아보자.
> * 일반적으로 처음에 배우는 자바 프로그램에서는 각 객체들이 프로그램의 흐름을 결정하고 각 객체를 직접 생성하고 조작하는 작업(객체를 직접 생성하여 메소드 호출)을 했습니다. 
    즉, 모든 작업을 사용자가 제어하는 구조였습니다. 예를 들어 A 객체에서 B 객체에 있는 메소드를 사용하고 싶으면, B 객체를 직접 A 객체 내에서 생성하고 메소드를 호출합니다. 
> * 하지만 IoC가 적용된 경우, 객체의 생성을 특별한 관리 위임 주체에게 맡깁니다. 
    이 경우 사용자는 객체를 직접 생성하지 않고, 객체의 생명주기를 컨트롤하는 주체는 다른 주체가 됩니다. 즉, 사용자의 제어권을 다른 주체에게 넘기는 것을 IoC(제어의 역전)라고 합니다.
* <b>우리가 알던 기존의 Java Programming 에서는 Class를 생성하고 new를 입력하여 원하는 객체를 직접 생성한 후에 사용했었습니다. 
하지만 Spring에서는 직접 new를 이용하여 생성한 객체가 아니라, Spring에 의하여 관리당하는 자바 객체를 사용합니다. 이렇게 Spring에 의하여 생성되고 관리되는 자바 객체를 Bean이라고 합니다. 
* Spring Framework 에서는 Spring Bean 을 얻기 위하여 ApplicationContext.getBean() 와 같은 메소드를 사용하여 Spring 에서 직접 자바 객체를 얻어서 사용합니다.</b>