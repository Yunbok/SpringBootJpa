package com.blog.springJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.springJpa.vo.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

	//Member findMemberByName(String name);
}
