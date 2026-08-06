package com.app.controller.study.quiz.quiz07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 생성자
public class Member {

	String id;
	String pw;
	String name;

//	public Member() {}
//
//	public Member(String id, String pw, String name) {
//		this.id = id;
//		this.name = name;
//		this.pw = pw;
//	}

}
