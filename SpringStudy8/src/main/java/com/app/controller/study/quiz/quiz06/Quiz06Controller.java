package com.app.controller.study.quiz.quiz06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/quiz06")
public class Quiz06Controller {
	
	@GetMapping("/ask-bmi")
	public String ask_bmi() {
		
		return "quiz/quiz06/ask-bmi";
	}
	
	@PostMapping("/result-bmi")
	public String result_bmi(
			@RequestParam("name") String name,
			@RequestParam("height") double height,
			@RequestParam("weight") double weight, 
			Model model) {
		
		
		// cm -> m 변환
		double heightM = height /100.0;
		
		//신체질량지수(BMI) = 체중(kg) / [신장(m)]2
		double bmi = weight / (heightM * heightM);
		
		// 소수점 첫째 자리까지 반올림
        bmi = Math.round(bmi * 10.0) / 10.0;
        
        //요청에 따라서 컨트롤러가 비만도를 계산해서 결과
        String result;
        if(bmi < 18.5) {
        	result = "저체중";
        } else if(bmi < 23.0) {
        	result = "정상체중";
        } else if(bmi < 25.0) {
        	result = "과체중";
        } else if(bmi < 30.0) {
        	result = "비만";
        } else { // 30.0 이상
        	result = "고도비만";
        }
		
		
		model.addAttribute("name", name);
		model.addAttribute("height", height);
		model.addAttribute("weight", weight);
		model.addAttribute("bmi", bmi);
		model.addAttribute("result", result);
		
		return "quiz/quiz06/result-bmi";
	}

}
