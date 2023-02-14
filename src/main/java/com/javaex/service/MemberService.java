package com.javaex.service;

import com.javaex.dao.MemberDao;
import com.javaex.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberDao memberDao;

    public void join(MemberVo memberVo) {
        System.out.println("MemberService > join()");
        memberDao.memberInsert(memberVo);
    }
}
