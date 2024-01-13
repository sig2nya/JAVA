API Gateway Service
===================
1. 기능
- 인증 및 권한 부여
- 서비스 검색 통합
- 응답 캐싱
- 정책, 회로 차단기 및 QoS
- 속도 제한
- 로드밸런싱
- 로깅, 추적, 상관 관게
- 헤더, 쿼리 문자열 및 청구 변환
- IP 허용 목록 추가

2. Netflix Ribbon
- 개요 : Client Side Load Balancer이며, 서비스 이름 기반 호출과 Health Check 수행. 현재, Spring Boot에서 Depreciated 상태.
- Spring Cloud에서 MSA간의 통신
- - RestTemplate
```java
RestTemplate restTemplate = new RestTemplate();
restTemplate.getForObject("http://localhost:8080/", User.class, 200);
```
- - Feign Client
```java
@FeignClient("store")
public interface StoreClient{
  @RequestMapping(method = RequestMethod.GET, value = "/stores")
  List<Store> getStores();
}
```
