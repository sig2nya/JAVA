* Reference : https://jwt.io/introduction / https://ehdvudee.tistory.com/14

HTTP Stateful vs Stateless
==========================
* HTTP : Stateless Protocol. Request < = > Response 요청이 이루어지고, 응답하는데 있어서 상태가 없다는 의미
* Stateless로 인하여 발생하는 문제점 : 로그인 정보, 장바구니 상태 등의 저장이 어려움. 또한, 빈번한 IO 발생으로 인해 성능 저하.

Json WEB Token
==============
* JWT는 Stateless 상태에서 식별 / 인증 / 허가를 위한 모델
* JWT를 통하여 서버 리소스에 접근하는 대상에 대해 식별 / 인증 / 허가를 수행
* JWT의 구조는 다음과 같다.
<img width="394" alt="image" src="https://user-images.githubusercontent.com/70207093/174748968-a08b241a-e2f4-4f36-948f-70d3c283bb2d.png">

* 크게, Header / Payload / Signature로 구성된다.
* 1) Header : 토큰의 무결성을 위한 값
* 2) Payload : 토크의 유효성 검사 및 비즈니스 로직에서 사용하는 정보
* 3) Signature : 토큰의 인증
* 위의 3가지 요소들에 대한 구분자로는 '.'(온점)을 사용
