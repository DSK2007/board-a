package idusw.springboot3.boardthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    /*
    @Autowired
    MemoService memoService;  // MemoService 인터페이스의 구현체를 필드 주입
    // Hello
     */

    @GetMapping
    public String goHome() {
        return "/main/index";
    }
    @GetMapping("/buttons")
    public String goButtons() {
        return "/main/buttons";
    }
    @GetMapping("/cards")
    public String goCards() {
        return "/main/cards";
    }
}
