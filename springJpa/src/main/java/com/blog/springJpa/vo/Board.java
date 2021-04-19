package com.blog.springJpa.vo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "board")
public class Board {
		@Id @GeneratedValue
	 	private int no;
	    private String title;
	    private String writer;
	    
	    @CreationTimestamp
	    private LocalDateTime updateTime;

	    Board(){}

	    public Board(int no, String title, String writer) {
	        this.no = no;
	        this.title = title;
	        this.writer = writer;
	        this.updateTime = LocalDateTime.now();
	    }
	    
	    
		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getWriter() {
			return writer;
		}

		public void setWriter(String writer) {
			this.writer = writer;
		}

		public LocalDateTime getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(LocalDateTime updateTime) {
			this.updateTime = updateTime;
		}
		
		public void localSetUpdateTime() {
			this.updateTime = LocalDateTime.now();
		}
		
}
