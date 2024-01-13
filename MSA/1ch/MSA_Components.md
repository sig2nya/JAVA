MSA 구성요소
============
<img width="479" alt="image" src="https://github.com/sig2nya/JAVA/assets/70207093/df5445fc-139e-4837-ae2f-8c2e22bd4a5c">

 - External GW : API 서버. 프론트에서 API 서버들의 엔드 포인트를 단일화하여 패키징. 인증과 인가 담당 및 라우팅
 - Service Mesh : 서비스 간 통신의 추상화. 추상화를 통한 네트워크 제어, 추적, 안정성, 신뢰성, 보안성 등의 확보
 - Container Management : 대표적으로 k8s(kubernetes)
 - Backing System : 데이터의 지속성과 무결성 담당. 결합도를 낮추며 성능을 담당. 데이터 변경이나 보상 트랜잭션 등의 이벤트를 Message Queue를 통하여 비동기 처리
 - CI/CD Automation : 제공 및 배포에 이르는 Application Life Cycle 전체에 걸쳐 지속적인 자동화 및 모니터링 제공.
 - Telemetry : Monitoring, Logging, Tracing을 통해 MSA의 구조나 성능 파악.

MSA 기반 기술
=============
<img width="588" alt="image" src="https://github.com/sig2nya/JAVA/assets/70207093/8e2d358d-028e-4403-b0fd-3d8c19ea1ad4">
