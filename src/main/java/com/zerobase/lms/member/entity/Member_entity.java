package com.zerobase.lms.member.entity;
//db랑 일대일로 연결시켜주는 엔티티클래스!
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

private boolean emailAuthYN;
private String emailAuthKey;   //비교하는 용, 만들어진 키에 대해 이메일로 보내주고 이메일로 링크를 타고 들어왔으면 맞네, 해서 emailAuthYN을 true로 바꿈

//private LocalDateTime regdt;


}

//entity로 테이블을 만들고
//repository로 저장