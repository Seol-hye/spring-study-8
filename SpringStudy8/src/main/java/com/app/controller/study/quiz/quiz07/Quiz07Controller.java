package com.app.controller.study.quiz.quiz07;

import java.util.ArrayList;
import java.util.List;
import com.app.controller.study.quiz.quiz07.Member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/quiz07")
public class Quiz07Controller {
	
	@GetMapping("/listTest")
	public String listTest(@RequestParam(name = "type", required = false) String type,
			Model model) {
		
		if(type.equals("str")) {
			List<String> strList = new ArrayList<>();
			for(int i=0; i<10; i++) {
				strList.add("스트링 리스트입니다.");
			}
			model.addAttribute("list", strList);
			
		} else if (type.equals("member")) {
			List<Member> memberList = new ArrayList<>();
			for (int i=1; i<=5; i++) {
				memberList.add(new Member("아이디" + i, "비번" + i, "이름" + i));
			}
			model.addAttribute("mlist", memberList);
		}
		
		model.addAttribute("type", type);
		
		return "quiz/quiz07/listTest";
	}

}
