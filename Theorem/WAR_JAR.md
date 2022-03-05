JAR vs WAR 
==========
* JAR와 WAR : JAR / WAR는 둘다 Archive 파일이다. 애플리케이션을 간단히 배포하고 구동할 수 있도록 관련 파일들을 하나로 패키징 한 것이다. JAVA 애플리케이션 배포와 구동을 위한 zip file이라고 생각하면 될 것 같다,

JAR(JAVA ARchive)
=================
* 정의 : JAVA에서 필요로 하는 클래스 파일과 관련 리소스 파일을 모아놓은 파일 포맷이다. 쉽게 말해, JAVA가 실행되기 위해 필요로 하는 파일들의 묶음(Archive)이다.
* 사용 이유 : JAR파일의 경우 WAR와 다르게, 하나의 예를 들어서 설명하자면 .zip 파일을 '압축 풀기' 과정 없이 사용할 수 있다고 한다.

WAR(Web Application ARchive)
============================
* 정의 : 이름에서도 알 수 있다. Web Application을 구동시키기 위한 자원을 모아놓은 파일 묶음이다. WAS가 존재해야 구동 가능하다고 한다. WAS를 이용할 때에는 WAR를 보통 많이 사용하는 것 같다.
* web.xml : Deployment Discription, web.xml에서 WAR에 대한 PATH를 따로 설정해주어야 WAR가 사용 가능하다. WAS가 web.xml을 읽고 다양한 설정들을 진행해준다.
* * 참고 : web.xml에서 서블릿 매핑과 같은 관련 설정도 가능하다.
