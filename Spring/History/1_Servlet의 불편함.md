Servlet을 쓰기 어려운 이유 그리고 Spring이 편한 이유
===================================================
1. /servlet/members/new-form을 통해서 Http Request 발생 : 해당 request 처리를 위한 view page code
```java
@WebServlet(name = "memberFormServlet", urlPatterns = "/servlet/members/new-form")
public class MemberFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter w = response.getWriter();
        w.write("<!DOCTYPE html>\n + " +
                "<html>\n" +
                "<head>\n" +
                        "<meta charset=\"UTF-8\">\n" +
                        "<title>TITLE</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<form action\"/servlet/members/save\" method=\"post\">\n" +
                        "username : <input type=\"text\" name=\"username\" />\n" +
                        "age : <input type=\"text\" name=\"age\" />\n" +
                        "<button type=\"submit\">전송</button>\n" +
                        "</form>\n" +
                        "</body>\n" +
                        "</html>\n");
    }

}
```

2. 1번의 요청 처리를 위한 Servlet과 response
```java
@WebServlet(name = "memberSaveServlet", urlPatterns = "/servlet/members/save")
public class MemberSaveServlet extends HttpServlet {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MemberSaveServlet.service");
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);
        System.out.println("member = " + member);
        memberRepository.save(member);

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter w = response.getWriter();
        w.write("<!DOCTYPE html>\n + " +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>성공</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<ul>\n" +
                "<li>id = " + member.getId() + "</li>\n" +
                "<li>username = " + member.getUsername() + "</li>\n" +
                "<li>age = " + member.getAge() + "</li>\n" +
                "</ul>\n" +
                "<a href=\"/index.html\">메인</a>\n" +
                "</body>\n" +
                "</html>\n");
    }
}
```

3. Response Rendering을 위한 View 작성
```java
@WebServlet(name = "memberListServlet", urlPatterns = "/servlet/members")
public class MemberListServlet extends HttpServlet {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        List<Member> members = memberRepository.findAll();
        PrintWriter w = response.getWriter();

        w.write("<!DOCTYPE html>\n + " +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>TITLE</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<a href=\"/index.html\">메인</a>\n" +
                "<table>\n" +
                "<thead>\n" +
                "<th>id</th>\n" +
                "<th>username</th>\n" +
                "<th>age</th>\n" +
                "</thead>\n" +
                "<tbody>\n");
        for(Member member : members){
            w.write("<tr>\n" +
                    "<td>" + member.getId() + "</td>\n" +
                    "<td>" + member.getUsername() + "</td>\n" +
                    "<td>" + member.getAge() + "</td>\n" +
                    "</tr>\n");
        }
        w.write("</tbody>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>\n");
    }
}
```
 - Servlet은 위와 같이 매우 사용하기 복잡하다.
 - JAVA Code 안에 HTML을 작성해서 Request와 Response를 수행한다.
 - 직접 타이핑을 수행해보자. 개발하기 싫다고 느껴지면 Spring의 중요성을 깨달을 것이다.
