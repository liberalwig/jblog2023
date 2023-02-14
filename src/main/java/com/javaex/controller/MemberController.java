package com.javaex.controller;

import com.javaex.service.MemberService;
import com.javaex.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    // 회원가입 폼
    @RequestMapping("joinForm")
    public String joinForm() {
        System.out.println("UserController > joinForm()");

        return "member/joinForm";
    }

    // 회원가입
    @RequestMapping("join")
    public String join(MemberVo memberVo) {
        System.out.println("MemberController > join()");
        memberService.join(memberVo);

        return "";
    }
}
