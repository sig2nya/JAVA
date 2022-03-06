POST Request
============
```html
<%@ page contentType="text/html;charset=UTF-8" language="java" %> <--! JSP 페이지를 명시하는 코드 -->

<form action="/jsp/members/save.jsp" method="post">
 username: <input type="text" name="username" />
 age: <input type="text" name="age" />
 <button type="submit">전송</button>
</form>
```
