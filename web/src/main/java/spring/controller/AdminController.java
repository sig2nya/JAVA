package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String getAdmin(Model model){
        model.addAttribute("user", "홍길동");
        return "admin/admin";
    }
}
