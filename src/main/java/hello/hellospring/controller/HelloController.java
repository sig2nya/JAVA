package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello") // Client가 hello url을 요청하면 이 곳으로 콘트롤러가 매핑을 함
    public String hello(Model model){
        model.addAttribute("data", "Hello, Spring!!"); // model에다가 데이터 지정
        return "hello"; // hello.html을 찾아서 리턴(thymeleaf 템플릿 엔진 처리)
        // resources:template/ + {ViewName} + '.html'
        // spring-boot-devtools 라이브러리를 추가하면 html 컴파일만 하면 서버 재시작 없이 view 파일 변경 가능
    }

    @GetMapping("hello-mvc")
    public String helloMVC(@RequestParam(value = "name", required = false) String name, Model model){
        model.addAttribute("name", name);
        return "hello-tamplate";
    } // ResponseBody가 없으면 viewResolver가 응답하여 뷰에 그냥 뿌려준다.

    @GetMapping("hello-string")
    @ResponseBody // html body에다가 아래 내용을 넣어주겟다라고 선언하는 것.
    public String helloString(@RequestParam("name") String name){
        return "hello " + name; // name에 parameter를 "hello spring"을 넣으면 클라이언트에 넣어서 반환한다.
        // 이전과의 차이는 view가 없다라는 것. 그냥 들어간다
    }

    @GetMapping("hello-api")
    @ResponseBody // 기본은 JSON 방식으로 넘어감. ResponseBody가 붙어있으면..?
    // 객체가 오면 JSON방식으로 만들어서 HTTP에 반환하겟다 -> HttpMessageConverter가 반응을 한다.
    // JsonConverter : 객체에 대하여 반응. StringConverter : 문자에 대하여 반응
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    } // JSON 방식으로 넘겨준다

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
