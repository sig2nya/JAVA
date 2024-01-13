SOA
===
 - 정의 : Service Oriented Architecture. 재사용을 통한 비용 절감. 서비스 공유의 최대화.
 - 기술 방식 : 공통의 서비스를 ESB(Enterprise Service Bus)에 모아 사업 측면에서 공통 서비스 형식으로 제공

MSA
===
 - 정의 : Micro Service Architecture. 서비스 간의 결합도를 낮추어 변화에 능동적으로 대응. 서비스 공유의 최소화.
 - 기술 방식 : 각 독립된 서비스가 노출된 REST API 사용

RESTful API
===========
 - 성숙도 모델
```
LEVEL 0
 - Expose soap web services in rest style
 - http://server/getPosts
 - http://server/deletePosts
 - http://server/doThis
```
```
LEVEL 1
 - Expose resources with proper uri
 - http://server/accounts
 - http://server/accounts/10
```
```
LEVEL 2
 - Level 1 + HTTP Methods
```
```
LEVEL 3
 - Level 2 + HATEOAS
 - DATA + NEXT POSSIBLE ACTIONS
```
