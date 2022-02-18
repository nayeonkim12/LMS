package com.zerobase.lms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    //매핑하기 위해 만든 클래스
    //주소(논리적 인터넷 주소)와 물리적인 파일을 매핑

    //하나의 주소에 대해서 어디서 누가 매핑??
    //후보: 클래스, 속성, 메소드 중 메소드가 적합


    @RequestMapping("/")
    public String index() {
        return "index";

        //request 는 웹에서 서버로
        //response는 서버에서 웹으로
    }

   // @RequestMapping("/hello")
    //public String hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
//                "<p>lms website 입니다... 안녕</p>" +
//                "</body>" +
//                "</html>";
//
//        printWriter.write(msg);
//        printWriter.close();


    }