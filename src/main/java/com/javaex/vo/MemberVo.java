package com.javaex.vo;

public class MemberVo {

    private int memberSn;
    private String id;
    private String pw;
    private String name;
    private String joinDate;
    private String hp1;
    private String hp2;
    private String hp3;

    private MemberVo() {

    }

    public int getMemberSn() {
        return memberSn;
    }

    public void setMemberSn(int memberSn) {
        this.memberSn = memberSn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getHp1() {
        return hp1;
    }

    public void setHp1(String hp1) {
        this.hp1 = hp1;
    }

    public String getHp2() {
        return hp2;
    }

    public void setHp2(String hp2) {
        this.hp2 = hp2;
    }

    public String getHp3() {
        return hp3;
    }

    public void setHp3(String hp3) {
        this.hp3 = hp3;
    }

    @Override
    public String toString() {
        return "MemberVo{" +
                "memberSn=" + memberSn +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", hp1='" + hp1 + '\'' +
                ", hp2='" + hp2 + '\'' +
                ", hp3='" + hp3 + '\'' +
                '}';
    }
}
