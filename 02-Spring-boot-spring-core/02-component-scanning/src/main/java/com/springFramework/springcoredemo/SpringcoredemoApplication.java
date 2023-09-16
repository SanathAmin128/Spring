package com.springFramework.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//below we mention explicitly the package
//@SpringBootApplication(
//		scanBasePackages = {"com.springFramework.springcoredemo",
//		                     "com.springFramework.util"}
//)
@SpringBootApplication()
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
