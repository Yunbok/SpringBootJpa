package com.blog.springJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.springJpa.repository.BoardRepository;
import com.blog.springJpa.repository.MemberRepository;
import com.blog.springJpa.vo.Board;
import com.blog.springJpa.vo.Member;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/")
public class BoardController {

	@Autowired
	BoardRepository boardRepositroy;
	
	@Autowired
	MemberRepository memberRepositroy;
	
	
	@GetMapping("/board")
	List<Board> getBoardList(Model model){
		//model.addAttribute("board", board);
		List<Member> memberList = memberRepositroy.findAll();
		model.addAttribute("memberList", memberList);
        System.out.println("들어오긴함");
        
        
		return boardRepositroy.findAll();
    }
	
	
	@PutMapping("/board")
	@ApiOperation(value = "글 작성", tags = "input")
	public Board createMember(@RequestBody Board board){
		System.out.println("input 실행");
		System.out.println(board.getTitle());
		if(board.getUpdateTime() == null) {
			board.localSetUpdateTime();
		}
		Board newBoard = boardRepositroy.save(board);
		
		return newBoard;
	}
	
	@PostMapping("/board/title")
	public List<Board> getTitle(@RequestBody Board board){
		
		return boardRepositroy.findByTitle(board.getTitle().toString());
	}
	
	
	@PostMapping("/board/likeTitle")
	public List<Board> getLikeTitle(@RequestBody Board board){
		
		return boardRepositroy.findByTitleLike("%" + board.getTitle().toString() + "%");
	}
}
