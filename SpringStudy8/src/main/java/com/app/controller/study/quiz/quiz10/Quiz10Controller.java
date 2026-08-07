package com.app.controller.study.quiz.quiz10;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz10")
public class Quiz10Controller {
	
	@GetMapping("/A")
	public String a(HttpSession session, HttpServletRequest request) {
		
		request.setAttribute("fromA", "FromA");
		request.setAttribute("originalA", "OriginalA");
		
		return "quiz/quiz10/a";
	}
	
	@GetMapping("/B")
	public String b(HttpSession session, HttpServletRequest request) {
		
		request.setAttribute("fromB", "FromB");
		request.setAttribute("originalB", "OriginalB");
		
		session.setAttribute("fromB", "FromB");
		
		return "quiz/quiz10/b";
	}
	

}
