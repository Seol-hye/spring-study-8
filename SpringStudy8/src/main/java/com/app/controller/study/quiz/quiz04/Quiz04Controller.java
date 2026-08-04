package com.app.controller.study.quiz.quiz04;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/quiz04")
public class Quiz04Controller {

	@GetMapping("/request1-1")
	public String request1_1(HttpServletRequest request) {

		// localhost:8080/quiz04/request1-1?category=100&product=4000

		System.out.println("/request1-1 ==============");
		System.out.println(request.getParameter("category"));
		System.out.println(request.getParameter("product"));

		return "quiz/quiz04/req";
	}

	@GetMapping("/request1-2")
	public String request1_2(@RequestParam int category, @RequestParam int product) {

		System.out.println("/request1-2 ==============");
		System.out.println(category);
		System.out.println(product);

		return "quiz/quiz04/req";
	}

	@GetMapping("/request1-3")
	public String request1_3(Response req) {

		System.out.println("/request1-3 ==============");
		System.out.println(req.getCategory());
		System.out.println(req.getProduct());

		return "quiz/quiz04/req";
	}

	@GetMapping("/request1-4")
	public String request1_4(@RequestParam Map<String, String> paramMap) {

		System.out.println("/request1-4 ==============");
		System.out.println(paramMap.get("category"));
		System.out.println(paramMap.get("product"));

		return "quiz/quiz04/req";
	}

	@GetMapping("/viewData1-1")
	public String viewData1_1(HttpServletRequest request) {

		// localhost:8080/quiz04/viewData1-1

		request.setAttribute("response001", "001값");
		request.setAttribute("response099", "099값");

		return "quiz/quiz04/viewData";
	}

	@GetMapping("/viewData1-2")
	public String viewData1_2(Model model) {

		model.addAttribute("response001", "model001값");
		model.addAttribute("response099", "model099값");

		return "quiz/quiz04/viewData";
	}

	@GetMapping("/viewData1-3")
	public ModelAndView viewData1_3() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("quiz/quiz04/viewData");

		mav.addObject("response001", "mav001값");
		mav.addObject("response099", "mav099값");

		return mav;
	}

	@GetMapping("/viewData1-4")
	public String viewData1_4(@ModelAttribute("transferItem") TransferItem transferItem) {

		transferItem.setValue001("value001");
		transferItem.setValue099("value099");

		return "quiz/quiz04/viewData";
	}

	@GetMapping("/viewData1-5")
	public String viewData1_5(Model model) {

		model.addAttribute("response001", "model001값");
		model.addAttribute("response099", "model099값");

		TransferItem transferItem = new TransferItem();
		transferItem.setValue001("value001");
		transferItem.setValue099("value099");

		model.addAttribute("transferItem", transferItem);

		return "quiz/quiz04/viewData";
	}

}
