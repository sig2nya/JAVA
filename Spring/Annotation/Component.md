Component
=========
```java
@Component
 - @Component를 사용하면 Bean Configuration에 Bean을 따로 등록하지 않아도 된다
 - @Component는 타입 기반의 자동주입 애노테이션이다.
 - @Autowired, @Resource와 비슷한 기능
```

```html
<?xml version="1.0" encoding="UTF-8">
<beans xmlns = "http://www.springframework.org/schema/beans"
      xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
      xmlns:context = "http://www.springframework.org/schema/context"
      xsi:schemaLocation = "http://www.springframework.org/schema/beans
                            http://www.springframework.org/schema/spring-beans.xsd
                            http://www.springframework.org/schema/context
                            http://www.springframework.org/schema/context/spring-context.xsd">
      <context:annotation-config/>
      <context:component-scan base-package="hello.servlet.web.spring"></context:component-scan>
</beans>

 - 위와 같이 xml로 bean을 등록한다. 복잡해보인다.
```
