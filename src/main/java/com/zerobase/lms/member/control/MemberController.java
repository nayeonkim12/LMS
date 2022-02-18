package com.zerobase.lms.member.control;

import com.zerobase.lms.member.entity.Member_entity;
import com.zerobase.lms.member.model.MemberInput;
import com.zerobase.lms.member.repository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;


@Controller
public class MemberController {

    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository){
        this.memberRepository = memberRepository;  //주입
   }

@GetMapping("/member/register")
    public String register() {
return "member/register";
}

@PostMapping("/member/register")
    public String registerSubmit(HttpServletRequest request, HttpServletResponse response, MemberInput parameter) {


System.out.println(parameter.toString());

Member_entity member = new Member_entity();
member.setUserId(parameter.getUserId());
member.setUserName(parameter.getUserName());
member.setPhone(parameter.getPhone());
member.setPassword(parameter.getPassword());
member.setRegDt(LocalDateTime.now());

memberRepository.save(member);

    return "member/register_complete";
}

}
