package com.app.controller.study.quiz.quiz03;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/quiz03")
public class Quiz03Controller {
	
	@GetMapping("/request1-1")
	public String request1(HttpServletRequest request) {

		//http://localhost:8080/quiz03/request1-1?item=americano&type=coffee
		
//	    String item = request.getParameter("item");
//	    String type = request.getParameter("type");

		System.out.println("/request1-1 ==============");
	    System.out.println( request.getParameter("item") );
	    System.out.println( request.getParameter("type") );

	    return "quiz/quiz03/req";
	}
	
	@GetMapping("/request1-2")
	public String request2(@RequestParam String item, @RequestParam String type) {

		System.out.println("/request1-2 ==============");
	    System.out.println(item);
	    System.out.println(type);

	    return "quiz/quiz03/req";
	}
	
	@GetMapping("/request1-3")
	public String request3(@RequestParam Map<String, String> map) {

		System.out.println("/request1-3 ==============");
	    System.out.println(map.get("item"));
	    System.out.println(map.get("type"));
	    
	    //System.out.println(map);

	    return "quiz/quiz03/req";
	}
	
	@GetMapping("/request1-4")
	public String request4(Quiz03DTO dto) {
		
		System.out.println("/request1-4 ==============");
	    System.out.println(dto.getItem());
	    System.out.println(dto.getType());
		
		//System.out.println(dto);
		
		return "quiz/quiz03/req";
	}
	
	@GetMapping("/viewData1-1")
	public String viewData1(HttpServletRequest request) {

		//http://localhost:8080/quiz03/viewData1-1
		
		request.setAttribute("name", "아메리카노");
		request.setAttribute("type", "커피");

		return "quiz/quiz03/req";
	}
	
	@GetMapping("/viewData1-2")
	public String viewData2(Model model) {

	    model.addAttribute("name", "카페라떼");
	    model.addAttribute("type", "커피");

	    return "quiz/quiz03/req";
	}
	
	@GetMapping("/viewData1-3")
	public ModelAndView viewData3() {

	    ModelAndView mav = new ModelAndView();

	    mav.setViewName("quiz/quiz03/req");
	    mav.addObject("name", "녹차");
	    mav.addObject("type", "차");

	    return mav;
	}
	
	@GetMapping("/viewData1-4")
	public String viewData4(Model model) {

	    DrinkItemDTO drinkItem = new DrinkItemDTO();
	    drinkItem.setName("허브티");
	    drinkItem.setType("차");
	    
	    System.out.println(drinkItem);

	    model.addAttribute("drinkItem", drinkItem);

	    return "quiz/quiz03/req";
	}


}
