## 1. Spring의 비동기 처리
 - Spring에서 비동기 처리를 위해서는 @RequestBody와 @ResponseBody를 사용해야 한다.
 - <b>클라이언트와 서버의 비동기 통신 방법</b>
    - Request : 클라이언트에서 서버로 요청하는 메시지를 request라 한다.
    - Response : 서버에서 클라이언트로 통신하는 메시지를 response라 한다.
    - Body(본문) : 클라이언트와 서버가 통신할 때, 본문에 메시지를 담아서 보낸다. 
   이때, 메시지가 담기는 부분이 바로 본문이 된다. 즉, RequestBody는 클라이언트에서 서버로,
   ResponseBody는 서버에서 클라이언트로 전송이 된다. 
    - 이때, 본문에 담기는 메시지는 보통 JSON 형식으로 데이터를 주고 받는다.
***
## 2. JSON(JavaScrpit Object Notation)이란? 
### Data Type
```javascript
var json = { "key1" : "value1", "key2" : "value2" }
// JavaScript의 객체 형식
```
 - Key - Value 한 쌍으로 이루어진 Data Object를 전달하기 위한 데이터 포멧
 - Http 통신 내에서, 데이터를 주고받을 때 사용.
***
## 3.@RequestBody / @ResponseBody
 - Spring에서도 클라이언트의 요청을 컨트롤러에서 DOM 객체나 JAVA 객체로 변환하여 송수신이 가능하다.
 - @RequestBody 어노테이션과 @ResponseBody 어노테이션이 각각 HTTP요청 바디를 자바 객체로 변환하고 
자바 객체를 다시 HTTP 응답 바디로 변환해준다.
 - <b> @RequestBody를 통하여 자바 객체로 Conversion이 이루어진다. 이때, <span style="color:green"">HttpMessageConverter(*중요)</span>에서 변환이 이루어진다.</b>
 - <b> RequestMappingHandlerAdpter 에는 HttpMessageConverter 타입의 메세지 변환기가 여러개 등록되어 있다.</b>