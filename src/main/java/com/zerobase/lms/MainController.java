package com.zerobase.lms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zerobase.lms.member.component.MailComponent;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MainController {

	private final MailComponent mailComponent;

	@RequestMapping("/")
	public String index() {


		
String email = "knyhwhw@naver.com";
String subject = "안녕하세요 제로베이스입니다";
String text = "<p>안녕하세요</p> <p>반갑습미다</p>";

mailComponent.sendMail(email, subject, text);
		return "index";
		// request �뒗 �쎒�뿉�꽌 �꽌踰꾨줈
		// response�뒗 �꽌踰꾩뿉�꽌 �쎒�쑝濡�
	}

	// @RequestMapping("/hello")
	// public String hello(HttpServletRequest request, HttpServletResponse response)
	// throws IOException {
//
//        PrintWriter printWriter = response.getWriter();
//
//        response.setContentType("text/html;charset=UTF-8");
//
//        String msg = "<html>" +
//                "<meta charset='UTF-8'>" +
//                "<head>" +
//                "</head>" +
//                "<body>" +
//                "<p>hello</p> " +
//                "<p>lms website �엯�땲�떎... �븞�뀞</p>" +
//                "</body>" +
//                "</html>";
//
//        printWriter.write(msg);
//        printWriter.close();

}