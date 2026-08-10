package com.app.controller.study.quiz.quiz12;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/quiz12")
public class Quiz12Controller {

	// 경로 1) /quiz12/login (GET)
	@GetMapping("/login")
	public String login() {

		return "quiz/quiz12/login";
	}

	// 경로 1) /quiz12/login (POST)
	@PostMapping("/login")
	public String login(@RequestParam("id") String id, @RequestParam("pw") String pw, HttpSession session) {

		session.setAttribute("id", id);
		session.setAttribute("count", 0);

		return "redirect:/quiz12/count";
	}

	// 경로 2) /quiz12/count
	@GetMapping("/count")
	public String count(HttpSession session, Model model) {

		String id = (String) session.getAttribute("id");

		if (id == null) {
			id = "손님(비로그인)";

		}

		Integer count = (Integer) session.getAttribute("count");

		if (count == null) {

			count = 0;
		}

		count++;

		session.setAttribute("count", count);

		model.addAttribute("count", count);
		model.addAttribute("id", id);

		return "quiz/quiz12/count";

	}

	// 경로 3) /quiz12/logout
	@GetMapping("/logout")
	public String logout(HttpSession session) {

		session.invalidate();

		return "redirect:/quiz12/count";
	}

}
