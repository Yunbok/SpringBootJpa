package com.blog.springJpa.repository;

import com.blog.springJpa.vo.LombokTest;
import com.blog.springJpa.vo.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LombokRepository extends JpaRepository<LombokTest, Long> {

	//Member findMemberByName(String name);
}
