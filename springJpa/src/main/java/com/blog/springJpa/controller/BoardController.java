package com.blog.springJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.springJpa.repository.MemberRepository;
import com.blog.springJpa.vo.Board;
import com.blog.springJpa.vo.Member;

@Controller
public class BoardController {

	@Autowired
	MemberRepository memberRepositroy;
	
	@RequestMapping("/")
	String indexPage(Model model){
//		Board board = new Board(2, "테스트 제목", "배윤복2");
//		model.addAttribute("board", board);
		List<Member> memberList = memberRepositroy.findAll();
		model.addAttribute("memberList", memberList);
        System.out.println("들어오긴함");
        return "index";
    }
	
	
}
