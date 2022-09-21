package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // lombok을 이용하면 log를 자동적으로 사용 가능
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log =" + name); // 이렇게 사용해도 아무문제 없이 동작한다. 하지만, 사용하면 안된다.
        // 왜냐하면, 의미없는 연산이 일어나기 때문이다. 즉, 자원이 낭비가 된다.

        log.trace("trace log = {}", name); // log는 formatting을 {}를 이용하여 한다.
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);
        // 순서대로 로그의 등급이 높아진다.

        return "ok"; // RestController는 REST AIP의 REST, Message Body에 리턴 값을 준다.
    }
}

// 로그의 장점 : 쓰레드 정보, 클래스 이름 등 부가 정보 확인 가능, 정렬 가능, 필요한 정보를 설정으로 조절 가능
// 콘솔에 출력하는 것만 아니라 파일 및 네트워크 등 별도 위치에 남길 수 있다. 성능도 sout보다 더 좋다.
// 실무에서는 꼭 로그를 사용하자.