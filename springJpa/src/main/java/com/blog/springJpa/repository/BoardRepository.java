package com.blog.springJpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.springJpa.vo.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {

	List<Board> findByTitle(String title);
	
	
	List<Board> findByTitleLike(String title);
}
