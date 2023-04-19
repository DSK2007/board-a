package idusw.springboot.boradthymleaf.controller;

import idusw.springboot.boradthymleaf.service.MemberService;
import idusw.springboot.boradthymleaf.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MemberController {
    MemberService memberService;
    public MemberController(MemoService memoService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/login")
    public String getLoginform() {
        return "/members/login";
    }

    @PostMapping("/members/login")
    public String postLogin() {
        return "redirect:/";
    }
    @GetMapping("/members/register")
    public String getRegisterform() {
        return "/members/register";
    }
    @PostMapping("/members/register")
    public String postRegister() {
        return "redirect:/";
    }

}
