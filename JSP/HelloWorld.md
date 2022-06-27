```java
@WebServlet("/hello") // 해당 클래스가 WebServlet인 것을 명시(Container에게 알랴줌)
public class HelloWorld extends HttpServlet{
  private static final long serialVersionUID = 1L;
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    response.setContentType("text/html; charset=utf-8");
    PrintWriter out = response.getWriter();
    out.append("<!doctype html><html><head><title>Hello World Servlet</title></head></body>");
    out.append("<h2>Hello World!!</h2><hr>");
    out.append("현재 날짜와 시간은 : " + java.time.LocalDateTime.now());
    out.append("</body></html>");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      doGet(request, response);
    }
}
