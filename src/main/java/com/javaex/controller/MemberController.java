package com.javaex.controller;

import com.javaex.service.MemberService;
import com.javaex.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    // 회원가입 폼
    @RequestMapping("/joinForm")
    public String joinForm() {
        System.out.println("UserController > joinForm()");

        return "member/joinForm";
    }

    // 회원가입
    @RequestMapping("/join")
    public String join(MemberVo memberVo) {
        System.out.println("MemberController > join()");
        memberService.join(memberVo);

        return "";
    }

    // 로그인 폼
    @RequestMapping("/loginForm")
    public String loginForm() {
        System.out.println("UserController > loginForm()");

        return "member/loginForm";
    }

//     로그인
//    @RequestMapping("/login")
//    public String login(MemberVo memberVo) {
//        System.out.println("MemberController > login()");
//        memberService.login(memberVo);
//
//        return "";
//    }
}
