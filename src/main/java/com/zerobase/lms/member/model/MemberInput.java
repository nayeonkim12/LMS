package com.zerobase.lms.member.model;

import lombok.Data; //롬북이 게터세터 만들기 편하게 해줌
import lombok.ToString;

@Data
@ToString
public class MemberInput {


    private String userId;
    private String userName;
    private String password;
    private String phone;


}
