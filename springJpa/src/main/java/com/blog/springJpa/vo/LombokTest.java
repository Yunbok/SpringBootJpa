package com.blog.springJpa.vo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "lombok_test")
@Getter
@Setter
@ToString(exclude="id")
public class LombokTest {

    @Id
    private String id;
    private String name;
}
