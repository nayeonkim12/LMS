package com.zerobase.lms.member.controller;

import com.zerobase.lms.member.entity.Member_entity;
import com.zerobase.lms.member.model.MemberInput;
import com.zerobase.lms.member.model.ResetPasswordInput;
import com.zerobase.lms.member.repository.MemberRepository;
import com.zerobase.lms.member.service.MemberService;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Controller
public class MemberController {

	private final MemberService memberService;

	@RequestMapping("/member/login")   //get post 둘 다 받을 수 있게끔
	public String login() {
		return "member/login";
	}
	@GetMapping("/member/find-password")
	public String findPassword() {
		return "member/findPassword";
	}
	
	    

	
	@GetMapping("/member/register")
	public String register() {
		return "member/register";
	}

	@PostMapping("/member/register")
	public String registerSubmit(Model model, HttpServletRequest request, HttpServletResponse response,
			MemberInput parameter) {

		boolean result = memberService.register(parameter);
		model.addAttribute("result", result); // 아래의 리턴값을 보고 result를 알려줌

		return "member/complete";
	}

	// http://www.naver.com/news/list.do?id =123 프로토콜->도메인->파라미터 순서

	@GetMapping("/member/email-auth")
	public String emailAuth(Model model, HttpServletRequest request) {
		String uuid = request.getParameter("id");
		System.out.println(uuid);

		boolean result = memberService.emailAuth(uuid);
		model.addAttribute("result", result); // result값을 html파일에서 판단하여 출력해줌
		return "member/email_auth";

	}

	@GetMapping("/member/info")
	public String memberInfo() {
		return "member/info";

	}
	@GetMapping("/member/reset/password")
	public String resetPassword(Model model, HttpServletRequest request) {
		
		String uuid = request.getParameter("id");
		model.addAttribute("uuid", uuid);
		return "member/reset_password";
	}
		
@PostMapping("/member/reset/password")
public String resetPasswordSubmit(Model model, ResetPasswordInput parameter) {
	
	boolean result = false;
	try {
		result = memberService.resetPassword(parameter.getId(), parameter.getPassword());
	} catch (Exception e) {}
		model.addAttribute("result", result);
	
	return"member/reset_password_result";
}



	@PostMapping("/member/find-password")
    public String findPasswordSubmit(Model model, ResetPasswordInput parameter) {
    
        boolean result = memberService.sendResetPassword(parameter);
        model.addAttribute("result", result);
        
        return "member/find_password_result";
    }
	
	//여기서부터 내가 임의로 한거
	  @GetMapping("/member/main.do")
	    public String main() {
	        
	        return "admin/main";
	        
}
	  
	  @RequestMapping("/error/denied")
	  public String errorDenied() {
	  return "error/denied";

}
}