package com.zerobase.lms.member.controller;

import com.zerobase.lms.member.entity.Member_entity;
import com.zerobase.lms.member.model.MemberInput;
import com.zerobase.lms.member.repository.MemberRepository;
import com.zerobase.lms.member.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;



@Controller
public class MemberController {

	
	private final MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService; // 주입
	}

	@GetMapping("/member/register")
	public String register() {
		return "member/register";
	}

	@PostMapping("/member/register")
	public String registerSubmit(Model model, HttpServletRequest request, HttpServletResponse response, MemberInput parameter) {

//		String userId = request.getParameter("userId");
//		String userName = request.getParameter("userName");
//		String password = request.getParameter("password");
//		String phone = request.getParameter("phone");
//		
		System.out.println(parameter.toString());
		
boolean result = memberService.register(parameter);
model.addAttribute("result", result); //아래의 리턴값을 보고 result를 알려줌
		
		
		return "member/complete";
	}

}
