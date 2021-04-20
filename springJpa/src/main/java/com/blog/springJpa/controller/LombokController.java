package com.blog.springJpa.controller;

import com.blog.springJpa.repository.LombokRepository;
import com.blog.springJpa.vo.LombokTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
@Api(tags="Lombok")
public class LombokController {


	@Autowired
	LombokRepository lombokRepositroy;

	@GetMapping("/lombok")
	@ApiOperation(value = "lombok 전체 조회")
	public List<LombokTest> getAllMember(){
		System.out.println("lombok 실행");
		lombokRepositroy.findAll().stream().map(LombokTest::getName).forEach(s -> System.out.println(s));
		return lombokRepositroy.findAll();
	}

}