package com.blog.springJpa.vo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "member")
public class Member {

	@Id @GeneratedValue
	private long id;
	
	private String name;

	public Member() {}
	public Member(String string) {
		// TODO Auto-generated constructor stub
		  this.name = string;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Member member = (Member) o;
		return Objects.equals(id, member.id) &&
					Objects.equals(name,member.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}

	

}
