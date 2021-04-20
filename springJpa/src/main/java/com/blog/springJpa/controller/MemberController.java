package com.blog.springJpa.controller;

import java.util.List;
import java.util.Optional;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.springJpa.repository.MemberRepository;
import com.blog.springJpa.vo.Member;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/")
@Api(tags="Member")
public class MemberController {


	@Autowired
	MemberRepository memberRepositroy;

	@GetMapping("/member")
	@ApiOperation(value = "사용자 목록 전체 조회")
	public List<Member> getAllMember(){
		System.out.println("get 실행");
		return memberRepositroy.findAll();
	}
	
	@GetMapping("/member/{id}")
	@ApiOperation(value = "사용자 단일 조회")
	public Member getMember(@PathVariable String id){
		Long  memberId = Long.parseLong(id);
		System.out.println(memberId);
		Optional<Member> member = memberRepositroy.findById(memberId);
		
		
		System.out.println(member.map(user -> user.getName()));
		System.out.println(member.get());
		System.out.println(member);
		
		return member.get();
	}
	
	@PostMapping("/member/{id}")
	@ApiOperation(value = "사용자 수정")
	public Member updateMember(@PathVariable String id , @RequestBody Member newMember){
		Long  memberId = Long.parseLong(id);
		System.out.println("post실행");
		Optional<Member> member = memberRepositroy.findById(memberId);
		
		member.get().setName(newMember.getName());
		
		
		memberRepositroy.save(member.get());
		
		return member.get();
	}
	@PutMapping("/member")
	@ApiOperation(value = "사용자 생성")
	public Member createMember(@RequestBody Member member){
		System.out.println("input 실행");
		System.out.println(member.getName());

		return memberRepositroy.save(member);
	}
	
	@DeleteMapping("/member/{id}")
	@ApiOperation(value = "사용자 삭제")
	public String deleteMember(@PathVariable String id){
		Long memberID = Long.parseLong(id);
		System.out.println("delete실행");
		memberRepositroy.deleteById(memberID);
		
		return "delete Success!";
	}
	
}