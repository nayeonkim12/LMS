package com.zerobase.lms.member.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Member_entity {
    @Id
    private String userId;

private String userName;
private String phone;
private String password;

private LocalDateTime regDt;


}

//entity로 테이블을 만들고
//repository로 저장