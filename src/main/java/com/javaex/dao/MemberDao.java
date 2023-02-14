package com.javaex.dao;

import com.javaex.vo.MemberVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

    @Autowired
    SqlSession sqlSession;

    public void memberInsert(MemberVo memberVo) {
        System.out.println("MemberDao > join()");
        sqlSession.insert("member.memberInsert", memberVo);
    }
}
