Thymeleaf Spring Integration
============================
1. thymeleaf의 경우 스프링 없이 동작하지만, 스프링과의 통합을 위한 다양한 기능을 제공 -> Spring 개발자가 thymeleaf를 선택하는 이유
2. thymeleaf integration으로 추가되는 기능
 - SpringEL 문법 통합
 - ${@myBean.doSomething()}처럼 Spring Bean 호출 지원
 - 편리한 폼 관리를 위한 추가 속성
 - - th:object
 - - th:field, th:errors, th:errorclass
 - form component 기능 : checkbox, radio button, List 등을 편리하게 사용할 수 있는 기능 지원
 - Spring 메시지, 국제화 기능의 편리한 통합
 - Spring 검증 / 오류 처리 통합
 - Spring의 변환 서비스 통합
