package idusw.springboot3.boardthymeleaf.controller;

import idusw.springboot3.boardthymeleaf.domain.Member;
import idusw.springboot3.boardthymeleaf.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/members")
public class MemberController {
    // Constructor DI(Dependency Injection)
    MemberService memberService;
    public MemberController(MemberService memberService) { // Spring Framework이 주입(하도록 요청함)
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String getLoginform() { // 로그인 처리 : service + repository 활용
        return "/members/login";
    }

    @PostMapping("/login")
    public String loginMember() { // 로그인 처리 -> service - > repository -> service -> controller
        return "redirect:/";
    }

    @GetMapping("/register")
    public String getRegisterform(Model model) { // form 요청 -> view (template engine)
        model.addAttribute("member", Member.builder().build());
        return "/members/register";
    }
    @PostMapping("/register")
    public String createMember(@ModelAttribute("member") Member member, Model model) { // 등록 처리 -> service - > repository -> service -> controller
        if (memberService.create(member) > 0 ) // 정상적으로 레코드의 변화가 발생하는 경우 영향받는 레코드 수를 반환
            return "redirect:/";
        else
            return "/main/error";
    }

    @GetMapping("/{seq}")
    public String getMember(@PathVariable("seq") Long seq, Model model) {
        Member result = new Member(); // 반환
        Member m = new Member(); // 매개 변수로 전달
        m.setSeq(seq);
        result = memberService.read(m);
        // MemberService가 MemberRepository에게 전달
        // MemberRepository가 JpaRepository 인터페이스의 구현체를 활용할 수 있음
        model.addAttribute("attr", result);
        return "/members/detail";
    }

    @GetMapping("/update")
    public String getUpdateform() { // form 요청 -> view (template engine)
        return "/members/update";
    }
    @PutMapping("/update")
    public String updateMember() { // 등록 처리 -> service - > repository -> service -> controller
        return "redirect:/";
    }

    @DeleteMapping("/delete")
    public String deleteMember() { // 등록 처리 -> service - > repository -> service -> controller
        return "redirect:/";
    }

    @GetMapping("/forgot")
    public String getForgotform() { // 분실 비밀번호 처리 요청 -> view
        return "/members/forgot-password";
    }
    @PostMapping("/forgot")
    public String forgotMemberPassword() { // 비밀번호 갱신 -> service - > repository -> service -> controller
        return "redirect:/"; // 루트로 이동
    }
}
