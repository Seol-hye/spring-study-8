package com.app.controller.study.quiz.quiz14;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Configuration
public class Quiz14Configuration {

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class CoffeeBean {
		private String name;
	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class CupBean {
		private CoffeeBean coffeeBean;
		
		@Override
        public String toString() {
            return "컵에 담긴 음료의 이름: " + coffeeBean.getName();
        }
	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class DessertBean {
		private String name;
	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class PlateBean {
		private DessertBean dessertBean;
		
		@Override
        public String toString() {
            return "접시에 담긴 디저트의 이름: " + dessertBean.getName();
        }
	}

	// Bean 등록 설정
	
	//CoffeeBean coffeeBean = new CoffeeBean();
	@Bean
	public CoffeeBean coffeeBean() {
		return new CoffeeBean("민트초코프라페");
	}

//	@Bean
//	public CupBean cupBean() {
//		return new CupBean(coffeeBean());
//	}
	
	@Bean
	public CupBean cupBean(CoffeeBean coffeeBean) {
		return new CupBean(coffeeBean);
	}

	@Bean
	public DessertBean dessertBean() {
		return new DessertBean("당근케이크");
	}

//	@Bean
//	public PlateBean plateBean() {
//		return new PlateBean(dessertBean());
//	}
	
	@Bean
	public PlateBean plateBean(DessertBean dessertBean) {
		return new PlateBean(dessertBean);
	}

}
