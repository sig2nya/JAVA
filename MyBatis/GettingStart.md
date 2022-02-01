XML에서 SqlSessionFactory 빌드하기
===============================

모든 마이바티스 애플리케이션은 SqlSessionFactory 인스턴스를 사용한다.
SqlSessionFactory인스턴스는 SqlSessionFactoryBuilder를 사용하여 만들수 있다. 
SqlSessionFactoryBuilder는 XML설정파일에서 SqlSessionFactory인스턴스를 빌드할 수 있다.

XML파일에서 SqlSessionFactory인스턴스를 빌드하는 것은 매우 간단한다.
설정을 위해 클래스패스 자원을 사용하는 것을 추천하나 파일 경로나
file:// URL로부터 만들어진 InputStream인스턴스를 사용할 수도 있다. 
마이바티스는 클래스패스와 다른 위치에서 자원을 로드하는 것으로 좀 더 쉽게 해주는
Resources라는 유틸성 클래스를 가지고 있다.

```java
String resource = "org/mybatis/example/mybatis-config.xml";
InputStream inputStream = Resources.getResourceAsStream(resource);
SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
```
