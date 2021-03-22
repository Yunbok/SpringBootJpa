package com.blog.springJpa.vo;

import java.time.LocalDateTime;

public class Board {

	 private int no;
	    private String title;
	    private String writer;
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
}
