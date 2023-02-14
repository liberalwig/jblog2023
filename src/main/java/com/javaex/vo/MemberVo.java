package com.javaex.vo;

public class MemberVo {

    private int memberSn;
    private String id;
    private String pw;
    private String name;
    private String joinDate;
    private int hp1;
    private int hp2;
    private int hp3;

    private MemberVo() {

    }

    public MemberVo(int memberSn, String id, String pw, String name, String joinDate, int hp1, int hp2, int hp3) {
        this.memberSn = memberSn;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.joinDate = joinDate;
        this.hp1 = hp1;
        this.hp2 = hp2;
        this.hp3 = hp3;
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

    public int getHp1() {
        return hp1;
    }

    public void setHp1(int hp1) {
        this.hp1 = hp1;
    }

    public int getHp2() {
        return hp2;
    }

    public void setHp2(int hp2) {
        this.hp2 = hp2;
    }

    public int getHp3() {
        return hp3;
    }

    public void setHp3(int hp3) {
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
                ", hp1=" + hp1 +
                ", hp2=" + hp2 +
                ", hp3=" + hp3 +
                '}';
    }


}
