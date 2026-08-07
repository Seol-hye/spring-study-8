package com.app.controller.study.quiz.quiz09;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/quiz09")
public class Quiz09Controller {
	
	@GetMapping("/listTest")
	public String listTest(@RequestParam(name = "type", required = false) String type) {
		
		if("member".equals(type)) {
			return "forward:/quiz07/listTest/member";
		}
		
		if("str".equals(type)) {
			return "redirect:/quiz07/listTest/member";
		}
		
		return "quiz/quiz07/listTest";
	}

}
