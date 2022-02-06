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
        model.addAttribute("data", "Hello, Spring!!");
        // model에다가 데이터 지정
        return "hello"; // hello.html을 찾아서 리턴(thymeleaf 템플릿 엔진 처리)
        // resources : template/ + {ViewName} + '.html'
        // spring-boot-devtools 라이브러리를 추가하면 html 컴파일만 하면 서버 재시작 없이 view 파일 변경 가능
    }

    @GetMapping("hello-mvc")
    public String helloMVC(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template"; // resources/template/hello-template.html 실행.
        // Model에 있는 값을 가져오려면, html 내에서 ${}에서 key를 통하여 접근 가능하다.
        // ResponseBody가 없으면 viewResolver가 응답하여 뷰에 그냥 뿌려준다.
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello " + name;
    } // 앞의 엔드포인트와 차이가 없다.

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // HttpMessageConverter가 반응하여 JsonConverter를 호출한다. JSON 형식으로 리턴한다.
    }
    static class Hello{
        private String name;
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
}
/*
    여기서 내가 중요하다고 생각한 것 : RequestBody / ResponseBody에 대해서는 HttpMessageConverter가 반응한다.
    또한, Converter는 각 데이터 형식에 맞게 데이터를 변환하여 반환하여준다.
 */