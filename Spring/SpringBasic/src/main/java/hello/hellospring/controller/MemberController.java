package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
/*     private final MemberService memberService;
    // @Autowired private MemberService memberService; // field 주입
    // @Autowired public void setMemberService(MemberService memberService){this.memberService = memberService;}
    // Setter 주입
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }

    @PostMapping("/members/new") // Data를 Form에다가 넘길 때, POST를 쓴다. POST인지 GET인지에 따라 다름
    // 보통 POST는 등록할때, GET은 조회할때 사용한다
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model){

        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }*/
// Spring Container에다가 Spring이 콘트롤러를 만들어서 담아둔다.
// Autowired를 하려면 스프링에게 Service 애노테이션을 이용하여 알려주어야 한다.