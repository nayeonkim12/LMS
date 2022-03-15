package com.zerobase.lms.member.repository;

import com.zerobase.lms.member.entity.Member_entity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public interface MemberRepository extends JpaRepository<Member_entity, String>{
	
	Optional<Member_entity> findByEmailAuthKey(String EmailAuthKey);

	Optional<Member_entity> findByUserIdAndUserName(String userId, String userName);

	Optional<Member_entity> findByResetPasswordKey(String resetPasswordKey);

}
//인터페이스 만들면 jpa가 자동으로 정보 저장됨