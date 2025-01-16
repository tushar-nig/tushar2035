package com.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;

@SpringBootApplication
public class CrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
	}

	/**
	 Instead of making bean of ModelMapper bean here we create it in config package, because it is a best practice
	@Bean
	public ModelMapper getMapper(){
		return new ModelMapper();
	}
	 */
}
