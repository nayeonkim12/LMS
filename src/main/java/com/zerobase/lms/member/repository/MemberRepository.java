package com.zerobase.lms.member.repository;

import com.zerobase.lms.member.entity.Member_entity;

import org.springframework.data.jpa.repository.JpaRepository;
public interface MemberRepository extends JpaRepository<Member_entity, String>{
}
//인터페이스 만들면 자동으로 정보 저장됨