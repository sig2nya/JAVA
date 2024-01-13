Service Discovery Pattern
=========================
1. 정의 : MSA 환경 위에서 서로간의 서비스를 호출하기 위해, 각 서비스의 IP와 PORT는 필수입니다. 따라서, 서비스를 호출하기 위한 매커니즘이 필요합니다.
2. Service Registry
 - 사용 가능한 서비스 인스턴스의 목록을 관리하고, 서비스 등록 / 해제 / 조회 등을 할 수 있는 API를 제공합니다.
 - 기본적으로, 서비스 등록 및 서비스 목록을 관리하지만, Health Check를 통해 가용한 서비스 목록만 Display 한다던가, 로드밸런싱을 수행하는 등 스케일 업이 가능합니다.
<img width="517" alt="image" src="https://github.com/sig2nya/JAVA/assets/70207093/1e8ce908-4a37-4dce-b393-57f6b8c7d9d6">

3. 예시
- Spring Boot의 Eureka Server. Eureka Server를 통해 사용 가능한 서비스 목록을 조회합니다. 또한, Eureka Server는 여러 서비스 인스턴스를 관리합니다.
<img width="1268" alt="image" src="https://github.com/sig2nya/JAVA/assets/70207093/cf468948-fbc5-4a10-93a6-9e1f26beb08b">
