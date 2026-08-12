package com.app.controller.study.quiz.quiz14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.controller.study.quiz.quiz14.Quiz14Configuration.CupBean;
import com.app.controller.study.quiz.quiz14.Quiz14Configuration.PlateBean;


@Controller
@RequestMapping("/quiz14")
public class Quiz14Controller {
	
	//의존성 주입
	
	@Autowired
	CupBean cupBean;
	
	@Autowired
	PlateBean plateBean;
	
	@GetMapping("/fullOrder")
	public String full_order() {
		
		System.out.println("============full_order============");
		System.out.println(cupBean);
		System.out.println(plateBean);
		return "quiz/quiz14/result";
	}
	
	@GetMapping("/orderCoffee")
	public String order_coffee() {
		
		System.out.println("============order_coffee============");
		System.out.println(cupBean);
		return "quiz/quiz14/result";
	}
	
	@GetMapping("/orderDessert")
	public String order_dessert() {
		
		System.out.println("============order_dessert============");
		System.out.println(plateBean);
		return "quiz/quiz14/result";
	}
	

}
