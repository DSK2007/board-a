package idusw.springboot3.boardthymeleaf;

import idusw.springboot3.boardthymeleaf.domain.Member;
import idusw.springboot3.boardthymeleaf.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardKDSApplicationTests {
    @Autowired
    MemberService memberService;

    @Test
    void contextLoads() {
        Member member = Member.builder()
                .email("12@12.com")
                .name("12")
                .pw("12")
                .build();
        if(memberService.create(member) > 0) // 정상적으로 레코드의 변화가 생기는 경우
            System.out.println("등록 성공");
        else
            System.out.println("등록 실패");
    }

    @Test
    void readMember(){

    }

}
